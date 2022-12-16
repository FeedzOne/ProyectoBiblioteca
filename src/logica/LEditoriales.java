/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DEditoriales;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class LEditoriales {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel verEditoriales(DEditoriales misEditoriales){
        String profile = "";
        DefaultTableModel myModel = null;
        
        try {

            String titles[] = {"id","Nombre","Direccion"};
            String dts[] = new String[3];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_editoriales(?)}");
            cst.setString(1, misEditoriales.getNombre());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_editorial");
                dts[1] = rs.getString("nombre");
                dts[2] = rs.getString("direccion");
                myModel.addRow(dts);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return myModel;
    }
    
    public String insertarEditorial(DEditoriales misEditoriales){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_editorial(?,?) }");
            cst.setString(1, misEditoriales.getNombre());
            cst.setString(2, misEditoriales.getDireccion());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String editarEditoriales(DEditoriales misEditoriales){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_editorial(?,?,?) }");
            cst.setInt(1, misEditoriales.getIdEditorial());
            cst.setString(2, misEditoriales.getNombre());
            cst.setString(3, misEditoriales.getDireccion());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
    
    public String eliminarEditoriales(DEditoriales misEditoriales){
        String msg = null;
        
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_editorial(?) }");
            cst.setInt(1, misEditoriales.getIdEditorial());
            
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        
        return msg;
    }
}
