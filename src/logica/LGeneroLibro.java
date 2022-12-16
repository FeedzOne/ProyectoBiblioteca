/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DGeneroLibro;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class LGeneroLibro {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel verGeneros(DGeneroLibro misGeneros){
        String profile = "";
        DefaultTableModel myModel = null;
        
        try {

            String titles[] = {"id","Descripcion"};
            String dts[] = new String[2];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_genero_libro(?)}");
            cst.setString(1, misGeneros.getDescripcion());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_genero");
                dts[1] = rs.getString("descripcion");
                myModel.addRow(dts);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return myModel;
    }
    
    public String insertarEditorial(DGeneroLibro misGeneros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_genero_libro(?) }");
            cst.setString(1, misGeneros.getDescripcion());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String editarEditoriales(DGeneroLibro misGeneros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_genero_libro(?,?) }");
            cst.setInt(1, misGeneros.getIdGenero());
            cst.setString(2, misGeneros.getDescripcion());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String eliminarEditoriales(DGeneroLibro misGeneros){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_genero_libro(?) }");
            cst.setInt(1, misGeneros.getIdGenero());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
}
