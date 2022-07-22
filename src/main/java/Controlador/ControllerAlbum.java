/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlbumDAO;
import Modelo.Sobres;
import Vista.Album;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;

/**
 *
 * @author rafig
 */
public class ControllerAlbum implements ActionListener {

    Album vistaAlbum = new Album();
    AlbumDAO dao = new AlbumDAO();
    
    public ControllerAlbum(Album frm) { //Paso 3

        this.vistaAlbum = frm;

    }
    
        @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void filtrarTablaPorNombre(JTable table, String filtro) {
        dao.filtrarTablaPorNombre(table, filtro);
    }

    public void inicio() {
        filtrarTablaPorNombre(vistaAlbum.tblSobres, "");
    }
}

