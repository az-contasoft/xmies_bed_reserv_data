package az.contasoft.xmies_protokol_data.api.searchServices.internal;

import az.contasoft.xmies_paket.db.entity.Paket;
import az.contasoft.xmies_patient.api.infoService.internal.PatientInfo;
import az.contasoft.xmies_personal_data.entities.PersonalData;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_protokol.protokol.db.entity.Protokol;
import az.contasoft.xmies_sigorta_muqavile_data.api.searchServices.internal.SigortaMuqavileData;
import az.contasoft.xmies_xidmetler.db.entity.Xidmetler;

import java.io.Serializable;

public class ProtokolData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Paket paket;
    private Protokol protokol;
    private PersonalData personal;
    private PersonalData yonlendirenPersonal;
    private PatientInfo patient;
    private Properties comingType;
    private Properties department;
    private SigortaMuqavileData sigortaMuqavileData;
    private Xidmetler xidmetler;

    public ProtokolData() {
    }

    public ProtokolData(Paket paket, Protokol protokol, PersonalData personal, PersonalData yonlendirenPersonal, PatientInfo patient, Properties comingType, Properties department, SigortaMuqavileData sigortaMuqavileData, Xidmetler xidmetler) {
        this.paket = paket;
        this.protokol = protokol;
        this.personal = personal;
        this.yonlendirenPersonal = yonlendirenPersonal;
        this.patient = patient;
        this.comingType = comingType;
        this.department = department;
        this.sigortaMuqavileData = sigortaMuqavileData;
        this.xidmetler = xidmetler;
    }

    public Paket getPaket() {
        return paket;
    }

    public void setPaket(Paket paket) {
        this.paket = paket;
    }

    public Protokol getProtokol() {
        return protokol;
    }

    public void setProtokol(Protokol protokol) {
        this.protokol = protokol;
    }

    public PersonalData getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalData personal) {
        this.personal = personal;
    }

    public PersonalData getYonlendirenPersonal() {
        return yonlendirenPersonal;
    }

    public void setYonlendirenPersonal(PersonalData yonlendirenPersonal) {
        this.yonlendirenPersonal = yonlendirenPersonal;
    }

    public PatientInfo getPatient() {
        return patient;
    }

    public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }

    public Properties getComingType() {
        return comingType;
    }

    public void setComingType(Properties comingType) {
        this.comingType = comingType;
    }

    public Properties getDepartment() {
        return department;
    }

    public void setDepartment(Properties department) {
        this.department = department;
    }

    public SigortaMuqavileData getSigortaMuqavileData() {
        return sigortaMuqavileData;
    }

    public void setSigortaMuqavileData(SigortaMuqavileData sigortaMuqavileData) {
        this.sigortaMuqavileData = sigortaMuqavileData;
    }

    public Xidmetler getXidmetler() {
        return xidmetler;
    }

    public void setXidmetler(Xidmetler xidmetler) {
        this.xidmetler = xidmetler;
    }

    @Override
    public String toString() {
        return "ProtokolData{" +
                "paket=" + paket +
                ", protokol=" + protokol +
                ", PersonalData=" + personal +
                ", yonlendirenPersonal=" + yonlendirenPersonal +
                ", PatientInfo=" + patient +
                ", comingType=" + comingType +
                ", department=" + department +
                ", sigortaMuqavileData=" + sigortaMuqavileData +
                ", xidmetler=" + xidmetler +
                '}';
    }
}