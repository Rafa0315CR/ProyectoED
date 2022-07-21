/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Sobres;
import Modelo.SobresDAO;
import Vista.Album;
import Vista.FrmSobres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import starwars.Pantallas.Anakin;
import starwars.Pantallas.Ansoka;
import starwars.Pantallas.BB8;
import starwars.Pantallas.Chewbacca;
import starwars.Pantallas.CondeDooku;
import starwars.Pantallas.DarthMaul;
import starwars.Pantallas.Finn;
import starwars.Pantallas.HanSolo;
import starwars.Pantallas.Jabba;
import starwars.Pantallas.JarJar;
import starwars.Pantallas.JynErs;
import starwars.Pantallas.KylonRen;
import starwars.Pantallas.Leia;
import starwars.Pantallas.ObiWan;
import starwars.Pantallas.PoeDamero;
import starwars.Pantallas.R2D2;
import starwars.Pantallas.Wicket;
import starwars.Pantallas.Yoda;

/**
 *
 * @author ashle
 */
public class ControllerSobres implements ActionListener {

    FrmSobres vistaSobres = new FrmSobres();
    Album vistaAlbum = new Album();
    Sobres a = new Sobres();
    SobresDAO dao = new SobresDAO();
    ControllerAlbum c = new ControllerAlbum(vistaAlbum);

    private int r;

