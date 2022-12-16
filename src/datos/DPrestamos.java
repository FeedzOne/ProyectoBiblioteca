/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Date;


/**
 *
 * @author FeedzOne
 */
public class DPrestamos {
    Date dateDev;
    int id_al;
    int id_emp;
    String id_l;
    int id;

    public DPrestamos() {
    }

    public DPrestamos(Date dateDev, int id_al, int id_emp, String id_l, int id) {
        this.dateDev = dateDev;
        this.id_al = id_al;
        this.id_emp = id_emp;
        this.id_l = id_l;
        this.id = id;
    }

    public Date getDateDev() {
        return dateDev;
    }

    public void setDateDev(Date dateDev) {
        this.dateDev = dateDev;
    }

    public int getId_al() {
        return id_al;
    }

    public void setId_al(int id_al) {
        this.id_al = id_al;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getId_l() {
        return id_l;
    }

    public void setId_l(String id_l) {
        this.id_l = id_l;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    

}
