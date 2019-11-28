package az.contasoft.xmies_bed_reserv_data.util;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public Config config() {
        return new Config();
    }

    @Bean
    public HazelcastInstance instance(Config config) {
        return Hazelcast.newHazelcastInstance(config);
    }

    @Bean
    public IMap<Long, Properties> mapOfProperties(HazelcastInstance instance) {
        return instance.getMap("mapOfProperties");
    }

    @Bean
    public IMap<Long, BedReserv> mapOfBedReserv(HazelcastInstance instance) {
        return instance.getMap("mapOfBedReserv");
    }

    @Bean
    public IMap<Long, Protokol> mapOfProtokol(HazelcastInstance instance) {
        return instance.getMap("mapOfProtokol");
    }


    @Bean
    public IMap<Long, BedData> mapOfBedData(HazelcastInstance instance) {
        return instance.getMap("mapOfBedData");
    }


}
