/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aulainformatica.testGUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dev
 */
public class JFrameTest01 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTest01
     */
    public JFrameTest01() {
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

        jLabelSaludo = new javax.swing.JLabel();
        botonSaludo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        addRegistros = new javax.swing.JButton();
        deleteRegistro = new javax.swing.JButton();
        buttonAux = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSaludo.setText("Hola");

        botonSaludo.setText("Saludar");
        botonSaludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaludoActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla1);

        addRegistros.setText("Añadir Registro");
        addRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRegistrosActionPerformed(evt);
            }
        });

        deleteRegistro.setText("Borrar registros");
        deleteRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRegistroActionPerformed(evt);
            }
        });

        buttonAux.setText("Botón Aux");
        buttonAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAuxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelSaludo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addRegistros))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonSaludo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deleteRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAux)))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelSaludo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonSaludo)
                        .addGap(38, 38, 38)
                        .addComponent(addRegistros)
                        .addGap(29, 29, 29)
                        .addComponent(deleteRegistro)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAux)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSaludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaludoActionPerformed
        // TODO add your handling code here:
        if (this.jLabelSaludo.getText().equals("Hola")) {
            this.jLabelSaludo.setText("Adiós");
        } else{
            this.jLabelSaludo.setText("Hola");
        }
    }//GEN-LAST:event_botonSaludoActionPerformed

    private void addRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRegistrosActionPerformed
        DefaultTableModel m = (DefaultTableModel)this.tabla1.getModel();
        Object[] o = {"Pepe","Pérez",20};
        m.addRow(o);
    }//GEN-LAST:event_addRegistrosActionPerformed

    private void deleteRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRegistroActionPerformed
         DefaultTableModel m = (DefaultTableModel)this.tabla1.getModel();
         m.setNumRows(m.getRowCount() - 1);
    }//GEN-LAST:event_deleteRegistroActionPerformed

    private void buttonAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAuxActionPerformed
        JDialogTest01 aux = new JDialogTest01(this, true);
        aux.setVisible(true);
    }//GEN-LAST:event_buttonAuxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTest01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRegistros;
    private javax.swing.JButton botonSaludo;
    private javax.swing.JButton buttonAux;
    private javax.swing.JButton deleteRegistro;
    private javax.swing.JLabel jLabelSaludo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
