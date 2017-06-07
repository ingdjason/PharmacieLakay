package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Position_pharma {
    private Info_pharma pharmaID;
    private String gpsLat_pharma;
    private String gpsLong_pharma;
    private String objectID;

    public Position_pharma(){
    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public Info_pharma getPharmaID() {
        return pharmaID;
    }

    public void setPharmaID(Info_pharma pharmaID) {
        this.pharmaID = pharmaID;
    }

    public String getGpsLat_pharma() {
        return gpsLat_pharma;
    }

    public void setGpsLat_pharma(String gpsLat_pharma) {
        this.gpsLat_pharma = gpsLat_pharma;
    }

    public String getGpsLong_pharma() {
        return gpsLong_pharma;
    }

    public void setGpsLong_pharma(String gpsLong_pharma) {
        this.gpsLong_pharma = gpsLong_pharma;
    }
}
