
package vistas;

import Entidades.Propiedad;
import accesoADatos.PropiedadData;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consultaVariasPropiedades extends javax.swing.JInternalFrame {

     private DefaultTableModel modelos = new DefaultTableModel();
      private DefaultTableModel modelo1 = new DefaultTableModel();
       private DefaultTableModel modelo2 = new DefaultTableModel();
        private DefaultTableModel modelo3 = new DefaultTableModel();
    public consultaVariasPropiedades() {
        initComponents();
    }
private String tipo;
private String zona;
private float precio;
private int superf;
private int seleccion;


  private Connection con;    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboPropiedad = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        salir = new javax.swing.JButton();

        setTitle("Consulta Varias de Propiedades");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedad"));

        comboPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Local", "Zona", "Superficie Minima", "Precio" }));
        comboPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropiedadActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(buscar)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaBusqueda);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropiedadActionPerformed
seleccion=comboPropiedad.getSelectedIndex();






        // TODO add your handling code here:
    }//GEN-LAST:event_comboPropiedadActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        this.dispose();

        
    }//GEN-LAST:event_salirActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

switch ( seleccion){
        case 0:
            //hacer un if asi no calga de nuevo el modelo      
            armarCabeceraTipo();
            tipo= JOptionPane.showInputDialog("Ingrese el Tipo de Propiedad:");
            llenarTablaTipo();
            
           break;
        case 1:
            
            modelo1.setRowCount(0);
            armarCabeceraZona();
            zona=JOptionPane.showInputDialog("Ingrese la Zona de la porpiedad Propiedad deseada: ");
            llenarTablaZona();
   
            
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboPropiedad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaBusqueda;
    // End of variables declaration//GEN-END:variables

private void armarCabeceraTipo() {
        modelos.addColumn("Tipo de Inmueble");    
        modelos.addColumn("Legajo Propiedad");
        modelos.addColumn("Direccion");
        modelos.addColumn("Precio");
         modelos.addColumn("Zona"); 
        

        tablaBusqueda.setModel(modelos);
    }
private void armarCabeceraZona() {
        modelo1.addColumn("Zona");    
        modelo1.addColumn("Legajo Propiedad");
        modelo1.addColumn("Direccion");
        modelo1.addColumn("Precio");
        modelo1.addColumn("Tipo de Inmueble");  
        

        tablaBusqueda.setModel(modelo1);
    }
private void armarCabeceraSuper() {
        modelo2.addColumn("Superficie M2");    
        modelo2.addColumn("Legajo Propiedad");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Tipo de Inmueble");  
        

        tablaBusqueda.setModel(modelo2);
    }

private void armarCabeceraPrecio() {
        modelo3.addColumn("Precio");  
        modelo3.addColumn("Legajo Propiedad");
        modelo3.addColumn("Direccion");
        modelo3.addColumn("Superficie M2");   
        modelo3.addColumn("Tipo de Inmueble");  
        

        tablaBusqueda.setModel(modelo3);
    }


private void llenarTablaTipo() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi : proData.obtenerPropiedadesPorTipo(tipo)) {
            modelos.addRow(new Object[]{propi.getTipoPropiedad(),propi.getId_propiedad(),propi.getDireccion(),propi.getPrecio(),propi.getTipoPropiedad()});

        }

    }

private void llenarTablaZona() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi1 : proData.obtenerPropiedadesPorZona(zona)) {
            modelo1.addRow(new Object[]{propi1.getZona(),propi1.getId_propiedad(),propi1.getDireccion(),propi1.getPrecio(),propi1.getTipoPropiedad()});

        }

    }
/*
private void llenarTablaSuper() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi : proData.obtenerPropiedadesPorPropietario(idProSelect)) {
            modelo.addRow(new Object[]{propi.getId_propiedad(),propi.getDireccion(),propi.getPrecio(),propi.getTipoPropiedad()});

        }

    }

private void llenarTablaPrecio() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi : proData.obtenerPropiedadesPorPropietario(idProSelect)) {
            modelo.addRow(new Object[]{propi.getId_propiedad(),propi.getDireccion(),propi.getPrecio(),propi.getTipoPropiedad()});

        }

    }
*/
}
