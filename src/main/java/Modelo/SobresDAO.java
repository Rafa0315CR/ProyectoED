/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lgfon
 */
public class SobresDAO {

    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conectar = new Conexion();

    public int agregarSobres(Sobres user) {

        int r = 0;
        String sql = "INSERT INTO Personajes (NOMBRE, CATEGORIA, PODER, COLOR, ID_USUARIOS) VALUES (?,?,?,?,?)";

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getCategoria());
            ps.setInt(3, user.getPoder());
            ps.setString(4, user.getColor());
            ps.setInt(5, 1);

            r = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

   /* public Sobres buscarSobres(int Seccion) {
        String sql = "SELECT * FROM atracciones WHERE seccion = " + Seccion;
        Atracciones Resultado = new Atracciones();
        try {
            con = conectar.getConecction();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Resultado.setIdAtraccion(rs.getInt("IdAtracciones"));
                Resultado.setNombreAtraccion(rs.getString("nombre"));
                Resultado.setFechaInstalacion(rs.getString("fechaInstalacion"));
                Resultado.setCapacidad(rs.getInt("capacidad"));
                Resultado.setSeccion(rs.getString("seccion"));
                Resultado.setRangoEdad(rs.getString("rangoEdad"));
                Resultado.setPrecio(rs.getInt("precio"));
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar los datos " + e.getMessage());
            Resultado.setIdAtraccion(-1);
        }
        return Resultado;
    }

*/

}
