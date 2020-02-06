package az.contasoft.xmies_queueueue.db.entities;


import java.io.Serializable;
import java.time.LocalDateTime;

public class QueueSystem implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idQueueSystem;//idnovbe sistemi
    private LocalDateTime enteredDate;
    private long idProtokol;
    private long idDepartment;
    private long idPersonal;
    private long queueNo;//sira nomresi//
    private int status;//properties

    public QueueSystem() {
    }

    @Override
    public String toString() {
        return "QueueSystem{" +
                "idQueueSystem=" + idQueueSystem +
                ", enteredDate=" + enteredDate +
                ", idProtokol=" + idProtokol +
                ", idDepartment=" + idDepartment +
                ", idPersonal=" + idPersonal +
                ", queueNo=" + queueNo +
                ", status=" + status +
                '}';
    }

    public long getIdQueueSystem() {
        return idQueueSystem;
    }

    public void setIdQueueSystem(long idQueueSystem) {
        this.idQueueSystem = idQueueSystem;
    }

    public LocalDateTime getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(LocalDateTime enteredDate) {
        this.enteredDate = enteredDate;
    }

    public long getIdProtokol() {
        return idProtokol;
    }

    public void setIdProtokol(long idProtokol) {
        this.idProtokol = idProtokol;
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

    public long getQueueNo() {
        return queueNo;
    }

    public void setQueueNo(long queueNo) {
        this.queueNo = queueNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public QueueSystem(long idQueueSystem, LocalDateTime enteredDate, long idProtokol, long idDepartment, long idPersonal, long queueNo, long status) {
        this.idQueueSystem = idQueueSystem;
        this.enteredDate = enteredDate;
        this.idProtokol = idProtokol;
        this.idDepartment = idDepartment;
        this.idPersonal = idPersonal;
        this.queueNo = queueNo;
        this.status = (int) status;
    }
}