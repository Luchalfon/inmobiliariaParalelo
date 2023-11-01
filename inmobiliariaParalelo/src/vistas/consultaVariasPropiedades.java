
package vistas;

import Entidades.Propiedad;
import accesoADatos.PropiedadData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consultaVariasPropiedades extends javax.swing.JInternalFrame {

     private DefaultTableModel modelo = new DefaultTableModel();
//     private DefaultTableModel modelo1 = new DefaultTableModel();
//     private DefaultTableModel modelo2 = new DefaultTableModel();
//     private DefaultTableModel modelo3 = new DefaultTableModel();
     public consultaVariasPropiedades() {
     initComponents();
     armarCabecera();
        
          // Obtén las dimensiones de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Calcula el centro de la pantalla
    int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
    //int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

    // Establece la ubicación del internal frame en el centro de la pantalla
    setLocation(centerX, getY());
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
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Propiedad"));
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 177));

        comboPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Propiedad", "Zona", "Superficie Minima", "Precio" }));
        comboPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropiedadActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(0, 51, 102));
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/consulta2 - mp.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setMaximumSize(new java.awt.Dimension(165, 50));
        buscar.setMinimumSize(new java.awt.Dimension(165, 50));
        buscar.setPreferredSize(new java.awt.Dimension(165, 50));
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
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        salir.setBackground(new java.awt.Color(0, 51, 102));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/salir1.png"))); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setPreferredSize(new java.awt.Dimension(165, 50));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAS VARIAS - PROPIEDADES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(452, 452, 452))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            tipo= JOptionPane.showInputDialog("Ingrese el Tipo de Propiedad: ");
            llenarTablaTipo();
            
           break;
        case 1:
            
            modelo.setRowCount(0);
            zona=JOptionPane.showInputDialog("Ingrese la Zona de la Propiedad deseada: ");
            llenarTablaZona();
   
            break;
        case 2:
            modelo.setRowCount(0);
            superf=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la superficie minima de la Propiedad deseada: "));
            llenarTablaSuper();
            
            break;
        case 3:
            modelo.setRowCount(0);
            precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de la Propiedad deseada: "));
            llenarTablaPrecio(); 
            break;
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<String> comboPropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaBusqueda;
    // End of variables declaration//GEN-END:variables

private void armarCabecera() {
           
        modelo.addColumn("Legajo Propiedad");
        modelo.addColumn("Tipo de Inmueble");
        modelo.addColumn("Direccion");
        modelo.addColumn("Precio");
        modelo.addColumn("Zona"); 
        modelo.addColumn("Superficie");

        tablaBusqueda.setModel(modelo);
    }

private void llenarTablaTipo() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi : proData.obtenerPropiedadesPorTipo(tipo)) {
            modelo.addRow(new Object[]{propi.getId_propiedad(),propi.getTipoPropiedad(),propi.getDireccion(),propi.getPrecio(),propi.getTipoZona(),propi.getSuperficieMinima()});

        }

    }

private void llenarTablaZona() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi1 : proData.obtenerPropiedadesPorZona(zona)) {
           modelo.addRow(new Object[]{propi1.getId_propiedad(),propi1.getTipoPropiedad(),propi1.getDireccion(),propi1.getPrecio(),propi1.getTipoZona(),propi1.getSuperficieMinima()});

        }

    }

private void llenarTablaSuper() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi1 : proData.obtenerPropiedadesPorSup(superf)) {
            modelo.addRow(new Object[]{propi1.getId_propiedad(),propi1.getTipoPropiedad(),propi1.getDireccion(),propi1.getPrecio(),propi1.getTipoZona(),propi1.getSuperficieMinima()});

        }

    }

private void llenarTablaPrecio() {
        PropiedadData proData = new PropiedadData();
        for (Propiedad propi1 : proData.obtenerPropiedadesPorPrecio(precio)) {
            modelo.addRow(new Object[]{propi1.getId_propiedad(),propi1.getTipoPropiedad(),propi1.getDireccion(),propi1.getPrecio(),propi1.getTipoZona(),propi1.getSuperficieMinima()});

        }

    }

}
