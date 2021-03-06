/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Logica.Gestor;
import Logica.Item;
import Logica.ListaFrecuenciaIntervalo;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author matias
 */
public class VentanaJiCuadradoJava extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    Gestor gestor;
    ListaFrecuenciaIntervalo listFI;
    
    public VentanaJiCuadradoJava(Gestor gestor) {
        initComponents();
        
        this.gestor = gestor;
        
//        btgIntervalosT.add(rbtT5);
//        btgIntervalosT.add(rbtT10);
//        btgIntervalosT.add(rbtT20);
//        btgIntervalosT.add(rbtTOtro);//DANI LO AGREGO ------------------------
//        rbtT20.setSelected(true);
        btnGraficar.setEnabled(false);
     //   txtIntervaloOtro.setEnabled(false);//DANI LO AGREGO ------------------------
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgIntervalosT = new javax.swing.ButtonGroup();
        pnlJuCuadradoJava = new javax.swing.JPanel();
        txtTamanioN = new javax.swing.JTextField();
        lblTamanioN = new javax.swing.JLabel();
        lblIntervalos = new javax.swing.JLabel();
        scpTblFrecuencias = new javax.swing.JScrollPane();
        tblFrecuencias = new javax.swing.JTable();
        lblFrecuencias = new javax.swing.JLabel();
        btnGenerarNumeros = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtIntervaloOtro = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prueba ji cuadrado generador Java");

        lblTamanioN.setText("Tamaño de muestra (N):");

        lblIntervalos.setText("Cantidad de intervalos (T):");

        tblFrecuencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Intervalo", "Frecuencia"
            }
        ));
        scpTblFrecuencias.setViewportView(tblFrecuencias);

        lblFrecuencias.setText("Cantidad de números por intervalo:");

        btnGenerarNumeros.setText("Generar números");
        btnGenerarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumerosActionPerformed(evt);
            }
        });

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        txtIntervaloOtro.setColumns(1);
        txtIntervaloOtro.setRows(1);
        jScrollPane1.setViewportView(txtIntervaloOtro);

        javax.swing.GroupLayout pnlJuCuadradoJavaLayout = new javax.swing.GroupLayout(pnlJuCuadradoJava);
        pnlJuCuadradoJava.setLayout(pnlJuCuadradoJavaLayout);
        pnlJuCuadradoJavaLayout.setHorizontalGroup(
            pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerarNumeros)
                    .addComponent(btnGraficar)
                    .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                        .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIntervalos)
                            .addComponent(lblTamanioN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTamanioN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFrecuencias)
                    .addComponent(scpTblFrecuencias, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlJuCuadradoJavaLayout.setVerticalGroup(
            pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTamanioN)
                            .addComponent(lblFrecuencias)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJuCuadradoJavaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTamanioN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlJuCuadradoJavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIntervalos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarNumeros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGraficar))
                    .addGroup(pnlJuCuadradoJavaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpTblFrecuencias, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(pnlJuCuadradoJava, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumerosActionPerformed
        int n = -1;
        try {
            n = Integer.parseInt(txtTamanioN.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        if( n > 0) {
       //     Enumeration<AbstractButton> elements = btgIntervalosT.getElements();
            int intervalos = 20;
           //VALTER AGREGO ---
            try {
            intervalos = Integer.parseInt(txtIntervaloOtro.getText());
            }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
//          //VALTER AGREGO ---
//            while( elements.hasMoreElements() ){
//                AbstractButton a = elements.nextElement();
//                if( a.isSelected() ){
//                    if(a.getText().equals("Otro:")){//DANI LO AGREGO ------------------------
//                        intervalos = Integer.parseInt(txtIntervaloOtro.getText());//DANI LO AGREGO ------------------------
//                        //System.out.println(intervalos); lo hice para debugear
//                    }else{
//                        intervalos = Integer.parseInt(a.getText()); //DANI LO AGREGO ------------------------
//                    }
//                    break;
//                }
//            }
            this.listFI = gestor.generarFrecuenciasJiCuadrado(Gestor.GENERADOR_JAVA, 
                n,
                intervalos,
                6,
                0, 
                0, 
                0,
                (int) System.currentTimeMillis()
            );
            //Acá llenamos la tabla
            //Tomamos el nombre de las columnas
            int cantColumnas = ((DefaultTableModel)tblFrecuencias.getModel()).getColumnCount();
            Object[] columnas = new Object[cantColumnas];
            for (int i = 0; i < cantColumnas; i++) {
                columnas[i] = ((DefaultTableModel)tblFrecuencias.getModel()).getColumnName(i);
            }
            //Armamos las filas
            int cantFilas = intervalos;
            Object[][] filas = new Object[cantFilas][cantColumnas];
            int i = 0;
            for(Item it: this.listFI.getList()) {
                Object[] fila = new Object[2];
                fila[0] = it.getIntervalo();
                fila[1] = it.getFrecuencia();
                filas[i] = fila;
                i++;
            }
            //seteamos la tabla
            ((DefaultTableModel)tblFrecuencias.getModel()).setDataVector(filas, columnas);
        }
        
        btnGraficar.setEnabled(true);
    }//GEN-LAST:event_btnGenerarNumerosActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
                
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // El DefaultCategoryDataset es un objeto que contiene los datos que el 
        // Chart graficará
        // * Llenar el Dataset con los datos de la tabla.
        for(Item it: this.listFI.getList())
        {
            dataset.addValue(it.getFrecuencia(), "Frecuencia", it.getIntervalo());
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Frecuencias e Intérvalos",
            "Intevalos",
            "Frecuencias",
            dataset,
            PlotOrientation.VERTICAL,
            false,
            true,
            false
        );
        ChartPanel cPanel = new ChartPanel(chart);
        // ChartPanel es una clase que hereda de JPanel que contendrá el 
        // JFreeChart que se acaba de crear.
        
        VentanaGrafica vtn = new VentanaGrafica();
       vtn.setTitle(this.getTitle());
        vtn.getContentPane().add(cPanel);
        vtn.pack(); //hace que la ventana tome su PreferedSize
        vtn.setVisible(true);
    }//GEN-LAST:event_btnGraficarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgIntervalosT;
    private javax.swing.JButton btnGenerarNumeros;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFrecuencias;
    private javax.swing.JLabel lblIntervalos;
    private javax.swing.JLabel lblTamanioN;
    private javax.swing.JPanel pnlJuCuadradoJava;
    private javax.swing.JScrollPane scpTblFrecuencias;
    private javax.swing.JTable tblFrecuencias;
    private javax.swing.JTextArea txtIntervaloOtro;
    private javax.swing.JTextField txtTamanioN;
    // End of variables declaration//GEN-END:variables
}
