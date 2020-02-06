package az.contasoft.xmies_patient.api.infoService.internal;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Address implements Serializable {

    private long idAddress;
    private String title;
    private long parentId;
    private long enteredPersonalId;
    private LocalDateTime enteredData;
    private int isDeleted;

    public Address() {
    }

    public Address(String title, long parentId, long enteredPersonalId, LocalDateTime enteredData, int isDeleted) {
        this.title = title;
        this.parentId = parentId;
        this.enteredPersonalId = enteredPersonalId;
        this.enteredData = enteredData;
        this.isDeleted = isDeleted;
    }

    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public long getEnteredPersonalId() {
        return enteredPersonalId;
    }

    public void setEnteredPersonalId(long enteredPersonalId) {
        this.enteredPersonalId = enteredPersonalId;
    }

    public LocalDateTime getEnteredData() {
        return enteredData;
    }

    public void setEnteredData(LocalDateTime enteredData) {
        this.enteredData = enteredData;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Address{" +
                "idAddress=" + idAddress +
                ", title='" + title + '\'' +
                ", parentId=" + parentId +
                ", enteredPersonalId=" + enteredPersonalId +
                ", enteredData=" + enteredData +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
