/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logica.Gestor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author matias
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    Gestor gestor;
    
    public VentanaPrincipal(Gestor gestor) {
        initComponents();
        this.gestor = gestor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cerrar = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mnbMenuPrincipal = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generación de Números Aleatorios");

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_show.setText("Mostrar Integrantes");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/1_B7d5Fr27lsH3uHvzF720IA.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jButton1.setText("Generador Congruencial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGeneradorCongruencialActionPerformed(evt);
            }
        });

        jButton2.setText("Prueba ji cuadrado Java");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniJiCuadradoJavaActionPerformed(evt);
            }
        });

        jButton3.setText("Prueba ji cuadrado Congruencial");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniJiCuadradoCongruencialActionPerformed(evt);
            }
        });
        setJMenuBar(mnbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_show))
                .addContainerGap())
        );

        btn_cerrar.getAccessibleContext().setAccessibleName("btnCerrar");
        btn_show.getAccessibleContext().setAccessibleName("btn_show");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniGeneradorCongruencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGeneradorCongruencialActionPerformed
        VentanaGeneradorCongruencial vtn = new VentanaGeneradorCongruencial(this.gestor);
        vtn.setVisible(true);
    }//GEN-LAST:event_mniGeneradorCongruencialActionPerformed

    private void mniJiCuadradoJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniJiCuadradoJavaActionPerformed
        VentanaJiCuadradoJava vtn = new VentanaJiCuadradoJava(this.gestor);
        vtn.setVisible(true);
    }//GEN-LAST:event_mniJiCuadradoJavaActionPerformed

    private void mniJiCuadradoCongruencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniJiCuadradoCongruencialActionPerformed
        VentanaJiCuadradoCongruencial vtn = new VentanaJiCuadradoCongruencial(this.gestor);
        vtn.setVisible(true);
    }//GEN-LAST:event_mniJiCuadradoCongruencialActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
          JFrame parent = new JFrame();
          String miembros="No olvide dejar el 10 antes de irse.";

    JOptionPane.showMessageDialog(parent, miembros); 
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
          JFrame parent = new JFrame();
          String miembros="Cattaneo, Santiago Daniel"+"\n"+"Malisani Asis, Maria Sol "+"\n"+"Simes Pellegrini, Valter"+"\n"+"Turra, Matias"+"\n";

    JOptionPane.showMessageDialog(parent, miembros);  // TODO add your handling code here:
    }//GEN-LAST:event_btn_showActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar mnbMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
