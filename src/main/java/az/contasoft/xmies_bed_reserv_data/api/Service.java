package az.contasoft.xmies_bed_reserv_data.api;

import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_bed_reserv_data.util.HazelCastUtility;
//import az.contasoft.xmies_report_data.util.HazelcastUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public class Service {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final HazelCastUtility hazelcastUtility;


    public Service(HazelCastUtility hazelcastUtility) {
        this.hazelcastUtility = hazelcastUtility;
    }


public ResponseEntity<List<BedData>> getBedDataList(long idProtocol){
        try{
            logger.info("{}","trying to get list of reportDataList");
            List<BedData> list = hazelcastUtility.getListOfBedData(idProtocol);
            if (list.size()>0){
                logger.info("{}","getting list of BedData");
                return new ResponseEntity<>(list, HttpStatus.OK);
            }else {
                logger.info("{}","list didnt found");
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            }
        }catch (Exception e){
            logger.error("Error {} : {}","getting list of BedData",e,e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


}

public ResponseEntity<Map<Long,BedData>> getAllAsMap(){
        try {
            logger.info("{}","trying to get Map of BedDAtaMap");
            Map<Long, BedData> map = hazelcastUtility.getMapOfBedData();
            if (map == null|| map.isEmpty()){
                logger.info("{}","map not found");
                return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
            }else {
                logger.info("{}","getting mao of BedData");
                return new ResponseEntity<>(map,HttpStatus.OK);
            }
        }catch (Exception e){
            logger.error("Error bedDAta AllAsMap : {}, : {}",e,e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
}

    public ResponseEntity<String> startCaching() {
        hazelcastUtility.startCaching();
        return new ResponseEntity<>("Cached", HttpStatus.OK);
    }



}
