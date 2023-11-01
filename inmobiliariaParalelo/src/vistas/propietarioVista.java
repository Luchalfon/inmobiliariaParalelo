
package vistas;

import Entidades.Propietario;
import Validaciones.Validaciones;
import accesoADatos.PropietarioData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;



public class propietarioVista extends javax.swing.JInternalFrame {

  
    public propietarioVista() {
        initComponents();
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        bloquearCampos();
                
    // Obtén las dimensiones de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Calcula el centro de la pantalla
    int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
   // int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

    // Establece la ubicación del internal frame en el centro de la pantalla
    setLocation(centerX, getY());
      
    }
        private Connection con;
        Propietario propietario1;
    
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
        textId = new javax.swing.JTextField();
        textDNI = new javax.swing.JTextField();
        textApe = new javax.swing.JTextField();
        textNom = new javax.swing.JTextField();
        textDomi = new javax.swing.JTextField();
        textTele = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1080, 625));
        setPreferredSize(new java.awt.Dimension(1080, 625));
        setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROPIETARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id propietario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Domicilio");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        textId.setEditable(false);
        textId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });

        textDNI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDNI.setForeground(new java.awt.Color(0, 51, 51));

        textApe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textApe.setForeground(new java.awt.Color(0, 51, 51));

        textNom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNom.setForeground(new java.awt.Color(0, 51, 51));

        textDomi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDomi.setForeground(new java.awt.Color(0, 51, 51));

        textTele.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textTele.setForeground(new java.awt.Color(0, 51, 51));
        textTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTeleActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 51, 102));
        nuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/nuevo1.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.setMaximumSize(new java.awt.Dimension(145, 64));
        nuevo.setMinimumSize(new java.awt.Dimension(145, 64));
        nuevo.setPreferredSize(new java.awt.Dimension(145, 64));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 51, 102));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setMaximumSize(new java.awt.Dimension(145, 64));
        guardar.setMinimumSize(new java.awt.Dimension(145, 64));
        guardar.setPreferredSize(new java.awt.Dimension(145, 64));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(0, 51, 102));
        modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/modificar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setMaximumSize(new java.awt.Dimension(145, 64));
        modificar.setMinimumSize(new java.awt.Dimension(145, 64));
        modificar.setPreferredSize(new java.awt.Dimension(145, 64));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(0, 51, 102));
        eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/eliminar1.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setMaximumSize(new java.awt.Dimension(145, 64));
        eliminar.setMinimumSize(new java.awt.Dimension(145, 64));
        eliminar.setPreferredSize(new java.awt.Dimension(145, 64));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 51, 102));
        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/salir2.png"))); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setMaximumSize(new java.awt.Dimension(145, 64));
        salir.setMinimumSize(new java.awt.Dimension(145, 64));
        salir.setPreferredSize(new java.awt.Dimension(145, 64));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(0, 51, 102));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setMaximumSize(new java.awt.Dimension(145, 64));
        buscar.setMinimumSize(new java.awt.Dimension(145, 64));
        buscar.setPreferredSize(new java.awt.Dimension(145, 64));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textDomi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                            .addComponent(textNom, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDNI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTele))
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        buscar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(true);
        nuevo.setEnabled(false);
        limpiarTextos();
        habilitarCampos();
        textDNI.requestFocus();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
              // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        if (!Validaciones.validarSoloNumeros(textDNI.getText()) || textDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingreso invalido , el DNI debe ser un numero");
        } else if (textApe.getText().isEmpty() || !Validaciones.validarNombre(textApe.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no puede estar vacio y debe ser un nombre");
        } else if (textNom.getText().isEmpty() || !Validaciones.validarNombre(textNom.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio y debe contener solo letras");
        } else if (textDomi.getText().isEmpty() || !Validaciones.validarDireccion(textDomi.getText())) {
            JOptionPane.showMessageDialog(this, "El campo direccion no puede estar vacio y debe contener letras y numeros solamente");
        } else if (textTele.getText().isEmpty() || !Validaciones.validarSoloNumeros(textTele.getText())) {
            JOptionPane.showMessageDialog(this, "El campo telefono no puede estar vacio y debe contener solo numeros");
        } else {
            crearPropietario();
            System.out.println(propietario1);
            PropietarioData propieData = new PropietarioData();
            propieData.guardarPropietario(propietario1);

            limpiarTextos();
            bloquearCampos();

            buscar.setEnabled(true);
            nuevo.setEnabled(true);
            modificar.setEnabled(false);
            guardar.setEnabled(false);
            eliminar.setEnabled(false);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        guardar.setEnabled(false);
        try {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Buscar por Id", "Buscar por DNI"}, "seleccion")).toString();

            switch (opciones) {

                case "Buscar por Id":
                    String id = JOptionPane.showInputDialog("Ingrese el Id");

                    int miId = Integer.parseInt(id);
                    PropietarioData pd = new PropietarioData();

                    propietario1 = pd.buscarPropietarioPorID(miId);
                    if (propietario1 != null) {
                        textId.setText(id);
                        textApe.setText(propietario1.getApellido());
                        textDNI.setText(String.valueOf(propietario1.getDni()));
                        textNom.setText(propietario1.getNombre());
                        textDomi.setText(propietario1.getDomicilio());
                        textTele.setText(propietario1.getTelefono());
                        habilitarCampos();
                        modificar.setEnabled(true);
                        eliminar.setEnabled(true);
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                    }
                    break;
                case "Buscar por DNI":
                    String dni = JOptionPane.showInputDialog("Ingrese el dni");

                    int miDni = Integer.parseInt(dni);
                    PropietarioData pd2 = new PropietarioData();
                     propietario1 = pd2.buscarPropietarioPorDNI(miDni);
                    if (propietario1 != null) {
                        textId.setText(String.valueOf(propietario1.getId_propietario()));
                        textApe.setText(propietario1.getApellido());
                        textDNI.setText(String.valueOf(propietario1.getDni()));
                        textNom.setText(propietario1.getNombre());
                        textDomi.setText(propietario1.getDomicilio());
                        textTele.setText(propietario1.getTelefono());
                        habilitarCampos();
                        modificar.setEnabled(true);
                        eliminar.setEnabled(true);
                        nuevo.setEnabled(true);
                        guardar.setEnabled(false);
                    }
                    break;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se selecciono ");
        } catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(this, "No se ingreso datos");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (!Validaciones.validarSoloNumeros(textDNI.getText()) || textDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingreso invalido , el DNI debe ser un numero");
        } else if (textApe.getText().isEmpty() || !Validaciones.validarNombre(textApe.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Apellido no puede estar vacio y debe ser un nombre");
        } else if (textNom.getText().isEmpty() || !Validaciones.validarNombre(textNom.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacio y debe contener solo letras");
        } else if (textDomi.getText().isEmpty() || !Validaciones.validarDireccion(textDomi.getText())) {
            JOptionPane.showMessageDialog(this, "El campo direccion no puede estar vacio y debe contener letras y numeros solamente");
        } else if (textTele.getText().isEmpty() || !Validaciones.validarSoloNumeros(textTele.getText())) {
            JOptionPane.showMessageDialog(this, "El campo telefono no puede estar vacio y debe contener solo numeros");
        } else {
            Propietario p1 = new Propietario();
            PropietarioData pd = new PropietarioData();
            p1.setId_propietario(Integer.parseInt(textId.getText()));
            p1.setDni(Integer.parseInt(textDNI.getText()));
            p1.setApellido(textApe.getText());
            p1.setNombre(textNom.getText());
            p1.setDomicilio(textDomi.getText());
            p1.setTelefono(textTele.getText());
            p1.setEstado(true);

            pd.modificarPropietario(p1);

            limpiarTextos();
            bloquearCampos();
            nuevo.setEnabled(true);
            modificar.setEnabled(false);
            guardar.setEnabled(false);
            eliminar.setEnabled(false);
            buscar.setEnabled(true);
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        int idBorrar=Integer.parseInt(textId.getText());
        PropietarioData pd=new PropietarioData();
        pd.eliminarPropietario(idBorrar);
        
        limpiarTextos();
        bloquearCampos();
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        buscar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void textTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTeleActionPerformed


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
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textApe;
    private javax.swing.JTextField textDNI;
    private javax.swing.JTextField textDomi;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textTele;
    // End of variables declaration//GEN-END:variables
    
    
    public Propietario crearPropietario() {
         
        String apellido=textApe.getText();
        int dni=Integer.parseInt(textDNI.getText());
        String nombre=textNom.getText();
        String domicilio=textDomi.getText();
        String telefono=textTele.getText();
        
        propietario1= new Propietario(apellido,dni,domicilio,nombre,telefono,true);
    
        return propietario1;
    }

    private void limpiarTextos(){
        textId.setText("");
        textApe.setText("");
        textDomi.setText("");
        textDNI.setText("");
        textNom.setText("");
        textTele.setText("");   
    }
    private void bloquearCampos(){
        textId.setEnabled(false);
        textApe.setEnabled(false);
        textDomi.setEnabled(false);
        textDNI.setEnabled(false);
        textNom.setEnabled(false);
        textTele.setEnabled(false);
    }

    private void habilitarCampos(){
        textApe.setEnabled(true);
        textDomi.setEnabled(true);
        textDNI.setEnabled(true);
        textNom.setEnabled(true);
        textTele.setEnabled(true);
    }

}
