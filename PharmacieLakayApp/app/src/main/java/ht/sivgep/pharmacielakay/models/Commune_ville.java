package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Commune_ville {
    private String objectID;
    private String code_commune;
    private String info_commune;
    private Departement_ville departementID;

    public Commune_ville(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }
    public String getCode_commune() {
        return code_commune;
    }

    public void setCode_commune(String code_commune) {
        this.code_commune = code_commune;
    }

    public String getInfo_commune() {
        return info_commune;
    }

    public void setInfo_commune(String info_commune) {
        this.info_commune = info_commune;
    }

    public Departement_ville getDepartementID() {
        return departementID;
    }

    public void setDepartementID(Departement_ville departementID) {
        this.departementID = departementID;
    }
}
