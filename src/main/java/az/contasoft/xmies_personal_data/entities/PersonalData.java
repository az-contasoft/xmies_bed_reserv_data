package az.contasoft.xmies_personal_data.entities;

import az.contasoft.xmies_personal.db.entities.Personal;
import az.contasoft.xmies_properties.db.entity.Properties;
import az.contasoft.xmies_queueueue.db.entities.QueueSystem;

import java.io.Serializable;

public class PersonalData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Personal personal;
    private Properties department;
    private Properties job;
    private QueueSystem queueSystem;

    public PersonalData() {
    }

    public PersonalData(Personal personal, Properties department, Properties job, QueueSystem queueSystem) {
        this.personal = personal;
        this.department = department;
        this.job = job;
        this.queueSystem = queueSystem;
    }

    public String getFullData(){
        return personal.getPersonalName()
                .concat(" ")
                .concat(personal.getPersonalSurName())
                .concat(" ")
                .concat(personal.getPersonalFatherName())
                .concat(" ")
                .concat(department!=null?department.getValue():"")
                .concat(" ")
                .concat(job!=null?job.getValue():"")
                .concat(" ")
                .concat(queueSystem!=null?queueSystem.getQueueNo()+"":"");
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "personal=" + personal +
                ", department=" + department +
                ", job=" + job +
                '}';
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Properties getDepartment() {
        return department;
    }

    public void setDepartment(Properties department) {
        this.department = department;
    }

    public Properties getJob() {
        return job;
    }

    public void setJob(Properties job) {
        this.job = job;
    }

    public QueueSystem getQueueSystem() {
        return queueSystem;
    }

    public void setQueueSystem(QueueSystem queueSystem) {
        this.queueSystem = queueSystem;
    }
}
