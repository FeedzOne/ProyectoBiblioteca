/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author FeedzOne
 */
public class DDocentes {
    int id;
    int id_tipo;
    String nombre;
    String appat;
    String apmat;
    String usuario;
    String psd;
    
    
    public DDocentes() {
    }
    
    public DDocentes(int id, int id_tipo, String nombre, String appat, String apmat, String usuario, String psd) {
        this.id = id;
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.usuario = usuario;
        this.psd = psd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
    
}
