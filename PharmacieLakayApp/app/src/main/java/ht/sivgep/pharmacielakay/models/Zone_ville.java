package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Zone_ville {
    private String info_zone;
    private String code_zone;
    private Commune_ville communeID;
    private String objectID;

    public Zone_ville(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public String getInfo_zone() {
        return info_zone;
    }

    public void setInfo_zone(String info_zone) {
        this.info_zone = info_zone;
    }

    public String getCode_zone() {
        return code_zone;
    }

    public void setCode_zone(String code_zone) {
        this.code_zone = code_zone;
    }

    public Commune_ville getCommuneID() {
        return communeID;
    }

    public void setCommuneID(Commune_ville communeID) {
        this.communeID = communeID;
    }
}
