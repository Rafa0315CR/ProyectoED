/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Conexion;
import Modelo.Usuarios;
import Vista.FrmSobres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author valen
 */
public class UsuariosDAO {
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();
    
    public int agregarUsuario(Usuarios user) {

        int r = 0;
        String sql = "INSERT INTO Usuarios (NOMBRE_USUARIO, NOMBRE, CONSTRASENA, EDAD) VALUES (?,?,?,?)";
        try {
            con = conectar.getConexion(); 
            ps = con.prepareStatement(sql); 
            ps.setString(1, user.getNombre_Usuario());
            ps.setString(2, user.getNombre());   
            ps.setString(3, user.getContrasena());  
            ps.setString(4, user.getEdad());  
            r = ps.executeUpdate(); //4: Ejecutar query 0= Fallo 1= success
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }
    
        public boolean frmLogin(Usuarios user) {

        String sql = "SELECT ID, NOMBRE_USUARIO, NOMBRE, CONSTRASENA, EDAD FROM Usuarios WHERE NOMBRE_USUARIO = ?";

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre_Usuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                
                if (user.getNombre_Usuario().equals(rs.getString("NOMBRE_USUARIO")) && user.getContrasena().equals(rs.getString("CONSTRASENA"))) {
                    
                    user.setNombre_Usuario(rs.getString("NOMBRE_USUARIO"));
                    user.setContrasena(rs.getString("CONSTRASENA"));
                    user.setId(rs.getInt("ID"));
                    
                    FrmSobres s = new FrmSobres();
                    
                    String usuario = user.getNombre_Usuario();
                    int id = user.getId();
                    
                    s.lblIdUsuario.setText(String.valueOf(id));
                    s.lblNombreUsuario.setText(usuario);

                    return true;
                } else {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
        
}
