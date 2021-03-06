/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.ConexionBD;

/**
 *
 * @author nanyt
 */
public class FrmPrincipal extends javax.swing.JFrame {

    FrmGestionMarcas frmMarcas;
    FrmGestionModelos frmModelos;
    FrmAltasCompu frmAltasCompu;
    FrmBajasCompu frmBajasCompu;
    FrmCambiosCompu frmCambiosCompu;
    FrmConsultasCompu frmConsultasCompu;
    FrmAcercaDe frmAcercaDe;
    FrmGestionMarcas frmGestionMarcas;
    FrmGestionModelos frmGestionModelos;
    ConexionBD con;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        con = new ConexionBD("sucursal");
        frmConsultasCompu = new FrmConsultasCompu(con);
        frmAltasCompu = new FrmAltasCompu(con);
        frmMarcas = new FrmGestionMarcas(con);
        frmModelos = new FrmGestionModelos(con);
        frmBajasCompu = new FrmBajasCompu(con);
        frmCambiosCompu = new FrmCambiosCompu(con);
        frmAcercaDe = new FrmAcercaDe(con);
        frmGestionMarcas = new FrmGestionMarcas(con);
        frmGestionModelos = new FrmGestionModelos(con);
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

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAltas = new javax.swing.JMenu();
        menuAltasAutos = new javax.swing.JMenuItem();
        menuBajas = new javax.swing.JMenuItem();
        menuCambios = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuAcerca = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuAltas1 = new javax.swing.JMenu();
        menuMarcas = new javax.swing.JMenuItem();
        menuModelos = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("AngryBirds", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("RENTA DE AUTOS \"EUROCAR\"");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario de Cómputo v1.0");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INVENTARIO DE COMPUTADORAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        menuAltas.setText("COMPUTADORAS");
        menuAltas.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        menuAltasAutos.setBackground(new java.awt.Color(0, 0, 102));
        menuAltasAutos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuAltasAutos.setText("ALTAS");
        menuAltasAutos.setBorderPainted(true);
        menuAltasAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltasAutosActionPerformed(evt);
            }
        });
        menuAltas.add(menuAltasAutos);

        menuBajas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuBajas.setText("BAJAS");
        menuBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBajasActionPerformed(evt);
            }
        });
        menuAltas.add(menuBajas);

        menuCambios.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuCambios.setText("CAMBIOS");
        menuCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiosActionPerformed(evt);
            }
        });
        menuAltas.add(menuCambios);

        menuConsultas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuConsultas.setText("CONSULTAS");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        menuAltas.add(menuConsultas);
        menuAltas.add(jSeparator2);

        menuAcerca.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuAcerca.setText("ACERCA DE");
        menuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaActionPerformed(evt);
            }
        });
        menuAltas.add(menuAcerca);

        menuSalir.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuSalir.setText("SALIR");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuAltas.add(menuSalir);

        jMenuBar1.add(menuAltas);

        menuAltas1.setText("CATÁLOGOS");
        menuAltas1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        menuMarcas.setBackground(new java.awt.Color(0, 0, 102));
        menuMarcas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuMarcas.setText("MARCAS");
        menuMarcas.setBorderPainted(true);
        menuMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMarcasActionPerformed(evt);
            }
        });
        menuAltas1.add(menuMarcas);

        menuModelos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        menuModelos.setText("MODELOS");
        menuModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModelosActionPerformed(evt);
            }
        });
        menuAltas1.add(menuModelos);

        jMenuBar1.add(menuAltas1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAltasAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltasAutosActionPerformed
        // TODO add your handling code here:
        frmAltasCompu.setVisible(true);
    }//GEN-LAST:event_menuAltasAutosActionPerformed

    private void menuBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBajasActionPerformed
        // TODO add your handling code here:
        frmBajasCompu.setVisible(true);
    }//GEN-LAST:event_menuBajasActionPerformed

    private void menuCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiosActionPerformed
        // TODO add your handling code here:
        frmCambiosCompu.setVisible(true);
    }//GEN-LAST:event_menuCambiosActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        // TODO add your handling code here:
        frmConsultasCompu.setVisible(true);
    }//GEN-LAST:event_menuConsultasActionPerformed

    private void menuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaActionPerformed
        // TODO add your handling code here:
        frmAcercaDe.setVisible(true);
    }//GEN-LAST:event_menuAcercaActionPerformed

    private void menuMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMarcasActionPerformed
        // TODO add your handling code here:
        frmGestionMarcas.setVisible(true);
    }//GEN-LAST:event_menuMarcasActionPerformed

    private void menuModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModelosActionPerformed
        // TODO add your handling code here:
        frmGestionModelos.setVisible(true);
    }//GEN-LAST:event_menuModelosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuAcerca;
    private javax.swing.JMenu menuAltas;
    private javax.swing.JMenu menuAltas1;
    private javax.swing.JMenuItem menuAltasAutos;
    private javax.swing.JMenuItem menuBajas;
    private javax.swing.JMenuItem menuCambios;
    private javax.swing.JMenuItem menuConsultas;
    private javax.swing.JMenuItem menuMarcas;
    private javax.swing.JMenuItem menuModelos;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
