/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DAutores;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FeedzOne
 */
public class LAutores {
    Connection cn = LConexion.getConnection();
    public DefaultTableModel verAutores(DAutores misAutores) {
        String profile = "";
        DefaultTableModel myModel = null;
        try{
            String titles[] = {"ID", "Nombre", "A. Paterno", "A. Materno"};
            String dts[] = new String [4];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_autores(?)}");
            cst.setString(1, misAutores.getNombre());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_autor");
                dts[1] = rs.getString("nombre");
                dts[2] = rs.getString("apellido_paterno");
                dts[3] = rs.getString("apellido_materno"); 
                myModel.addRow(dts);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return myModel;
    }
    
    public String insertarAutores(DAutores misAutores){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_autores(?,?,?) }");
            cst.setString(1, misAutores.getNombre());
            cst.setString(2, misAutores.getAppat());
            cst.setString(3, misAutores.getApmat());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
    
    public String editarAutores(DAutores misAutores){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_autores(?,?,?,?) }");
            cst.setInt(1, misAutores.getId());
            cst.setString(2, misAutores.getNombre());
            cst.setString(3, misAutores.getAppat());
            cst.setString(4, misAutores.getApmat());

            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
    
     public String eliminarAutores(DAutores misAutores){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_autores(?) }");
            cst.setInt(1, misAutores.getId());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
}
