package az.contasoft.xmies_bed_reserv_data.util;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    private final HazelcatMapConfigurations hazelcatMapConfigurations;

    public HazelcastConfiguration(HazelcatMapConfigurations hazelcatMapConfigurations) {
        this.hazelcatMapConfigurations = hazelcatMapConfigurations;
    }
        @Bean
    public Config config(){
        Config config = new Config();
        NetworkConfig network = config.getNetworkConfig();
        network.getJoin().getMulticastConfig().setEnabled(false);
        network.getJoin().getTcpIpConfig().setEnabled(true);
        network.setPortAutoIncrement(true);
        network.setPort(33001);
        network.getJoin().getTcpIpConfig().addMember("127.0.0.1");
        return config;
}


//    @Bean
//    public Config config() {
//        Config config = new Config();
//        NetworkConfig networkConfig = config.getNetworkConfig();
//        JoinConfig joinConfig = networkConfig.getJoin();
//        joinConfig.getMulticastConfig().setEnabled(true).addTrustedInterface("192.168.200.6");
//        return config;
//    }

    @Bean
    public HazelcastInstance instance(Config config) {
        return Hazelcast.newHazelcastInstance(config);
    }

    @Bean
    public IMap<Long, Properties> mapOfProperties(HazelcastInstance instance) {
        return instance.getMap(hazelcatMapConfigurations.getMapOfProperties());
    }

    @Bean
    public IMap<Long, BedReserv> mapOfBedReserv(HazelcastInstance instance) {
        return instance.getMap(hazelcatMapConfigurations.getMapOfBedReserv());
    }

    @Bean
    public IMap<Long, Protokol> mapOfProtokol(HazelcastInstance instance) {
        return instance.getMap(hazelcatMapConfigurations.getMapOfProtokol());
    }


    @Bean
    public IMap<Long, BedData> mapOfBedData(HazelcastInstance instance) {
        return instance.getMap(hazelcatMapConfigurations.getMapOfBedData());
    }


}
