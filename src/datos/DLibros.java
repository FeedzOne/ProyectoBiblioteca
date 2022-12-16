/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author migue
 */
public class DLibros {
    String ISBN;
    String titulo;
    String descripcion;
    int idEditorial;
    String edicion;
    int cantidad;
    int id_genero;
    int id_autor;
    Date fechaAlta;
    Date fechaActualizacion;
    int idEstadoLibro;

    public DLibros() {
    }

    public DLibros(String ISBN, String titulo, String descripcion, int idEditorial, String edicion, int cantidad, int id_genero, int id_autor, Date fechaAlta, Date fechaActualizacion, int idEstadoLibro) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idEditorial = idEditorial;
        this.edicion = edicion;
        this.cantidad = cantidad;
        this.id_genero = id_genero;
        this.id_autor = id_autor;
        this.fechaAlta = fechaAlta;
        this.fechaActualizacion = fechaActualizacion;
        this.idEstadoLibro = idEstadoLibro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getIdEstadoLibro() {
        return idEstadoLibro;
    }

    public void setIdEstadoLibro(int idEstadoLibro) {
        this.idEstadoLibro = idEstadoLibro;
    }
    
   
    
    
}
