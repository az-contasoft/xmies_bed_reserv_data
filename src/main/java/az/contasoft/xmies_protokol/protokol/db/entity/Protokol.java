package az.contasoft.xmies_protokol.protokol.db.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

public class Protokol implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idProtokol;
    private long idPatient;
    private long idDepartment;
    private long idPersonal;
    private long idComingTypeProperty;
    private long idXidmetlerOrPaket;
    private long idXidmetlerOrPaketByPropertyType;
    private long idSigortaMuqavile;
    private String assuranceNo;
    private long idForwarder;
    private LocalDateTime createdTime;
    private LocalDateTime closedDate;
    private String note;
    private long idPersonalDeletedBy;
    private int isActive;
    private int isDelete;

    public Protokol() {
    }

    public Protokol(long idPatient, long idDepartment, long idPersonal, long idComingTypeProperty, long idXidmetlerOrPaket, long idXidmetlerOrPaketByPropertyType, long idSigortaMuqavile, String assuranceNo, long idForwarder, LocalDateTime createdTime, LocalDateTime closedDate, String note, long idPersonalDeletedBy, int isActive, int isDelete) {
        this.idPatient = idPatient;
        this.idDepartment = idDepartment;
        this.idPersonal = idPersonal;
        this.idComingTypeProperty = idComingTypeProperty;
        this.idXidmetlerOrPaket = idXidmetlerOrPaket;
        this.idXidmetlerOrPaketByPropertyType = idXidmetlerOrPaketByPropertyType;
        this.idSigortaMuqavile = idSigortaMuqavile;
        this.assuranceNo = assuranceNo;
        this.idForwarder = idForwarder;
        this.createdTime = createdTime;
        this.closedDate = closedDate;
        this.note = note;
        this.idPersonalDeletedBy = idPersonalDeletedBy;
        this.isActive = isActive;
        this.isDelete = isDelete;
    }

    public long getIdProtokol() {
        return idProtokol;
    }

    public void setIdProtokol(long idProtokol) {
        this.idProtokol = idProtokol;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public long getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(long idDepartment) {
        this.idDepartment = idDepartment;
    }

    public long getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(long idPersonal) {
        this.idPersonal = idPersonal;
    }

    public long getIdComingTypeProperty() {
        return idComingTypeProperty;
    }

    public void setIdComingTypeProperty(long idComingTypeProperty) {
        this.idComingTypeProperty = idComingTypeProperty;
    }

    public long getIdXidmetlerOrPaket() {
        return idXidmetlerOrPaket;
    }

    public void setIdXidmetlerOrPaket(long idXidmetlerOrPaket) {
        this.idXidmetlerOrPaket = idXidmetlerOrPaket;
    }

    public long getIdXidmetlerOrPaketByPropertyType() {
        return idXidmetlerOrPaketByPropertyType;
    }

    public void setIdXidmetlerOrPaketByPropertyType(long idXidmetlerOrPaketByPropertyType) {
        this.idXidmetlerOrPaketByPropertyType = idXidmetlerOrPaketByPropertyType;
    }

    public long getIdSigortaMuqavile() {
        return idSigortaMuqavile;
    }

    public void setIdSigortaMuqavile(long idSigortaMuqavile) {
        this.idSigortaMuqavile = idSigortaMuqavile;
    }

    public String getAssuranceNo() {
        return assuranceNo;
    }

    public void setAssuranceNo(String assuranceNo) {
        this.assuranceNo = assuranceNo;
    }

    public long getIdForwarder() {
        return idForwarder;
    }

    public void setIdForwarder(long idForwarder) {
        this.idForwarder = idForwarder;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getIdPersonalDeletedBy() {
        return idPersonalDeletedBy;
    }

    public void setIdPersonalDeletedBy(long idPersonalDeletedBy) {
        this.idPersonalDeletedBy = idPersonalDeletedBy;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Protokol{" +
                "idProtokol=" + idProtokol +
                ", idPatient=" + idPatient +
                ", idDepartment=" + idDepartment +
                ", idPersonal=" + idPersonal +
                ", idComingTypeProperty=" + idComingTypeProperty +
                ", idXidmetlerOrPaket=" + idXidmetlerOrPaket +
                ", idXidmetlerOrPaketByPropertyType=" + idXidmetlerOrPaketByPropertyType +
                ", idSigortaMuqavile=" + idSigortaMuqavile +
                ", assuranceNo='" + assuranceNo + '\'' +
                ", idForwarder=" + idForwarder +
                ", createdTime=" + createdTime +
                ", closedDate=" + closedDate +
                ", note='" + note + '\'' +
                ", idPersonalDeletedBy=" + idPersonalDeletedBy +
                ", isActive=" + isActive +
                ", isDelete=" + isDelete +
                '}';
    }
}