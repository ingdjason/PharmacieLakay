package ht.sivgep.pharmacielakay.models;

/**
 * Created by ingdjason on 6/6/17.
 */

public class Departement_ville {
    private String code_dept;
    private String info_dept;
    private String objectID;

    public Departement_ville(){

    }

    public String getObjectID() {
        return objectID;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }
    public String getCode_dept() {
        return code_dept;
    }

    public void setCode_dept(String code_dept) {
        this.code_dept = code_dept;
    }

    public String getInfo_dept() {
        return info_dept;
    }

    public void setInfo_dept(String info_dept) {
        this.info_dept = info_dept;
    }
}
