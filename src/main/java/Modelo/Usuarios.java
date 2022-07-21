/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author valen
 */
public class Usuarios {

    private int id;
    private String nombre_Usuario;
    private String nombre;
    private String contrasena;
    private String edad;

    public Usuarios() {
    }

    public Usuarios(int id, String nombre_Usuario, String nombre, String contrasena, String edad) {
        this.id = id;
        this.nombre_Usuario = nombre_Usuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.edad = edad;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
