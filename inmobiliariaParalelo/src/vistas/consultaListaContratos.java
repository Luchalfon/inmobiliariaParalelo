/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Contrato;
import accesoADatos.ContratoData;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class consultaListaContratos extends javax.swing.JInternalFrame {

     private DefaultTableModel modelo = new DefaultTableModel();
  
    public consultaListaContratos() {
        initComponents();
        armarCabecera();
        llenarTabla();
         // Obtén las dimensiones de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcula el centro de la pantalla
        int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
        //int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

        // Establece la ubicación del internal frame en el centro de la pantalla
        setLocation(centerX, getY());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBusqueda = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE CONTRATOS");

        TablaBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaBusqueda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(TablaBusqueda);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/salir1.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(842, 842, 842)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(386, 386, 386)
                                .addComponent(jLabel1)))
                        .addGap(0, 262, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
           
        modelo.addColumn("Apellido Inquilino");
        modelo.addColumn("Nombre Inquilino");
        modelo.addColumn("Tipo Propiedad");
        modelo.addColumn("Direccion Propiedad");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Final");
        modelo.addColumn("Vendedor");
        modelo.addColumn("Vigencia");
        modelo.addColumn("Garante");
        modelo.addColumn("DNI Garante");
      
               
       TablaBusqueda.setModel(modelo);
    }
        private void llenarTabla() {
        ContratoData conData = new ContratoData();
        for (Contrato contr : conData.listarContratos()) {
            modelo.addRow(new Object[]{contr.getInquilino().getApellido(),
                contr.getInquilino().getNombre(),
                contr.getPropiedad().getTipoPropiedad(),
                contr.getPropiedad().getDireccion(),
                contr.getFecha_Inicio(),
                contr.getFecha_Final(),
                contr.getVendedor(),
                (contr.getVigencia())? "no vigente":"vigente",
                contr.getNombreGarante(),
                contr.getDniGarante()});

        }

    }





}
