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
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author USER
 */
public class consultarVigenciaContrato extends javax.swing.JInternalFrame {

     private DefaultTableModel modelo = new DefaultTableModel();

    public consultarVigenciaContrato() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVigencia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tablaVigencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaVigencia);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA VIGENCIA DE CONTRATOS");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVigencia;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
           
        modelo.addColumn("Id Contrato");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo Propiedad");
        modelo.addColumn("Direccion");
        modelo.addColumn("Fecha inicio");
        modelo.addColumn("Fecha final");
        modelo.addColumn("Vigencia");
        modelo.addColumn("Dias");
       tablaVigencia.setModel(modelo);
    }

    private void llenarTabla() {
        ContratoData conData = new ContratoData();
        // Date dateHoy = Date.valueOf(LocalDate.now());
        java.util.Date fechaactual = new java.util.Date(System.currentTimeMillis());
        
         int dias;
         int milisecondsByDay = 86400000;
        for (Contrato contr : conData.listarContratosVigentes()) {
            modelo.addRow(new Object[]{contr.getId_contrato(),
                                        contr.getInquilino().getApellido(),
                                         contr.getInquilino().getNombre(),
                                         contr.getPropiedad().getTipoPropiedad(),
                                         contr.getPropiedad().getDireccion(),
                                         contr.getFecha_Inicio(),
                                         contr.getFecha_Final(),
                                         contr.getVigencia(),
                                         dias= (int) ((( contr.getFecha_Final().getTime() - fechaactual.getTime()) / milisecondsByDay) + 1)
                                         });

        }

    }

}
