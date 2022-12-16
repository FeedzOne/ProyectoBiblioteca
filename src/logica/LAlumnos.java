/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DAlumnos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FeedzOne
 */
public class LAlumnos {
    Connection cn = LConexion.getConnection();
    
    
    public DefaultTableModel verAlumnos(DAlumnos misAlumnos) {
        String profile = "";
        DefaultTableModel myModel = null;
        try{
            String titles[] = {"Matricula", "Nombre", "A. Paterno", "A. Materno"};
            String dts[] = new String [4];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_alumnos(?)}");
            cst.setString(1, misAlumnos.getNombre());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("matricula");
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
    
     public String insertarAlumnos(DAlumnos misAlumnos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_alumnos(?,?,?) }");
            cst.setString(1, misAlumnos.getNombre());
            cst.setString(2, misAlumnos.getApPat());
            cst.setString(3, misAlumnos.getApmat());
            
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     
     public String editarAlumnos(DAlumnos misAlumnos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_alumnos(?,?,?,?) }");
            cst.setInt(1, misAlumnos.getMatricula());
            cst.setString(2, misAlumnos.getNombre());
            cst.setString(3, misAlumnos.getApPat());
            cst.setString(4, misAlumnos.getApmat());
            
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     public String eliminarAlumnos(DAlumnos misAlumnos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_alumnos(?) }");
            cst.setInt(1, misAlumnos.getMatricula());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
}
