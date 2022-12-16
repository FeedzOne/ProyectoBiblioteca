/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.DUsuarios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author FeedzOne
 */
public class LUsuarios {
    Connection cn = LConexion.getConnection();
    
    
    public String validarLogin(DUsuarios misUsuarios) {
        String profile = "";
        try{
            CallableStatement cst = cn.prepareCall("{ call sp_validar_usuario(?,?)}");
            cst.setString(1, misUsuarios.getUsuario());
            cst.setString(2, misUsuarios.getPsd());
            ResultSet rs = cst.executeQuery();
            if(rs.first()){
                profile = rs.getString("id_tipo_trabajador");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();    
        }
        return profile;
    }
}
