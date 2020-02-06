package az.contasoft.xmies_bed_reserv_data.util;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcatMapConfigurations {


    @Value("${hazelcast.map.mapOfProperties}")
    private String mapOfProperties;


    @Value("${hazelcast.map.mapOfBedReserv}")
    private String mapOfBedReserv;

    @Value("${hazelcast.map.mapOfProtokol}")
    private String mapOfProtokol;


    @Value("${hazelcast.map.mapOfBedData}")
    private String mapOfBedData;

    public HazelcatMapConfigurations() {
    }

    public String getMapOfProperties() {
        return mapOfProperties;
    }

    public void setMapOfProperties(String mapOfProperties) {
        this.mapOfProperties = mapOfProperties;
    }

    public String getMapOfBedReserv() {
        return mapOfBedReserv;
    }

    public void setMapOfBedReserv(String mapOfBedReserv) {
        this.mapOfBedReserv = mapOfBedReserv;
    }

    public String getMapOfProtokol() {
        return mapOfProtokol;
    }

    public void setMapOfProtokol(String mapOfProtokol) {
        this.mapOfProtokol = mapOfProtokol;
    }

    public String getMapOfBedData() {
        return mapOfBedData;
    }

    public void setMapOfBedData(String mapOfBedData) {
        this.mapOfBedData = mapOfBedData;
    }
}
