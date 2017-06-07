package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Info_pharma {
    private Zone_ville zone_ref_pharma;
    private Users userID_pharma;
    private String verif_pharma;
    private String tel_pharma;
    private String nom_pharma;
    private String id_mspp_pharma;
    private String email_pharma;
    private String adresse_pharma;
    private String objectID;

    public Info_pharma(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public Zone_ville getZone_ref_pharma() {
        return zone_ref_pharma;
    }

    public void setZone_ref_pharma(Zone_ville zone_ref_pharma) {
        this.zone_ref_pharma = zone_ref_pharma;
    }

    public Users getUserID_pharma() {
        return userID_pharma;
    }

    public void setUserID_pharma(Users userID_pharma) {
        this.userID_pharma = userID_pharma;
    }

    public String getVerif_pharma() {
        return verif_pharma;
    }

    public void setVerif_pharma(String verif_pharma) {
        this.verif_pharma = verif_pharma;
    }

    public String getTel_pharma() {
        return tel_pharma;
    }

    public void setTel_pharma(String tel_pharma) {
        this.tel_pharma = tel_pharma;
    }

    public String getNom_pharma() {
        return nom_pharma;
    }

    public void setNom_pharma(String nom_pharma) {
        this.nom_pharma = nom_pharma;
    }

    public String getId_mspp_pharma() {
        return id_mspp_pharma;
    }

    public void setId_mspp_pharma(String id_mspp_pharma) {
        this.id_mspp_pharma = id_mspp_pharma;
    }

    public String getEmail_pharma() {
        return email_pharma;
    }

    public void setEmail_pharma(String email_pharma) {
        this.email_pharma = email_pharma;
    }

    public String getAdresse_pharma() {
        return adresse_pharma;
    }

    public void setAdresse_pharma(String adresse_pharma) {
        this.adresse_pharma = adresse_pharma;
    }
}
