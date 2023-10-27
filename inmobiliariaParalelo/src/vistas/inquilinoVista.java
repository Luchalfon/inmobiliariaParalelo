
package vistas;

import Entidades.Inquilino;
import Validaciones.Validaciones;
import accesoADatos.InquilinoData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class inquilinoVista extends javax.swing.JInternalFrame {

   
    public inquilinoVista() {
        initComponents();
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        nuevo.setEnabled(true);
        buscar.setEnabled(true);
        limpiarTextos();
        bloquearCampos();
    // Obtén las dimensiones de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Calcula el centro de la pantalla
    int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
    //int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

    // Establece la ubicación del internal frame en el centro de la pantalla
    setLocation(centerX, getY());
    
    
    }

    private Connection con;
    Inquilino inquilino1;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textApe = new javax.swing.JTextField();
        textNom = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        textDetalle = new javax.swing.JTextField();
        textTipo = new javax.swing.JTextField();
        textCuit = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 630));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("INQUILINO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Id_inquilino");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Detalle");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Tipo");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("CUIT");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Telefono");

        textId.setEditable(false);
        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/nuevo1.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/modificar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/eliminar1.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/salir2.png"))); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                        .addContainerGap()
                        .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(59, 59, 59))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(56, 56, 56)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textCuit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                            .addComponent(textTipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDetalle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTel)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(textId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
        limpiarTextos();
        buscar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(true);
        textApe.requestFocus();
    }//GEN-LAST:event_nuevoActionPerformed

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (textApe.getText().isEmpty() || !Validaciones.validarNombre(textApe.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no puede estar vacio y debe contener un Apellido");
        } else if (textNom.getText().isEmpty() || !Validaciones.validarNombre(textNom.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio y debe tener un nombre");
        } else if (textDni.getText().isEmpty() || !Validaciones.validarEntero(textDni.getText())) {
            JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacio y debe contener numeros");
        } else if (textDetalle.getText().isEmpty() || !Validaciones.validarChar(textDetalle.getText())) {
            JOptionPane.showMessageDialog(this, "El campo detalle no puede estar vacio y debe ser un caracter");
        } else if (textTipo.getText().isEmpty() || !Validaciones.validarChar(textTipo.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Tipo no puede estar vacio y debe ser un caracter");
        } else if (textCuit.getText().isEmpty() || !Validaciones.validarSoloNumeros(textCuit.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Cuit no puede estar vacio y debe ser solo numeros");
        } else if (textTel.getText().isEmpty() || !Validaciones.validarSoloNumeros(textTel.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Tlefono no puede estar vacio y debe ser solo numeros");
        } else {
            crearInquilino();
            System.out.println("Inquilino creado");
            InquilinoData idata = new InquilinoData();
            idata.guardarInquilino(inquilino1);

            limpiarTextos();
            bloquearCampos();
            modificar.setEnabled(false);
            eliminar.setEnabled(false);
            guardar.setEnabled(false);
            buscar.setEnabled(true);
            nuevo.setEnabled(true);
            
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        int idBorrar = Integer.parseInt(textId.getText());
        InquilinoData pd = new InquilinoData();
        pd.eliminarInquilino(idBorrar);
        limpiarTextos();
        bloquearCampos();
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        buscar.setEnabled(true);
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        try {
            String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Buscar por id"}, "seleccion")).toString();

            switch (opciones) {

                case "Buscar por id":
                    String id = JOptionPane.showInputDialog("Ingrese el id");

                    int miId = Integer.parseInt(id);
                    InquilinoData pd = new InquilinoData();
                    inquilino1 = pd.buscarInquilinoPorID(miId);
                    textId.setText(id);
                    textApe.setText(inquilino1.getApellido());
                    textNom.setText(inquilino1.getNombre()); //alumno1.getApellido());
                    textDni.setText(String.valueOf(inquilino1.getDni()));
                    textDetalle.setText(String.valueOf(inquilino1.getDetalle()));
                    textTipo.setText(String.valueOf(inquilino1.getTipo()));
                    textCuit.setText(inquilino1.getCuit());
                    textTel.setText(inquilino1.getTelefono());
                    break;
            }
            
            habilitarCampos();
            buscar.setEnabled(true);
            modificar.setEnabled(true);
            eliminar.setEnabled(true);
            nuevo.setEnabled(true);
            guardar.setEnabled(false);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se selecciono");
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "No ingreso un ID");
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (textApe.getText().isEmpty() || !Validaciones.validarNombre(textApe.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no puede estar vacio y debe contener un Apellido");
        } else if (textNom.getText().isEmpty() || !Validaciones.validarNombre(textNom.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio y debe tener un nombre");
        } else if (textDni.getText().isEmpty() || !Validaciones.validarEntero(textDni.getText())) {
            JOptionPane.showMessageDialog(this, "El campo DNI no puede estar vacio y debe contener numeros");
        } else if (textDetalle.getText().isEmpty() || !Validaciones.validarChar(textDetalle.getText())) {
            JOptionPane.showMessageDialog(this, "El campo detalle no puede estar vacio y debe ser un caracter");
        } else if (textTipo.getText().isEmpty() || !Validaciones.validarChar(textTipo.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Tipo no puede estar vacio y debe ser un caracter");
        } else if (textCuit.getText().isEmpty() || !Validaciones.validarSoloNumeros(textCuit.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Cuit no puede estar vacio y debe ser solo numeros");
        } else if (textTel.getText().isEmpty() || !Validaciones.validarSoloNumeros(textTel.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Tlefono no puede estar vacio y debe ser solo numeros");
        } else {
            Inquilino inq = new Inquilino();
            InquilinoData id = new InquilinoData();
            inq.setId_Inquilino(Integer.parseInt(textId.getText()));
            inq.setApellido(textApe.getText());
            inq.setNombre(textNom.getText());
            inq.setDni(Integer.parseInt(textDni.getText()));
            String deta = textDetalle.getText();
            char deta1 = deta.charAt(0);
            String ti = textTipo.getText();
            char tipo1 = ti.charAt(0);
            inq.setDetalle(deta1);
            inq.setTipo(tipo1);
            inq.setCuit(textCuit.getText());
            inq.setTelefono(textTel.getText());
            inq.setEstado(true);

            id.modificarInquilino(inq);

            limpiarTextos();
            bloquearCampos();
            nuevo.setEnabled(true);
            buscar.setEnabled(true);
            modificar.setEnabled(false);
            guardar.setEnabled(false);
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textApe;
    private javax.swing.JTextField textCuit;
    private javax.swing.JTextField textDetalle;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textTel;
    private javax.swing.JTextField textTipo;
    // End of variables declaration//GEN-END:variables

    public Inquilino crearInquilino() {

        
        String apellido = textApe.getText();
        String nombre = textNom.getText();
        int dni = Integer.parseInt(textDni.getText());
        String detalle = textDetalle.getText();
        char deta = detalle.charAt(0);
        String tipo = textTipo.getText();
        char tipo1 = tipo.charAt(0);
        String cuit = textCuit.getText();
        String telefono = textTel.getText();
        boolean estado = true;

        inquilino1 = new Inquilino(apellido, nombre, dni, deta, tipo1, cuit, telefono, estado);
        System.out.println(inquilino1);
        return inquilino1;
    }
    
    private void limpiarTextos(){
        textId.setText("");
        textApe.setText("");
        textNom.setText("");
        textDni.setText("");
        textDetalle.setText("");
        textTipo.setText("");
        textCuit.setText("");
        textTel.setText("");
    }
    private void bloquearCampos(){
        textId.setEnabled(false);
        textApe.setEnabled(false);
        textNom.setEnabled(false);
        textDni.setEnabled(false);
        textDetalle.setEnabled(false);
        textTipo.setEnabled(false);
        textCuit.setEnabled(false);
        textTel.setEnabled(false);
    }
    private void habilitarCampos(){
        textApe.setEnabled(true);
        textNom.setEnabled(true);
        textDni.setEnabled(true);
        textDetalle.setEnabled(true);
        textTipo.setEnabled(true);
        textCuit.setEnabled(true);
        textTel.setEnabled(true);
    }
       
}
