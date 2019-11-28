package az.contasoft.xmies_bed_reserv_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("az.contasoft.xmies_bed_reserv_data")
@SpringBootApplication
public class XmiesBedReservDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmiesBedReservDataApplication.class, args);
    }

}
