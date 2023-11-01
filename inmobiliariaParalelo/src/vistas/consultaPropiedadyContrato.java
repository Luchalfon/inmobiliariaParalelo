
package vistas;

import Entidades.Propiedad;
import accesoADatos.PropiedadData;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


import javax.swing.table.DefaultTableModel;

public class consultaPropiedadyContrato extends javax.swing.JInternalFrame {

      private DefaultTableModel modelo = new DefaultTableModel();
  
    public consultaPropiedadyContrato() {
        initComponents();
        llenarCombo();
        
        
        
    }
     private Connection con;
     private Propiedad propiedadSelect;
     private  int idProSelect;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboPropiedades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();

        comboPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropiedadesActionPerformed(evt);
            }
        });

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(comboPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(comboPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropiedadesActionPerformed
        // TODO add your handling code here:
        propiedadSelect = (Propiedad) comboPropiedades.getSelectedItem();
        idProSelect=propiedadSelect.getId_propiedad();
        System.out.println(idProSelect);
    }//GEN-LAST:event_comboPropiedadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPropiedades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
    
    public void llenarCombo() {
            List<Propiedad> propiedades = new ArrayList<>();

            PropiedadData pd = new PropiedadData();
            propiedades = pd.listarPropiedad();

            for (Propiedad p1 : propiedades) {
                comboPropiedades.addItem(p1);

            }
        }
    
    
    
}
