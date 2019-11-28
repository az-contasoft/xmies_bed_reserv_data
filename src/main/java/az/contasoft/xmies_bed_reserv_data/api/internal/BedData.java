package az.contasoft.xmies_bed_reserv_data.api.internal;

import az.contasoft.xmies_bed_reserv.db.entities.BedReserv;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;

public class BedData {
     private Protokol protokol;
     private Properties properties;
     private BedReserv bedReserv;

    public BedData() {
    }

    @Override
    public String toString() {
        return "BedData{" +
                "protokol=" + protokol +
                ", properties=" + properties +
                ", bedReserv=" + bedReserv +
                '}';
    }

    public Protokol getProtokol() {
        return protokol;
    }

    public void setProtokol(Protokol protokol) {
        this.protokol = protokol;
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

    public BedData(Protokol protokol, Properties properties, BedReserv bedReserv) {
        this.protokol = protokol;
        this.properties = properties;
        this.bedReserv = bedReserv;
    }
}
