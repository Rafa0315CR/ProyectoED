/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuarios;
import Modelo.UsuariosDAO;
import Vista.FrmSobres;
import Vista.IniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.Registrarse;

/**
 *
 * @author valen
 */
public class ControllerResgistrarse implements ActionListener {

    Registrarse vistaUsuarios = new Registrarse();
    FrmSobres vistaSobres = new FrmSobres();
    Usuarios v = new Usuarios();
    UsuariosDAO dao = new UsuariosDAO();

    public ControllerResgistrarse(Registrarse frm) {
        this.vistaUsuarios = frm;
        this.vistaUsuarios.btnIngresar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaUsuarios.btnIngresar) {

            if (vistaUsuarios.txtUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaUsuarios, "Debe ingresar un usuario");
            } else if (vistaUsuarios.txtContrasena.toString().isEmpty()) {
                JOptionPane.showMessageDialog(vistaUsuarios, "Debe ingresar una contraseña");
            } else if (vistaUsuarios.txtEdad.toString().isEmpty()) {
                JOptionPane.showMessageDialog(vistaUsuarios, "Debe ingresar una edad");

            } else {
                agregarUsuario();
            }
        }
    }

    private void agregarUsuario() {
        String usuario = vistaUsuarios.txtUsuario.getText();
        String contrasena = vistaUsuarios.txtContrasena.getText();
        String edad = vistaUsuarios.txtEdad.getText();
        String nombre = vistaUsuarios.txtNombre.getText();

        v.setNombre_Usuario(usuario);
        v.setNombre(nombre);
        v.setContrasena(contrasena);
        v.setEdad(edad);
        

        int r = dao.agregarUsuario(v);

        if (r == 1) {
            JOptionPane.showMessageDialog(vistaUsuarios, "USUARIO AGREGADO CORRECTAMENTE");
                IniciarSesion i = new IniciarSesion();
                i.setVisible(true);
                vistaUsuarios.dispose();
                
        } else {
            JOptionPane.showMessageDialog(vistaUsuarios, "USUARIO NO AGREGADO CORRECTAMENTE");

        }
    }
    

}


