package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Info_client {
    private Zone_ville zone_ref_client;
    private Users userID_client;
    private String prenom_client;
    private String nom_client;
    private String adresse_client;
    private int age_client;
    private String objectID;

    public Info_client(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }
    public Zone_ville getZone_ref_client() {
        return zone_ref_client;
    }

    public void setZone_ref_client(Zone_ville zone_ref_client) {
        this.zone_ref_client = zone_ref_client;
    }

    public Users getUserID_client() {
        return userID_client;
    }

    public void setUserID_client(Users userID_client) {
        this.userID_client = userID_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }

    public int getAge_client() {
        return age_client;
    }

    public void setAge_client(int age_client) {
        this.age_client = age_client;
    }
}
