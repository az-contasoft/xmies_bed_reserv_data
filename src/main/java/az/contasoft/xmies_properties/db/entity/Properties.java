package az.contasoft.xmies_properties.db.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


public class Properties implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idProperties;
    private String value;
    private int parentId;
    private int isDelete;
    private String proKey;

    public Properties() {
    }

    public Properties(Long idProperties, String value, int parentId, int isDelete, String proKey) {
        this.idProperties = idProperties;
        this.value = value;
        this.parentId = parentId;
        this.isDelete = isDelete;
        this.proKey = proKey;
    }



    public long getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(long idProperties) {
        this.idProperties = idProperties;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getProKey() {
        return proKey;
    }

    public void setProKey(String proKey) {
        this.proKey = proKey;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "idProperties=" + idProperties +
                ", value='" + value + '\'' +
                ", parentId=" + parentId +
                ", isDelete=" + isDelete +
                ", proKey='" + proKey + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Properties)) {
//            return false;
//        }
//        Properties other = (Properties) object;
//        if ((this.idProperties == 0 && other.getIdProperties() != 0) || (this.idProperties != 0 && !(this.idProperties == (other.idProperties)))) {
//            return false;
//        }
//        return true;
//    }
    
    

    
}
