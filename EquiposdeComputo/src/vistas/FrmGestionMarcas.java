/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.ConexionBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanyt
 */
public class FrmGestionMarcas extends javax.swing.JFrame {

    ConexionBD con;
    //ConexionBD con = new ConexionBD("sucursal");

    /**
     * Creates new form FrmGestionMarcas
     */
    public FrmGestionMarcas(ConexionBD con) {
        this.con = con;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarcas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("MARCA:");

        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnSalir.setBackground(new java.awt.Color(0, 0, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 0, 51));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregar.setBorderPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificar.setBorderPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tblMarcas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IdMarca", "Marca"
            }
        ));
        tblMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMarcasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMarcas);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CATÁLOGO DE MARCAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMarca)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String enunciadoSQL;
        int nr;         //Número de registros 
        int idMarca;
        String marca;
        limpiarTabla();
        Object[][] datos;

        marca = txtMarca.getText();
        if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Escribe una marca.");
            formWindowOpened(null);
        } else {

            enunciadoSQL = "SELECT * FROM marca WHERE marca LIKE '%" + marca + "%'";
            con.consultar(enunciadoSQL);
            nr = con.getNumRegistros();
            datos = new Object[nr][2];
            //tblMarcas.setModel(new DefaultTableModel(datos));
            //tblMarcas.setModel(new DefaultTableModel(datos));

            if (con.irPrimero()) {
                for (int i = 0; i < nr; i++) {
                    idMarca = Integer.parseInt(con.obtenerCampo("idmarca"));
                    marca = con.obtenerCampo("marca");
                    tblMarcas.setValueAt(idMarca, i, 0);
                    tblMarcas.setValueAt(marca, i, 1);
                    con.irSiguiente();
                    //formWindowOpened(null);
                    txtMarca.setText("");
                    //limpiarTabla();
                }
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String marca;
        String enunciadoSQL;

        if (txtMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa una marca.");
        } else {
            marca = txtMarca.getText().toUpperCase().trim();
            enunciadoSQL = "INSERT INTO marca (marca) VALUES ('" + marca + "')";
            con.actualizar(enunciadoSQL);
            limpiarTabla();
            formWindowOpened(null);
            txtMarca.setText("");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String enunciadoSQL;
        int pos;        //Posición del registro seleccionado para eliminar
        int id = 0;
        int op;         //Opción de confirmación

        pos = tblMarcas.getSelectedRow();

        if (pos != -1 && tblMarcas.getValueAt(pos, id) != null) {
            if (pos != -1) {
                op = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar "
                        + "esta marca?");

                if (op == JOptionPane.OK_OPTION) {
                    id = Integer.parseInt(tblMarcas.getValueAt(pos, 0).toString());
                    enunciadoSQL = "DELETE FROM marca WHERE idMarca = " + id + "";
                    con.actualizar(enunciadoSQL);
                    limpiarTabla();
                    formWindowOpened(null);
                    txtMarca.setText("");

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro");

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int pos;
        int id = 0;
        String marca;
        String enunciadoSQL;
        int op;         //Opción de confirmación

        pos = tblMarcas.getSelectedRow();
        //no jala
        if (pos != -1 && tblMarcas.getValueAt(pos, id) != null) {
            if (pos != -1) {
                op = JOptionPane.showConfirmDialog(this, "¿Estás seguro de modificar "
                        + "esta marca?");
                if (op == JOptionPane.OK_OPTION) {
                    id = Integer.parseInt(tblMarcas.getValueAt(pos, 0).toString());
                    marca = txtMarca.getText().toUpperCase();
                    enunciadoSQL = "UPDATE marca SET marca = '" + marca + "' WHERE idmarca=" + id;
                    con.actualizar(enunciadoSQL);
                    limpiarTabla();
                    formWindowOpened(null);
                    txtMarca.setText("");
                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro");
        }
        //this.btnBuscarActionPerformed(null);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String enunciadoSQL;
        int nr;         //Número de registros 
        int idMarca;
        String marca;
        //limpiarTabla();
        Object[][] datos;

        //marca = txtMarca.getText();
        enunciadoSQL = "SELECT * FROM marca";
        con.consultar(enunciadoSQL);
        nr = con.getNumRegistros();
        datos = new Object[nr][2];
        //tblDatos.setModel(new DefaultTableModel(datos));

        if (con.irPrimero()) {
            for (int i = 0; i < nr; i++) {
                idMarca = Integer.parseInt(con.obtenerCampo("idmarca"));
                marca = con.obtenerCampo("marca");
                tblMarcas.setValueAt(idMarca, i, 0);
                tblMarcas.setValueAt(marca, i, 1);
                con.irSiguiente();
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void tblMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMarcasMouseClicked
        // TODO add your handling code here:
        int pos;
        String marca;

        pos = tblMarcas.getSelectedRow();
        if (tblMarcas.getValueAt(pos, 1) != null) {
            marca = tblMarcas.getValueAt(pos, 1).toString();
            txtMarca.setText(marca);
        }
    }//GEN-LAST:event_tblMarcasMouseClicked

    public void limpiarTabla() {
        for (int i = 0; i < tblMarcas.getRowCount(); i++) {
            tblMarcas.setValueAt(null, i, 0);
            tblMarcas.setValueAt(null, i, 1);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMarcas;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables
}
