/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DLibros;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class LLibros {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel verLibros(DLibros misLibros){
        String profile = "";
        DefaultTableModel myModel = null;
        
        try {
            String titles[] = {"ISBN","Titulo","Descripcion","Editorial","Autor","Edicion","Cantidad","Genero","Estado"};
            String dts[] = new String[9];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_libros(?)}");
            cst.setString(1, misLibros.getTitulo());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("ISBN");
                dts[1] = rs.getString("titulo");
                dts[2] = rs.getString("descripcion");
                dts[3] = rs.getString("id_editorial");
                dts[4] = rs.getString("id_editorial");
                dts[5] = rs.getString("Edicion");
                dts[6] = rs.getString("cantidad");
                dts[7] = rs.getString("id_genero");
                dts[8] = rs.getString("id_estado_libro");
                myModel.addRow(dts);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return myModel;
    }
    
    public String insertarLibro(DLibros misLibros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_libros(?,?,?,?,?,?,?,?,?) }");
            cst.setString(1, misLibros.getISBN());
            cst.setString(2, misLibros.getTitulo());
            cst.setString(3, misLibros.getDescripcion());
            cst.setInt(4, misLibros.getIdEditorial());
            cst.setInt(5, misLibros.getId_autor());
            cst.setString(6, misLibros.getEdicion());
            cst.setInt(7, misLibros.getCantidad());
            cst.setInt(8, misLibros.getId_genero());
            cst.setInt(9, misLibros.getIdEstadoLibro());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String editarLibros(DLibros misLibros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_libros(?,?,?,?,?,?,?,?,?) }");
            cst.setString(1, misLibros.getISBN());
            cst.setString(2, misLibros.getTitulo());
            cst.setString(3, misLibros.getDescripcion());
            cst.setInt(4, misLibros.getIdEditorial());
            cst.setInt(5, misLibros.getId_autor());
            cst.setString(6, misLibros.getEdicion());
            cst.setInt(7, misLibros.getCantidad());
            cst.setInt(8, misLibros.getId_genero());
            cst.setInt(9, misLibros.getIdEstadoLibro());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String eliminarLibros(DLibros misLibros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_libros(?) }");
            cst.setString(1, misLibros.getISBN());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
}
