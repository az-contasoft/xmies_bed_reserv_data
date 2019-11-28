package az.contasoft.xmies_bed_reserv_data.api;



import az.contasoft.xmies_bed_reserv_data.api.internal.BedData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/searchServices")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/getBedData/{idProtocol}")
    public ResponseEntity<List<BedData>> getBedData(@PathVariable("idProtocol") long idProtocol) {
        logger.info("{}", "controller>>> getting list of personal from BedData...");
        return service.getBedDataList(idProtocol);
    }
}
