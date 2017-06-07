package ht.sivgep.pharmacielakay.models;

import java.util.Date;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Fiche_medoc {
    private String objectID;
    private Categorie_medoc catego_medoc;
    private Info_pharma pharmaID;
    private String prescription_rec_medoc;
    private String posologie_medoc;
    private String nom_medoc;
    private String nom_gen_medoc;
    private String info_sup_medoc;
    private Date exp_medoc;
    private String effet_sec_medoc;

    public Fiche_medoc(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public Categorie_medoc getCatego_medoc() {
        return catego_medoc;
    }

    public void setCatego_medoc(Categorie_medoc catego_medoc) {
        this.catego_medoc = catego_medoc;
    }

    public Info_pharma getPharmaID() {
        return pharmaID;
    }

    public void setPharmaID(Info_pharma pharmaID) {
        this.pharmaID = pharmaID;
    }

    public String getPrescription_rec_medoc() {
        return prescription_rec_medoc;
    }

    public void setPrescription_rec_medoc(String prescription_rec_medoc) {
        this.prescription_rec_medoc = prescription_rec_medoc;
    }

    public String getPosologie_medoc() {
        return posologie_medoc;
    }

    public void setPosologie_medoc(String posologie_medoc) {
        this.posologie_medoc = posologie_medoc;
    }

    public String getNom_medoc() {
        return nom_medoc;
    }

    public void setNom_medoc(String nom_medoc) {
        this.nom_medoc = nom_medoc;
    }

    public String getNom_gen_medoc() {
        return nom_gen_medoc;
    }

    public void setNom_gen_medoc(String nom_gen_medoc) {
        this.nom_gen_medoc = nom_gen_medoc;
    }

    public String getInfo_sup_medoc() {
        return info_sup_medoc;
    }

    public void setInfo_sup_medoc(String info_sup_medoc) {
        this.info_sup_medoc = info_sup_medoc;
    }

    public Date getExp_medoc() {
        return exp_medoc;
    }

    public void setExp_medoc(Date exp_medoc) {
        this.exp_medoc = exp_medoc;
    }

    public String getEffet_sec_medoc() {
        return effet_sec_medoc;
    }

    public void setEffet_sec_medoc(String effet_sec_medoc) {
        this.effet_sec_medoc = effet_sec_medoc;
    }
}
