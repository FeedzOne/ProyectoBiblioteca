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
public class DAutores {
    int id;
    String Nombre;
    String Appat;
    String Apmat;

    public DAutores() {
    }

    public DAutores(int id, String Nombre, String Appat, String Apmat) {
        this.id = id;
        this.Nombre = Nombre;
        this.Appat = Appat;
        this.Apmat = Apmat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAppat() {
        return Appat;
    }

    public void setAppat(String Appat) {
        this.Appat = Appat;
    }

    public String getApmat() {
        return Apmat;
    }

    public void setApmat(String Apmat) {
        this.Apmat = Apmat;
    }
    
}
