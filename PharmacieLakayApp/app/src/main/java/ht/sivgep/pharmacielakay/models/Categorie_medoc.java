package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Categorie_medoc {
    private String objectID;
    private Info_pharma pharmaID;
    private String nom_catego;
    private String desc_catego;

    public Categorie_medoc(){

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

    public String getNom_catego() {
        return nom_catego;
    }

    public void setNom_catego(String nom_catego) {
        this.nom_catego = nom_catego;
    }

    public String getDesc_catego() {
        return desc_catego;
    }

    public void setDesc_catego(String desc_catego) {
        this.desc_catego = desc_catego;
    }
}
