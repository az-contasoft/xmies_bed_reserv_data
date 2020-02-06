package az.contasoft.xmies_bed_reserv_data.proxy;

import az.contasoft.xmies_protokol_data.api.searchServices.internal.ProtokolData;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "xmies_protokol_data")
public interface ProtokolDataProxy {

    @GetMapping("/xmies_protokol_data/searchServices/protokolData/{idProtokol}")
    ResponseEntity<ProtokolData> getProtokolData(@PathVariable("idProtokol") long idProtokol);
}
