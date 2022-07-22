/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Conexion;
import Vista.FrmSobres;
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
public class MostrarDAO {

    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();

    
     public void filtrarTablaPorBueno(JTable table, String filtro) {
        String[] titulos = {"NOMBRE", "CATEGORIA", "PODER", "COLOR"};
        String[] registros = new String[4];
        //filtro = ;
        String sql = "Select DISTINCT NOMBRE, CATEGORIA, PODER, COLOR FROM Personajes WHERE CATEGORIA LIKE '%Bueno%'";
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CATEGORIA");
                registros[2] = rs.getString("PODER");
                registros[3] = rs.getString("COLOR");
                modelo.addRow(registros);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
    }
     
     public void filtrarTablaPorMalo(JTable table, String filtro) {
        String[] titulos = {"NOMBRE", "CATEGORIA", "PODER", "COLOR"};
        String[] registros = new String[4];
        //filtro = ;
        String sql = "Select DISTINCT NOMBRE, CATEGORIA, PODER, COLOR FROM Personajes WHERE CATEGORIA LIKE '%Malo%'";
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CATEGORIA");
                registros[2] = rs.getString("PODER");
                registros[3] = rs.getString("COLOR");
                modelo.addRow(registros);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
    }
     
     public void filtrarTablaPorTodos(JTable table, String filtro) {
        String[] titulos = {"NOMBRE", "CATEGORIA", "PODER", "COLOR"};
        String[] registros = new String[4];
        //filtro = ;
        String sql = "Select DISTINCT NOMBRE, CATEGORIA, PODER, COLOR FROM Personajes WHERE CATEGORIA LIKE '%%'";
        DefaultTableModel modelo;
        modelo = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("NOMBRE");
                registros[1] = rs.getString("CATEGORIA");
                registros[2] = rs.getString("PODER");
                registros[3] = rs.getString("COLOR");
                modelo.addRow(registros);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
        }
    }
}
