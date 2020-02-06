package az.contasoft.xmies_patient.api.infoService.internal;

import java.io.Serializable;

public class FullAddress implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String name;
    private Long id;

    public FullAddress() {
    }

    public FullAddress(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
