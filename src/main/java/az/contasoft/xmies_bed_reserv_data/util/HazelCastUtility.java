package az.contasoft.xmies_bed_reserv_data.util;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_bed_reserv_data.proxy.BedReservProxy;
import az.contasoft.xmies_bed_reserv_data.proxy.PropertiesProxy;
import az.contasoft.xmies_bed_reserv_data.proxy.ProtokolDataProxy;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import az.contasoft.xmies_protokol_data.api.searchServices.internal.ProtokolData;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import com.hazelcast.client.HazelcastClient;
//import com.hazelcast.client.config.ClientConfig;
//import com.hazelcast.core.Hazelcast;
//import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.core.IList;
//import org.springframework.boot.autoconfigure.web.ResourceProperties;
//import org.springframework.http.ResponseEntity;

@Component
public class HazelCastUtility {
    private static Logger logger = LoggerFactory.getLogger("HazelCastUtility");


    @Autowired
    IMap<Long, Properties> mapOfProperties;
    @Autowired
    IMap<Long, BedData> mapOfBedData;
    @Autowired
    IMap<Long, Protokol> mapOfProtokol;

    @Autowired
    PropertiesProxy propertiesProxy;

    @Autowired
    ProtokolDataProxy protokolDataProxy;

    private  IMap<Long, BedReserv> mapOfBedReserv;
    private final BedReservProxy bedReservProxy;

    public HazelCastUtility(IMap<Long, BedReserv> mapOfBedReserv, BedReservProxy bedReservProxy) {
        this.mapOfBedReserv = mapOfBedReserv;
        this.bedReservProxy = bedReservProxy;
    }

    public IMap<Long, BedData> getMapOfBedData() {
        return mapOfBedData;
    }

    private ProtokolData getProtokolData(long idProtokol) {
        try {
            ProtokolData protokolData;
            ResponseEntity<ProtokolData> responseEntity = protokolDataProxy.getProtokolData(idProtokol);
            if (responseEntity.getStatusCodeValue() == 200 && responseEntity.getBody() != null) {
                protokolData = responseEntity.getBody();
                logger.info("ProtokolData from proxy {}", protokolData);
                return protokolData;
            }
            return null;
        } catch (Exception e) {
            logger.error("Error getting ListOfProtokolData " + e, e);
            return null;
        }
    }

    public Properties getProperty(long idProperty) {
        logger.info("{}", "****************** getting map for properties from hazelcast ***************");
        try {
            Properties properties = mapOfProperties.get(idProperty);
            if (properties == null) {
                ResponseEntity<Properties> response = propertiesProxy.getByIdProperties(idProperty);
                if (response.getStatusCodeValue() == 200) {
                    response.getBody();
                }
            }
            return properties;
        } catch (Exception e) {
            logger.error("Error {} : {}", "get property from hazelCast", e, e);
            return null;
        }
    }

    public List<BedData> getListOfBedData() {
        logger.info("{}", "Getting BedData from hazel cast");
        if (mapOfBedData.isEmpty()) {
            startCaching();
        }
        try {
            List<BedData> list = new ArrayList<>();
            for (Long id : mapOfBedData.keySet()) {
                list.add(mapOfBedData.get(id));
            }

            return list;
        } catch (Exception e) {
            logger.error("Error {} : {}", "sending list of BedData ", e, e);
            return null;
        }
    }

    public List<BedData> getListOfBedData(long idProtocol) {
        logger.info("{}", "Getting BedData from hazel cast");
        if (mapOfBedData.isEmpty()) {
            startCaching();
        }
        try {
            List<BedData> list = new ArrayList<>();
            for (BedData data : mapOfBedData.values()) {
                if(data.getProtokolData().getProtokol().getIdProtokol()==idProtocol){
                    list.add(data);
                }
            }

            return list;
        } catch (Exception e) {
            logger.error("Error {} : {}", "sending list of BedData ", e, e);
            return null;
        }
    }

    private IMap<Long, BedReserv> getMapOfBedReserv() {
        try {
            if (mapOfBedReserv == null || mapOfBedReserv.isEmpty()) {
                logger.info(" mapOfBedReserv empty in hazel");
                ResponseEntity<IMap<Long, BedReserv>> responseEntity = bedReservProxy.getAlAsMap();
                if (responseEntity.getStatusCodeValue() == 200 && responseEntity.getBody() != null) {
                    return responseEntity.getBody();
                }
            }
            return mapOfBedReserv;
        } catch (Exception e) {
            logger.error("Error getting mapOfBedReserv " + e, e);
            return null;
        }
    }
    public BedData getBedDataFromHazelCast(long idProtokol) {
        logger.info("{}", "Trying to get BedData from hazel cast");
        if (mapOfBedData.isEmpty()) {
            startCaching();
        }
        return mapOfBedData.get(idProtokol);
    }


    private void collectBedReservData(){
        try {
            logger.info("trying to get BedReservData from hazelcast");
            Map<Long, BedReserv> bedReservMap = getMapOfBedReserv();
            assert bedReservMap != null;
            logger.info("bedReservMap" + bedReservMap.size());
            for (Long idBedReserv : bedReservMap.keySet()) {

                BedData bedData = new BedData();

                BedReserv bedReserv = bedReservMap.get(idBedReserv);
                bedData.setBedReserv(bedReserv);
                logger.info("BedReserv-nu aldig : {}", bedReserv);

                Properties properties = getProperty(bedReserv.getIdProBed());
                bedData.setProperties(properties);
                logger.info("Properties-i aldig : {}", properties);

                ProtokolData protokolData = getProtokolData(bedReserv.getIdProtokol());
                bedData.setProtokolData(protokolData);
                logger.info("ProtokolData-ni aldig : {}", protokolData);

                assert protokolData != null;
                mapOfBedData.put(protokolData.getProtokol().getIdProtokol(), bedData);


            }
        }catch (Exception e){
            logger.error("Error bedData : {}, : {}",e,e);
        }
    }

    public void startCaching() {
        mapOfBedData.clear();
        mapOfBedData.destroy();
        collectBedReservData();
    }


}
