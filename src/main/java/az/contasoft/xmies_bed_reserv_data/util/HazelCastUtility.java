package az.contasoft.xmies_bed_reserv_data.util;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_bed_reserv_data.proxy.PropertiesProxy;
import az.contasoft.xmies_bed_reserv_data.proxy.ProtokolProxy;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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
    ProtokolProxy protokolProxy;


    @PostConstruct
    public void init() {
        startCaching();
    }


    public Properties getPropertyFromHazelCast(long idProperty) {
        logger.info("{}", "****************** getting map for properties from hazelcast ***************");
        try {
            Properties properties = mapOfProperties.get(idProperty);
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
                if(data.getProtokol().getIdProtokol()==idProtocol){
                    list.add(data);
                }
            }

            return list;
        } catch (Exception e) {
            logger.error("Error {} : {}", "sending list of BedData ", e, e);
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


    public void startCaching() {

    }


}
