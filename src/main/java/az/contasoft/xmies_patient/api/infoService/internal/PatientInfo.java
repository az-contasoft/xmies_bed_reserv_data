package az.contasoft.xmies_patient.api.infoService.internal;

import az.contasoft.xmies_properties.db.entity.Properties;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.time.LocalDate;

public class PatientInfo implements Serializable {


    private static final long serialVersionUID = 1L;

    private long idPatient;
    private String patientNo;
    private String patientName;
    private String patientSurname;
    private String patientFatherName;
    private LocalDate patientBirthDate;   //tevelludu
    private Properties patientGenderProperty;    //cinsiyyeti
    private Properties patientTypeProperty;   //xeste tipi
    private Properties patientCitizenshipProperty;   //vetendashligi
    private Properties patientIdTypeProperty;      //kimlik tipi
    private String patientPinCode;   //fin
    private FullAddress idPatientBirthPlace;  //doguldugu yer  //TODO idbirthPlace etmeliyik?//id adress for flanshey
    private String patientMotherName;
    private String patientMotherSurname; //TODO ana soyad neye lazim?
    private FullAddress idPatientCurrentAddress;  //faktiki adresi
    private FullAddress idPatientRegistrationAddress;  //qeydiyyatd adresi
    private String barcode;
    private String details;

    private String patientHomePhoneNumber; //ev teli
    private String patientMobilePhoneNumber; //mobil teli
    private String patientEmail;
    private int isDelete;
    private long idPersonalDeletedBy;

    public PatientInfo(long idPatient, String patientNo, String patientName, String patientSurname, String patientFatherName, LocalDate patientBirthDate, Properties patientGenderProperty, Properties patientTypeProperty, Properties patientCitizenshipProperty, Properties patientIdTypeProperty, String patientPinCode, FullAddress idPatientBirthPlace, String patientMotherName, String patientMotherSurname, FullAddress idPatientCurrentAddress, FullAddress idPatientRegistrationAddress, String barcode, String patientHomePhoneNumber, String patientMobilePhoneNumber, String patientEmail, int isDelete, long idPersonalDeletedBy, String details) {
        this.patientNo = patientNo;
        this.idPatient = idPatient;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientFatherName = patientFatherName;
        this.patientBirthDate = patientBirthDate;
        this.patientGenderProperty = patientGenderProperty;
        this.patientTypeProperty = patientTypeProperty;
        this.patientCitizenshipProperty = patientCitizenshipProperty;
        this.patientIdTypeProperty = patientIdTypeProperty;
        this.patientPinCode = patientPinCode;
        this.idPatientBirthPlace = idPatientBirthPlace;
        this.patientMotherName = patientMotherName;
        this.patientMotherSurname = patientMotherSurname;
        this.idPatientCurrentAddress = idPatientCurrentAddress;
        this.idPatientRegistrationAddress = idPatientRegistrationAddress;
        this.barcode = barcode;
        this.patientHomePhoneNumber = patientHomePhoneNumber;
        this.patientMobilePhoneNumber = patientMobilePhoneNumber;
        this.patientEmail = patientEmail;
        this.isDelete = isDelete;
        this.idPersonalDeletedBy = idPersonalDeletedBy;
        this.details = details;
    }

    public PatientInfo() {
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getPatientFatherName() {
        return patientFatherName;
    }

    public void setPatientFatherName(String patientFatherName) {
        this.patientFatherName = patientFatherName;
    }

    public LocalDate getPatientBirthDate() {
        return patientBirthDate;
    }

    public void setPatientBirthDate(LocalDate patientBirthDate) {
        this.patientBirthDate = patientBirthDate;
    }

    public Properties getPatientGenderProperty() {
        return patientGenderProperty;
    }

    public void setPatientGenderProperty(Properties patientGenderProperty) {
        this.patientGenderProperty = patientGenderProperty;
    }

    public Properties getPatientTypeProperty() {
        return patientTypeProperty;
    }

    public void setPatientTypeProperty(Properties patientTypeProperty) {
        this.patientTypeProperty = patientTypeProperty;
    }

    public Properties getPatientCitizenshipProperty() {
        return patientCitizenshipProperty;
    }

    public void setPatientCitizenshipProperty(Properties patientCitizenshipProperty) {
        this.patientCitizenshipProperty = patientCitizenshipProperty;
    }

    public Properties getPatientIdTypeProperty() {
        return patientIdTypeProperty;
    }

    public void setPatientIdTypeProperty(Properties patientIdTypeProperty) {
        this.patientIdTypeProperty = patientIdTypeProperty;
    }

    public String getPatientPinCode() {
        return patientPinCode;
    }

    public void setPatientPinCode(String patientPinCode) {
        this.patientPinCode = patientPinCode;
    }

    public FullAddress getIdPatientBirthPlace() {
        return idPatientBirthPlace;
    }

    public void setIdPatientBirthPlace(FullAddress idPatientBirthPlace) {
        this.idPatientBirthPlace = idPatientBirthPlace;
    }

    public String getPatientMotherName() {
        return patientMotherName;
    }

    public void setPatientMotherName(String patientMotherName) {
        this.patientMotherName = patientMotherName;
    }

    public String getPatientMotherSurname() {
        return patientMotherSurname;
    }

    public void setPatientMotherSurname(String patientMotherSurname) {
        this.patientMotherSurname = patientMotherSurname;
    }

    public FullAddress getIdPatientCurrentAddress() {
        return idPatientCurrentAddress;
    }

    public void setIdPatientCurrentAddress(FullAddress idPatientCurrentAddress) {
        this.idPatientCurrentAddress = idPatientCurrentAddress;
    }

    public FullAddress getIdPatientRegistrationAddress() {
        return idPatientRegistrationAddress;
    }

    public void setIdPatientRegistrationAddress(FullAddress idPatientRegistrationAddress) {
        this.idPatientRegistrationAddress = idPatientRegistrationAddress;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getPatientHomePhoneNumber() {
        return patientHomePhoneNumber;
    }

    public void setPatientHomePhoneNumber(String patientHomePhoneNumber) {
        this.patientHomePhoneNumber = patientHomePhoneNumber;
    }

    public String getPatientMobilePhoneNumber() {
        return patientMobilePhoneNumber;
    }

    public void setPatientMobilePhoneNumber(String patientMobilePhoneNumber) {
        this.patientMobilePhoneNumber = patientMobilePhoneNumber;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public long getIdPersonalDeletedBy() {
        return idPersonalDeletedBy;
    }

    public void setIdPersonalDeletedBy(long idPersonalDeletedBy) {
        this.idPersonalDeletedBy = idPersonalDeletedBy;
    }

    @JsonIgnore
    public String getPatientDetail() {
        return getBarcode()
                .concat(" ")
                .concat(getPatientPinCode())
                .concat(" ")
                .concat(getPatientName())
                .concat(" ")
                .concat(getPatientSurname())
                .concat(" ")
                .concat(getPatientFatherName())
                .concat(" ")
                .concat(getPatientMobilePhoneNumber());
    }
}