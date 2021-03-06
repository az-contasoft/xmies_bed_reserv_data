package az.contasoft.xmies_sigorta_muqavile.db.entity;


import java.io.Serializable;

public class SigortaMuqavile implements Serializable {


    private static final long serialVersionUID = 1L;

    private long idSigortaMuqavile;
    private String muqavileAdi;
    private long idSigortaQurum;
    private long idPaket; //   idPaket
    private int endirimFaizi;
    private long idXidmetler;
    private int isActive;
    private int isDelete;

    public SigortaMuqavile(String muqavileAdi, long idSigortaMuqavile, long idSigortaQurum, long idPaket, int endirimFaizi, long idXidmetler, int isActive, int isDelete) {
        this.muqavileAdi = muqavileAdi;
        this.idSigortaMuqavile = idSigortaMuqavile;
        this.idSigortaQurum = idSigortaQurum;
        this.idPaket = idPaket;
        this.endirimFaizi = endirimFaizi;
        this.idXidmetler = idXidmetler;
        this.isActive = isActive;
        this.isDelete = isDelete;
    }

    public SigortaMuqavile() {
    }

    @Override
    public String toString() {
        return "SigortaMuqavile{" +
                "idSigortaMuqavile=" + idSigortaMuqavile +
                ", muqavileAdi='" + muqavileAdi + '\'' +
                ", idSigortaQurum=" + idSigortaQurum +
                ", idPaket=" + idPaket +
                ", endirimFaizi=" + endirimFaizi +
                ", idXidmetler=" + idXidmetler +
                ", isActive=" + isActive +
                ", isDelete=" + isDelete +
                '}';
    }


    public String getMuqavileAdi() {
        return muqavileAdi;
    }

    public void setMuqavileAdi(String muqavileAdi) {
        this.muqavileAdi = muqavileAdi;
    }

    public long getIdSigortaMuqavile() {
        return idSigortaMuqavile;
    }

    public void setIdSigortaMuqavile(long idSigortaMuqavile) {
        this.idSigortaMuqavile = idSigortaMuqavile;
    }

    public long getIdSigortaQurum() {
        return idSigortaQurum;
    }

    public void setIdSigortaQurum(long idSigortaQurum) {
        this.idSigortaQurum = idSigortaQurum;
    }

    public long getIdPaket() {
        return idPaket;
    }

    public void setIdPaket(long idPaket) {
        this.idPaket = idPaket;
    }

    public int getEndirimFaizi() {
        return endirimFaizi;
    }

    public void setEndirimFaizi(int endirimFaizi) {
        this.endirimFaizi = endirimFaizi;
    }

    public long getIdXidmetler() {
        return idXidmetler;
    }

    public void setIdXidmetler(long idXidmetler) {
        this.idXidmetler = idXidmetler;
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
}