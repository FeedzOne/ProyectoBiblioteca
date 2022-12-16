/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DDocentes;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FeedzOne
 */
public class LDocentes {
    Connection cn = LConexion.getConnection();
    
    
    public DefaultTableModel verDocentes(DDocentes misDocentes) {
        String profile = "";
        DefaultTableModel myModel = null;
        try{
            String titles[] = {"ID", "Tipo", "Nombre", "A. Paterno", "A. Materno", "Usuario", "Pass"};
            String dts[] = new String [7];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_trabajadores(?)}");
            cst.setString(1, misDocentes.getNombre());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_trabajador");
                dts[1] = rs.getString("id_tipo_trabajador");
                dts[2] = rs.getString("nombre");
                dts[3] = rs.getString("apellido_paterno");
                dts[4] = rs.getString("apellido_materno"); 
                dts[5] = rs.getString("usuario");
                dts[6] = rs.getString("pass");
                myModel.addRow(dts);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return myModel;
    }
    
     public String insertarDocentes(DDocentes misDocentes){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_trabajadores(?,?,?,?,?,?) }");
            cst.setInt(1, misDocentes.getId_tipo());
            cst.setString(2, misDocentes.getNombre());
            cst.setString(3, misDocentes.getAppat());
            cst.setString(4, misDocentes.getApmat());
            cst.setString(5, misDocentes.getUsuario());
            cst.setString(6, misDocentes.getPsd());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     
     public String editarDocentes(DDocentes misDocentes){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_trabajadores(?,?,?,?,?,?,?) }");
            cst.setInt(1, misDocentes.getId());
            cst.setInt(2, misDocentes.getId_tipo());
            cst.setString(3, misDocentes.getNombre());
            cst.setString(4, misDocentes.getAppat());
            cst.setString(5, misDocentes.getApmat());
            cst.setString(6, misDocentes.getUsuario());
            cst.setString(7, misDocentes.getPsd());
            
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     public String eliminarDocentes(DDocentes misDocentes){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_trabajadores(?) }");
            cst.setInt(1, misDocentes.getId());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
    }

   
