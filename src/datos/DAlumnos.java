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
public class DAlumnos {
    int matricula;
    String nombre;
    String ApPat;
    String Apmat;
    
    
    public DAlumnos() {
    }
    public DAlumnos(int matricula, String nombre, String ApPat, String Apmat) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.ApPat = ApPat;
        this.Apmat = Apmat;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApmat() {
        return Apmat;
    }

    public void setApmat(String Apmat) {
        this.Apmat = Apmat;
    }

    
}