    public ControllerSobres(FrmSobres frm) { //Paso 3

        this.vistaSobres = frm;
        this.vistaSobres.btnObtener.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaSobres.btnObtener) {

            obtener();
            c.filtrarTablaPorNombre(vistaAlbum.tblSobres, "");

        }
    }

    public void obtener() {

        //Sobres sob = new Sobres();
        Sobres sob1 = new Sobres("Han Solo", "Bueno", 1223, "Arma Laser");
        Sobres sob2 = new Sobres("Poe Damero", "Bueno", 1321, "Arma Laser");
        Sobres sob3 = new Sobres("Obi Wan Kenobi", "Bueno", 324, "Sable Azul");
        Sobres sob4 = new Sobres("Anakin", "Malo", 4252, "Sable Rojo");
        Sobres sob5 = new Sobres("Wicket", "Malo", 5000, "Arma Laser");
        Sobres sob6 = new Sobres("Jar Jar", "Bueno", 2342, "Sable Rojo");
        Sobres sob7 = new Sobres("Ansoka", "Malo", 1245, "Sable Blanco");
        Sobres sob8 = new Sobres("Leia", "Bueno", 4141, "Arma Laser");
        Sobres sob9 = new Sobres("Darth Maul", "Malo", 7864, "Sable Rojo");
        Sobres sob10 = new Sobres("Finn", "Malo", 2145, "Sable Rojo");
        Sobres sob11 = new Sobres("R2D2", "Bueno", 123, "Scanner Rojo");
        Sobres sob12 = new Sobres("BB-8", "Bueno", 543, "Scaneer Rojo");
        Sobres sob13 = new Sobres("Conde Dooku", "Malo", 12, "Sable Rojo");
        Sobres sob14 = new Sobres("Jabba", "Malo", 2145, "No Tiene");
        Sobres sob15 = new Sobres("Kylon Ren", "Malo", 674, "Sable Rojo");
        Sobres sob16 = new Sobres("Jyn Erso", "Bueno", 12345, "No tiene");
        Sobres sob17 = new Sobres("Chewbacca", "Bueno", 123, "No tiene");
        Sobres sob18 = new Sobres("Yoda", "Bueno", 654, "Sable Verde");
        Sobres sob19 = new Sobres("Quin-gon Jinn", "Bueno", 1245, "Sable Verde");
        Sobres sob20 = new Sobres("Grogu", "Bueno", 1244, "No tiene");

        System.out.println(vistaSobres.lblHora.getText());

        for (int i = 1; i < 4; i++) {

            int aleatorio = (int) (Math.random() * 19 + 1);

            switch (aleatorio) {

                case 1:

                    HanSolo b7 = new HanSolo();
                    b7.setVisible(true);

                    a.setNombre(sob1.getNombre());
                    a.setCategoria(sob1.getCategoria());
                    a.setPoder(sob1.getPoder());
                    a.setColor(sob1.getColor());
                    int r = dao.agregarSobres(a);
                    break;

                case 2:

                    PoeDamero b13 = new PoeDamero();
                    b13.setVisible(true);

                    a.setNombre(sob2.getNombre());
                    a.setCategoria(sob2.getCategoria());
                    a.setPoder(sob2.getPoder());
                    a.setColor(sob2.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 3:

                    ObiWan b12 = new ObiWan();
                    b12.setVisible(true);

                    a.setNombre(sob3.getNombre());
                    a.setCategoria(sob3.getCategoria());
                    a.setPoder(sob3.getPoder());
                    a.setColor(sob3.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 4:

                    Anakin a1 = new Anakin();
                    a1.setVisible(true);

                    a.setNombre(sob4.getNombre());
                    a.setCategoria(sob4.getCategoria());
                    a.setPoder(sob4.getPoder());
                    a.setColor(sob4.getColor());
                    r = dao.agregarSobres(a);

                case 5:
                    Wicket w = new Wicket();
                    w.setVisible(true);

                    a.setNombre(sob5.getNombre());
                    a.setCategoria(sob5.getCategoria());
                    a.setPoder(sob5.getPoder());
                    a.setColor(sob5.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 6:

                    JarJar b8 = new JarJar();
                    b8.setVisible(true);

                    a.setNombre(sob6.getNombre());
                    a.setCategoria(sob6.getCategoria());
                    a.setPoder(sob6.getPoder());
                    a.setColor(sob6.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 7:

                    Ansoka a2 = new Ansoka();
                    a2.setVisible(true);

                    a.setNombre(sob7.getNombre());
                    a.setCategoria(sob7.getCategoria());
                    a.setPoder(sob7.getPoder());
                    a.setColor(sob7.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 8:

                    Leia b11 = new Leia();
                    b11.setVisible(true);

                    a.setNombre(sob8.getNombre());
                    a.setCategoria(sob8.getCategoria());
                    a.setPoder(sob8.getPoder());
                    a.setColor(sob8.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 9:

                    DarthMaul b4 = new DarthMaul();
                    b4.setVisible(true);

                    a.setNombre(sob9.getNombre());
                    a.setCategoria(sob9.getCategoria());
                    a.setPoder(sob9.getPoder());
                    a.setColor(sob9.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 10:

                    Finn b5 = new Finn();
                    b5.setVisible(true);

                    a.setNombre(sob10.getNombre());
                    a.setCategoria(sob10.getCategoria());
                    a.setPoder(sob10.getPoder());
                    a.setColor(sob10.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 11:

                    R2D2 b14 = new R2D2();
                    b14.setVisible(true);

                    a.setNombre(sob11.getNombre());
                    a.setCategoria(sob11.getCategoria());
                    a.setPoder(sob11.getPoder());
                    a.setColor(sob11.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 12:

                    BB8 b1 = new BB8();
                    b1.setVisible(true);

                    a.setNombre(sob12.getNombre());
                    a.setCategoria(sob12.getCategoria());
                    a.setPoder(sob12.getPoder());
                    a.setColor(sob12.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 13:

                    CondeDooku b3 = new CondeDooku();
                    b3.setVisible(true);

                    a.setNombre(sob13.getNombre());
                    a.setCategoria(sob13.getCategoria());
                    a.setPoder(sob13.getPoder());
                    a.setColor(sob13.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 14:

                    Jabba b21 = new Jabba();
                    b21.setVisible(true);

                    a.setNombre(sob14.getNombre());
                    a.setCategoria(sob14.getCategoria());
                    a.setPoder(sob14.getPoder());
                    a.setColor(sob14.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 15:

                    KylonRen b10 = new KylonRen();
                    b10.setVisible(true);

                    a.setNombre(sob15.getNombre());
                    a.setCategoria(sob15.getCategoria());
                    a.setPoder(sob15.getPoder());
                    a.setColor(sob15.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 16:

                    JynErs b9 = new JynErs();
                    b9.setVisible(true);

                    a.setNombre(sob16.getNombre());
                    a.setCategoria(sob16.getCategoria());
                    a.setPoder(sob16.getPoder());
                    a.setColor(sob16.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 17:

                    Chewbacca b2 = new Chewbacca();
                    b2.setVisible(true);

                    a.setNombre(sob17.getNombre());
                    a.setCategoria(sob17.getCategoria());
                    a.setPoder(sob17.getPoder());
                    a.setColor(sob17.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 18:

                    Yoda b16 = new Yoda();
                    b16.setVisible(true);

                    a.setNombre(sob18.getNombre());
                    a.setCategoria(sob18.getCategoria());
                    a.setPoder(sob18.getPoder());
                    a.setColor(sob18.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 19:

                    a.setNombre(sob19.getNombre());
                    a.setCategoria(sob19.getCategoria());
                    a.setPoder(sob19.getPoder());
                    a.setColor(sob19.getColor());
                    r = dao.agregarSobres(a);
                    break;

                case 20:

                    a.setNombre(sob20.getNombre());
                    a.setCategoria(sob20.getCategoria());
                    a.setPoder(sob20.getPoder());
                    a.setColor(sob20.getColor());
                    r = dao.agregarSobres(a);
                    break;

            }

        }

    }
    


}
