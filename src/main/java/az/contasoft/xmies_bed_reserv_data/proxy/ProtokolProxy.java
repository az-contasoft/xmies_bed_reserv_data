package az.contasoft.xmies_bed_reserv_data.proxy;

import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import com.hazelcast.core.IMap;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "xmies_protokol")
public interface ProtokolProxy {

    @GetMapping("/getAllMap")
    public ResponseEntity<IMap<Long, Protokol>> getAllMap();


}
