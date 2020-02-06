package az.contasoft.xmies_bed_reserv_data.api.internal;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import az.contasoft.xmies_protokol_data.api.searchServices.internal.ProtokolData;

import java.io.Serializable;

public class BedData implements Serializable {

    private static final long serialVersionUID = 1L;
    private ProtokolData protokolData;
     private Properties properties;
     private BedReserv bedReserv;

    public BedData() {
    }

    public BedData(ProtokolData protokolData, Properties properties, BedReserv bedReserv) {
        this.protokolData = protokolData;
        this.properties = properties;
        this.bedReserv = bedReserv;
    }

    @Override
    public String toString() {
        return "BedData{" +
                "protokolData=" + protokolData +
                ", properties=" + properties +
                ", bedReserv=" + bedReserv +
                '}';
    }

    public ProtokolData getProtokolData() {
        return protokolData;
    }

    public void setProtokolData(ProtokolData protokolData) {
        this.protokolData = protokolData;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public BedReserv getBedReserv() {
        return bedReserv;
    }

    public void setBedReserv(BedReserv bedReserv) {
        this.bedReserv = bedReserv;
    }
}
