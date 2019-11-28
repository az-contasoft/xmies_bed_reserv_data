package az.contasoft.xmies_bed_reserv_data.proxy;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "xmies_bed_reserv")
public interface BedReservProxy {

    @GetMapping("xmies_bed_reserv/searchServices/getByIdProtokol/{idProtokol}")//todo bu url mi cagirmaliyam????????????????
     ResponseEntity<List<BedReserv>> getAllByIdPersonal(@PathVariable("idProtokol") long idProtokol);


}
