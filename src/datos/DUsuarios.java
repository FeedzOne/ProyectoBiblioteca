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
public class DUsuarios {
    int idUsers;
    String Name;
    String ApPat;
    String ApMat;
    String Usuario;
    String Psd;

    public DUsuarios() {
    }

    public DUsuarios(int idUsers, String Name, String ApPat, String ApMat, String Usuario, String psd) {
        this.idUsers = idUsers;
        this.Name = Name;
        this.ApPat = ApPat;
        this.ApMat = ApMat;
        this.Usuario = Usuario;
        this.Psd = Psd;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(String ApMat) {
        this.ApMat = ApMat;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPsd() {
        return Psd;
    }

    public void setPsd(String psd) {
        this.Psd = psd;
    }
    

}
