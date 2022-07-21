/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package starwars.Pantallas;

import Vista.FrmSobres;

/**
 *
 * @author javierarguedas
 */
public class DarthMaul extends javax.swing.JFrame {

    /**
     * Creates new form HanSolo
     */
    public DarthMaul() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        HanSolo = new javax.swing.JLabel();
        Poder = new javax.swing.JLabel();
        Arrma = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        Bueno = new javax.swing.JLabel();
        Stars = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        HanSolo.setFont(new java.awt.Font("Herculanum", 1, 36)); // NOI18N
        HanSolo.setForeground(new java.awt.Color(255, 255, 255));
        HanSolo.setText("Darth Maul");
        getContentPane().add(HanSolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 260, 60));

        Poder.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        Poder.setForeground(new java.awt.Color(255, 255, 255));
        Poder.setText("Poder: 800");
        getContentPane().add(Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        Arrma.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        Arrma.setForeground(new java.awt.Color(255, 255, 255));
        Arrma.setText("Arma: Sable de Luz Roja ");
        getContentPane().add(Arrma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 340, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starwars/imagenes/Darth Maul_Easy-Resize.com_Easy-Resize.com.jpg"))); // NOI18N
        imagen.setText("jLabel1");
        getContentPane().add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 380, 500));

        Bueno.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        Bueno.setForeground(new java.awt.Color(255, 255, 255));
        Bueno.setText("Malo");
        getContentPane().add(Bueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 80, 40));

        Stars.setForeground(new java.awt.Color(51, 51, 255));
        Stars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/starwars/imagenes/Por-que-el-espacio-es-oscuro-ENTRADA.jpeg"))); // NOI18N
        Stars.setText("jLabel2");
        getContentPane().add(Stars, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_CerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DarthMaul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarthMaul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarthMaul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarthMaul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarthMaul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrma;
    private javax.swing.JLabel Bueno;
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel HanSolo;
    private javax.swing.JLabel Poder;
    private javax.swing.JLabel Stars;
    private javax.swing.JLabel imagen;
    // End of variables declaration//GEN-END:variables
}
