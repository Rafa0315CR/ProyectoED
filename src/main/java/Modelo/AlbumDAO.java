/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafig
 */
public class AlbumDAO {
    
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();
    
    public void filtrarTablaPorNombre(JTable table, String filtro) {
        String[] titulos = {"ID_PERSONAJES", "NOMBRE", "CATEGORIA", "PODER", "COLOR"};
        String[] registros = new String[5];
        //filtro = ;
        String sql = "SELECT * FROM Personajes WHERE NOMBRE LIKE '%" + filtro + "%'";
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("ID_PERSONAJES");
                registros[1] = rs.getString("NOMBRE");
                registros[2] = rs.getString("CATEGORIA");
                registros[3] = rs.getString("PODER");
                registros[4] = rs.getString("COLOR");
                modelo.addRow(registros);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
    }
    
}
