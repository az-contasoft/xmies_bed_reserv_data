package az.contasoft.xmies_bed_reserv.db.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class BedReserv implements Serializable {

    private static final long serialVersionUID = 1L;

//Susan cox da shey eleme

    private  long idBadReserv;
    private  long idProBed;
    private  long idProtokol;
    private  int isActive;
    private LocalDateTime date;
    private  int isReserv;

    public BedReserv() {
    }

    @Override
    public String toString() {
        return "BedReserv{" +
                "idBadReserv=" + idBadReserv +
                ", idProBed=" + idProBed +
                ", idProtokol=" + idProtokol +
                ", isActive=" + isActive +
                ", date=" + date +
                ", isReserv=" + isReserv +
                '}';
    }

    public long getIdBadReserv() {
        return idBadReserv;
    }

    public void setIdBadReserv(long idBadReserv) {
        this.idBadReserv = idBadReserv;
    }

    public long getIdProBed() {
        return idProBed;
    }

    public void setIdProBed(long idProBed) {
        this.idProBed = idProBed;
    }

    public long getIdProtokol() {
        return idProtokol;
    }

    public void setIdProtokol(long idProtokol) {
        this.idProtokol = idProtokol;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getIsReserv() {
        return isReserv;
    }

    public void setIsReserv(int isReserv) {
        this.isReserv = isReserv;
    }

    public BedReserv(long idBadReserv, long idProBed, long idProtokol, int isActive, LocalDateTime date, int isReserv) {
        this.idBadReserv = idBadReserv;
        this.idProBed = idProBed;
        this.idProtokol = idProtokol;
        this.isActive = isActive;
        this.date = date;
        this.isReserv = isReserv;
    }
}
