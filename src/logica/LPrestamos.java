/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DPrestamos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FeedzOne
 */
public class LPrestamos {
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel verPrestamos(DPrestamos misPrestamos) {
        String profile = "";
        DefaultTableModel myModel = null;
        try{
            String titles[] = {"ID", "Mat. Alumno", "ID Docente", "ISBN", "Fecha Prestamo", "Fecha Devolucion"};
            String dts[] = new String [6];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_mostrarbuscar_rentas(?)}");
            cst.setString(1, misPrestamos.getId_l());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_renta");
                dts[1] = rs.getString("matricula_alumno");
                dts[2] = rs.getString("id_trabajador");
                dts[3] = rs.getString("ISBN");    
                dts[4] = rs.getString("fecha_prestamo");
                dts[5] = rs.getString("fecha_devolucion"); 
                myModel.addRow(dts);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return myModel;
    }
    
    
     public String insertarPrestamos(DPrestamos misPrestamos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_agregar_rentas(?,?,?,?) }");
            cst.setString(1, misPrestamos.getId_l());
            cst.setInt(2, misPrestamos.getId_al());
            cst.setInt(3, misPrestamos.getId_emp());
            cst.setDate(4, misPrestamos.getDateDev());
            
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     
     public String editarPrestamos(DPrestamos misPrestamos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_editar_rentas(?,?,?,?,?) }");
            cst.setString(1, misPrestamos.getId_l());
            cst.setInt(2, misPrestamos.getId());
            cst.setInt(3, misPrestamos.getId_al());
            cst.setInt(4, misPrestamos.getId_emp());
            cst.setDate(5, misPrestamos.getDateDev());

            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     
     public String eliminarPrestamos(DPrestamos misPrestamos){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_eliminar_rentas(?) }");
            cst.setInt(1, misPrestamos.getId());
            cst.executeUpdate();
            msg = "si";
            
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
     
     public DefaultTableModel verHistorial(DPrestamos misPrestamos) {
        String profile = "";
        DefaultTableModel myModel = null;
        try{
            String titles[] = {"ID", "Mat. Alumno", "ID Docente", "ISBN", "Fecha Prestamo", "Fecha Devolucion"};
            String dts[] = new String [6];
            myModel = new DefaultTableModel(null, titles);
            CallableStatement cst = cn.prepareCall("{ call sp_ver_historial(?)}");
            cst.setString(1, misPrestamos.getId_l());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_renta");
                dts[1] = rs.getString("matricula_alumno");
                dts[2] = rs.getString("id_trabajador");
                dts[3] = rs.getString("ISBN");    
                dts[4] = rs.getString("fecha_prestamo");
                dts[5] = rs.getString("fecha_devolucion"); 
                myModel.addRow(dts);
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return myModel;
    }
}
