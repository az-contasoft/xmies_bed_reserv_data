package az.contasoft.xmies_personal.db.entities;


import java.io.Serializable;
import java.time.LocalDate;

public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idPersonal;
    private String personalName;
    private String personalSurName;
    private String personalMotherName;
    private String personalFatherName;
    private LocalDate personalBirthDate;
    private long personalGenderProperty;
    private long personalCitizenshipProperty; // milliyetibloo
    private long bloodType;
    private long personalMaritalStatusPro; // ishci ailə vəziyyəti
    private long personalEducationPro;  // ishci tehsili
    private long personalJobsProperty;
    private long personalDepartmentPro;  // ishchinin hekim ,professor olmagi
    private long personalMilitaryStatusPro;
    private long personalTitleProperty;
    private LocalDate startedDatePersonal;  //ishchinin ishe bashlama tarixi
    private LocalDate finishedDatePersonal;
    private String phone;
    private String mail;
    private long idAddress;
    private int isDeleted;

    public Personal() {
    }


    public Long getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Long idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getPersonalSurName() {
        return personalSurName;
    }

    public void setPersonalSurName(String personalSurName) {
        this.personalSurName = personalSurName;
    }

    public String getPersonalMotherName() {
        return personalMotherName;
    }

    public void setPersonalMotherName(String personalMotherName) {
        this.personalMotherName = personalMotherName;
    }

    public String getPersonalFatherName() {
        return personalFatherName;
    }

    public void setPersonalFatherName(String personalFatherName) {
        this.personalFatherName = personalFatherName;
    }

    public LocalDate getPersonalBirthDate() {
        return personalBirthDate;
    }

    public void setPersonalBirthDate(LocalDate personalBirthDate) {
        this.personalBirthDate = personalBirthDate;
    }

    public long getPersonalGenderProperty() {
        return personalGenderProperty;
    }

    public void setPersonalGenderProperty(long personalGenderProperty) {
        this.personalGenderProperty = personalGenderProperty;
    }

    public long getPersonalCitizenshipProperty() {
        return personalCitizenshipProperty;
    }

    public void setPersonalCitizenshipProperty(long personalCitizenshipProperty) {
        this.personalCitizenshipProperty = personalCitizenshipProperty;
    }

    public long getBloodType() {
        return bloodType;
    }

    public void setBloodType(long bloodType) {
        this.bloodType = bloodType;
    }

    public long getPersonalMaritalStatusPro() {
        return personalMaritalStatusPro;
    }

    public void setPersonalMaritalStatusPro(long personalMaritalStatusPro) {
        this.personalMaritalStatusPro = personalMaritalStatusPro;
    }

    public long getPersonalEducationPro() {
        return personalEducationPro;
    }

    public void setPersonalEducationPro(long personalEducationPro) {
        this.personalEducationPro = personalEducationPro;
    }

    public long getPersonalJobsProperty() {
        return personalJobsProperty;
    }

    public void setPersonalJobsProperty(long personalJobsProperty) {
        this.personalJobsProperty = personalJobsProperty;
    }

    public long getPersonalDepartmentPro() {
        return personalDepartmentPro;
    }

    public void setPersonalDepartmentPro(long personalDepartmentPro) {
        this.personalDepartmentPro = personalDepartmentPro;
    }

    public long getPersonalMilitaryStatusPro() {
        return personalMilitaryStatusPro;
    }

    public void setPersonalMilitaryStatusPro(long personalMilitaryStatusPro) {
        this.personalMilitaryStatusPro = personalMilitaryStatusPro;
    }

    public long getPersonalTitleProperty() {
        return personalTitleProperty;
    }

    public void setPersonalTitleProperty(long personalTitleProperty) {
        this.personalTitleProperty = personalTitleProperty;
    }

    public LocalDate getStartedDatePersonal() {
        return startedDatePersonal;
    }

    public void setStartedDatePersonal(LocalDate startedDatePersonal) {
        this.startedDatePersonal = startedDatePersonal;
    }

    public LocalDate getFinishedDatePersonal() {
        return finishedDatePersonal;
    }

    public void setFinishedDatePersonal(LocalDate finishedDatePersonal) {
        this.finishedDatePersonal = finishedDatePersonal;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "idPersonal=" + idPersonal +
                ", personalName='" + personalName + '\'' +
                ", personalSurName='" + personalSurName + '\'' +
                ", personalMotherName='" + personalMotherName + '\'' +
                ", personalFatherName='" + personalFatherName + '\'' +
                ", personalBirthDate=" + personalBirthDate +
                ", personalGenderProperty=" + personalGenderProperty +
                ", personalCitizenshipProperty=" + personalCitizenshipProperty +
                ", bloodType=" + bloodType +
                ", personalMaritalStatusPro=" + personalMaritalStatusPro +
                ", personalEducationPro=" + personalEducationPro +
                ", personalJobsProperty=" + personalJobsProperty +
                ", personalDepartmentPro=" + personalDepartmentPro +
                ", personalMilitaryStatusPro=" + personalMilitaryStatusPro +
                ", personalTitleProperty=" + personalTitleProperty +
                ", startedDatePersonal=" + startedDatePersonal +
                ", finishedDatePersonal=" + finishedDatePersonal +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", idAddress=" + idAddress +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public Personal(Long idPersonal, String personalName, String personalSurName, String personalMotherName, String personalFatherName, LocalDate personalBirthDate, int personalGenderProperty, int personalCitizenshipProperty, int bloodType, int personalMaritalStatusPro, int personalEducationPro, long personalJobsProperty, long personalDepartmentPro, int personalMilitaryStatusPro, int personalTitleProperty, LocalDate startedDatePersonal, LocalDate finishedDatePersonal, String phone, String mail, long idAddress, int isDeleted) {
        this.idPersonal = idPersonal;
        this.personalName = personalName;
        this.personalSurName = personalSurName;
        this.personalMotherName = personalMotherName;
        this.personalFatherName = personalFatherName;
        this.personalBirthDate = personalBirthDate;
        this.personalGenderProperty = personalGenderProperty;
        this.personalCitizenshipProperty = personalCitizenshipProperty;
        this.bloodType = bloodType;
        this.personalMaritalStatusPro = personalMaritalStatusPro;
        this.personalEducationPro = personalEducationPro;
        this.personalJobsProperty = personalJobsProperty;
        this.personalDepartmentPro = personalDepartmentPro;
        this.personalMilitaryStatusPro = personalMilitaryStatusPro;
        this.personalTitleProperty = personalTitleProperty;
        this.startedDatePersonal = startedDatePersonal;
        this.finishedDatePersonal = finishedDatePersonal;
        this.phone = phone;
        this.mail = mail;
        this.idAddress = idAddress;
        this.isDeleted = isDeleted;
    }

}



