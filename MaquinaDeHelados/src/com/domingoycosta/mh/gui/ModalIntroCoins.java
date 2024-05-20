/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.domingoycosta.mh.gui;

import com.domingoycosta.mh.biz.MaquinaHelado;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author dev
 */
public class ModalIntroCoins extends javax.swing.JDialog {

    /**
     * Creates new form ModalIntroCoins
     *
     * @param parent
     * @param modal
     */
    public ModalIntroCoins(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        FlatLightLaf.setup();
        this.padre = (ExecGUI) parent;
        this.labelDineroIntroducido.setText(String.format("%.2f", this.padre.mh.getMonedero()) + "€");
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
        labelDineroIntroducido = new javax.swing.JLabel();
        veinteCents = new javax.swing.JButton();
        cincuentaCents = new javax.swing.JButton();
        euro = new javax.swing.JButton();
        dosEuros = new javax.swing.JButton();
        diezCents1 = new javax.swing.JButton();
        cincoCents = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Insert Coins");
        jLabel1.setToolTipText("");

        labelDineroIntroducido.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 24)); // NOI18N
        labelDineroIntroducido.setText("0 €");
        labelDineroIntroducido.setToolTipText("");
        labelDineroIntroducido.setAlignmentY(0.0F);

        veinteCents.setText("0.20€");
        veinteCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veinteCentsActionPerformed(evt);
            }
        });

        cincuentaCents.setText("0.50€");
        cincuentaCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincuentaCentsActionPerformed(evt);
            }
        });

        euro.setText("1€");
        euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euroActionPerformed(evt);
            }
        });

        dosEuros.setText("2€");
        dosEuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosEurosActionPerformed(evt);
            }
        });

        diezCents1.setText("0.10€");
        diezCents1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diezCents1ActionPerformed(evt);
            }
        });

        cincoCents.setText("0.05€");
        cincoCents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoCentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cincuentaCents)
                        .addGap(18, 18, 18)
                        .addComponent(euro)
                        .addGap(18, 18, 18)
                        .addComponent(dosEuros))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cincoCents)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDineroIntroducido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(diezCents1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(veinteCents)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDineroIntroducido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veinteCents)
                    .addComponent(diezCents1)
                    .addComponent(cincoCents))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dosEuros)
                        .addComponent(cincuentaCents))
                    .addComponent(euro))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veinteCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veinteCentsActionPerformed
        reproducirSonido();

        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 0.20);
        actualizarLabel();
    }//GEN-LAST:event_veinteCentsActionPerformed

    private void cincuentaCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincuentaCentsActionPerformed
        reproducirSonido();

        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 0.50);
        actualizarLabel();
    }//GEN-LAST:event_cincuentaCentsActionPerformed

    private void euroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euroActionPerformed
        reproducirSonido();

        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 1);
        actualizarLabel();
    }//GEN-LAST:event_euroActionPerformed

    private void dosEurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosEurosActionPerformed
        reproducirSonido();

        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 2);
        actualizarLabel();
    }//GEN-LAST:event_dosEurosActionPerformed

    private void diezCents1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diezCents1ActionPerformed
        reproducirSonido();
        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 0.10);
        actualizarLabel();

    }//GEN-LAST:event_diezCents1ActionPerformed

    private void cincoCentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoCentsActionPerformed
        reproducirSonido();
        this.padre.mh.setMonedero(this.padre.mh.getMonedero() + 0.05);
        actualizarLabel();
     }//GEN-LAST:event_cincoCentsActionPerformed

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
            java.util.logging.Logger.getLogger(ModalIntroCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalIntroCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalIntroCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalIntroCoins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ModalIntroCoins dialog = new ModalIntroCoins(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void actualizarLabel() {
        this.labelDineroIntroducido.setText(String.format("%.2f", this.padre.mh.getMonedero()) + "€");
    }

    private void reproducirSonido() {
        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File("./sounds/insertarMoneda.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado, contacte con el administrador de la máquina.");
        } finally {
            try {
                audioInputStream.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error inesperado, contacte con el administrador de la máquina.");
            }
        }
    }
    private ExecGUI padre;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cincoCents;
    private javax.swing.JButton cincuentaCents;
    private javax.swing.JButton diezCents1;
    private javax.swing.JButton dosEuros;
    private javax.swing.JButton euro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDineroIntroducido;
    private javax.swing.JButton veinteCents;
    // End of variables declaration//GEN-END:variables
}