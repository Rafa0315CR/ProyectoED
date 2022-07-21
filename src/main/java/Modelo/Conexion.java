/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafig
 */
public class Conexion {

    public static Connection getConexion() {

        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=ProyectoEstructuras;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "user=sa;"
                + "password=jzjxqk05;"
                + "loginTimeout=30;";
        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

}
