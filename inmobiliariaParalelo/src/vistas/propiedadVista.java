package vistas;

import Entidades.Propiedad;
import Entidades.Propietario;
import Validaciones.Validaciones;
import accesoADatos.PropiedadData;
import accesoADatos.PropietarioData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class propiedadVista extends javax.swing.JInternalFrame {

    public propiedadVista() {
        initComponents();
        bloquearCampos();
        guardar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        
             // Obtén las dimensiones de la pantalla
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    // Calcula el centro de la pantalla
    int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
    //int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

    // Establece la ubicación del internal frame en el centro de la pantalla
    setLocation(centerX, getY());

    }
    private Connection con;
    Propietario propietarioSelect;
    Propiedad propiedad1;
    int idProSelect;
    private boolean si;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textAcce = new javax.swing.JTextField();
        textDire = new javax.swing.JTextField();
        comboPropietario = new javax.swing.JComboBox<>();
        textForma = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textRevisor = new javax.swing.JTextField();
        textSuper = new javax.swing.JTextField();
        textTipo = new javax.swing.JTextField();
        textZona = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1080, 625));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1080, 625));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("PROPIEDAD");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Legajo Propiedad");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Accesibilidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Propietario");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Forma");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Precio");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Revisor");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Superficie Minima");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Tipo de propiedad");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Zona");

        textId.setEditable(false);

        comboPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropietarioActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/buscar.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/nuevo1.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/modificar.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/eliminar1.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

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
                .addGap(407, 407, 407)
                .addComponent(jLabel1)
                .addContainerGap(437, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textZona)
                            .addComponent(textId)
                            .addComponent(textDire)
                            .addComponent(comboPropietario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textForma)
                            .addComponent(textPrecio)
                            .addComponent(textRevisor)
                            .addComponent(textSuper)
                            .addComponent(textTipo)
                            .addComponent(textAcce))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textAcce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textRevisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();

    }//GEN-LAST:event_salirActionPerformed

    private void comboPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropietarioActionPerformed
        propietarioSelect = (Propietario) comboPropietario.getSelectedItem();
        idProSelect = propietarioSelect.getId_propietario();
        System.out.println(idProSelect);

      
    }//GEN-LAST:event_comboPropietarioActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(textAcce.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo acceso no puede estar vacio");
        }else if(textDire.getText().isEmpty() || !Validaciones.validarDireccion(textDire.getText())){
            JOptionPane.showMessageDialog(this, "El campo Direccion no puede estar vacio y debe contener letras y numeros");
        }else if(textForma.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "El campo Forma no puede estar vacio");
        }else if(textPrecio.getText().isEmpty() || !Validaciones.validarFloat(textPrecio.getText())){
            JOptionPane.showMessageDialog(this, "El campo precio no puede estar vacio y debe ser un numero");
        }else if(textRevisor.getText().isEmpty() || !Validaciones.validarNombre(textRevisor.getText())){
            JOptionPane.showMessageDialog(this, "El campo revisor no puede estar vacio y debe ser un nombre");
        }else if(textSuper.getText().isEmpty() || !Validaciones.validarEntero(textSuper.getText())){
            JOptionPane.showMessageDialog(this, "El campo superficie no puede estar vacio y debe contener un entero");
        }else if(textTipo.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "El campo tipo de propiedad no puede estar vacio");
        }else if(textZona.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo Zona no puede estar vacio");
        }else{
        crearPropiedad();
        PropiedadData pd = new PropiedadData();
        pd.guardarPropiedad(propiedad1);
        limpiarTextos();
        bloquearCampos();
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(false);
        buscar.setEnabled(true);
        nuevo.setEnabled(true);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed

        habilitarCampos();
        limpiarTextos();
        llenarCombo();
        textAcce.requestFocus();
        buscar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(true);
        nuevo.setEnabled(false);
    }//GEN-LAST:event_nuevoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        
        try {
            String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Buscar por Legajo"}, "seleccion")).toString();

            switch (opciones) {

                case "Buscar por Legajo":
                    String id = JOptionPane.showInputDialog("Ingrese el id");

                    int miId = Integer.parseInt(id);
                    PropiedadData pd = new PropiedadData();
                    Propiedad propie1 = pd.buscarPropiedadPorID(miId);

                    DefaultComboBoxModel<Propietario> model = (DefaultComboBoxModel<Propietario>) comboPropietario.getModel();
                    int contador = model.getSize();
                    //arreglar si no encuentra propietario
                    for (int i = 0; i < contador; i++) {
                        Propietario p = model.getElementAt(i);
                        if (propie1.getPropietario().getId_propietario() == p.getId_propietario()) {
                            comboPropietario.setSelectedIndex(i);
                            
                        }
                    }
                    llenarCombo();
                    textId.setText(id);
                    textAcce.setText(propie1.getAccesibilidad());
                    textDire.setText(propie1.getDireccion());
                    textForma.setText(propie1.getForma());
                    textPrecio.setText(String.valueOf(propie1.getPrecio()));
                    textRevisor.setText(propie1.getRevisor());
                    textSuper.setText(String.valueOf(propie1.getSuperficieMinima()));
                    textTipo.setText(propie1.getTipoPropiedad());
                    textZona.setText(propie1.getZona());

                    break;
            }

            habilitarCampos();
            modificar.setEnabled(true);
            eliminar.setEnabled(true);
            nuevo.setEnabled(true);
            guardar.setEnabled(false);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se selecciono");
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "No se selecciono ID");
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (textAcce.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo acceso no puede estar vacio");
        } else if (textDire.getText().isEmpty() || !Validaciones.validarDireccion(textDire.getText())) {
            JOptionPane.showMessageDialog(this, "El campo Direccion no puede estar vacio y debe contener letras y numeros");
        } else if (textForma.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Forma no puede estar vacio");
        } else if (textPrecio.getText().isEmpty() || !Validaciones.validarFloat(textPrecio.getText())) {
            JOptionPane.showMessageDialog(this, "El campo precio no puede estar vacio y debe ser un numero");
        } else if (textRevisor.getText().isEmpty() || !Validaciones.validarNombre(textRevisor.getText())) {
            JOptionPane.showMessageDialog(this, "El campo revisor no puede estar vacio y debe ser un nombre");
        } else if (textSuper.getText().isEmpty() || !Validaciones.validarEntero(textSuper.getText())) {
            JOptionPane.showMessageDialog(this, "El campo superficie no puede estar vacio y debe contener un entero");
        } else if (textTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo tipo de propiedad no puede estar vacio");
        } else if (textZona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Zona no puede estar vacio");
        } else {
            Propiedad propie1 = new Propiedad();
            PropiedadData pd = new PropiedadData();
            propie1.setId_propiedad(Integer.parseInt(textId.getText()));
            propie1.setPropietario(propietarioSelect);
            propie1.setAccesibilidad(textAcce.getText());
            propie1.setDireccion(textDire.getText());
            propie1.setForma(textForma.getText());
            propie1.setPrecio(Float.parseFloat(textPrecio.getText()));
            propie1.setRevisor(textRevisor.getText());
            propie1.setSuperficieMinima(Integer.parseInt(textSuper.getText()));
            propie1.setTipoPropiedad(textTipo.getText());
            propie1.setZona(textZona.getText());

            pd.modificarPropiedad(propie1);

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

        int idBorrar = Integer.parseInt(textId.getText());
        PropiedadData pd = new PropiedadData();
        pd.eliminarPropiedad(idBorrar);
        limpiarTextos();
        bloquearCampos();
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
        buscar.setEnabled(true);
    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<Propietario> comboPropietario;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textAcce;
    private javax.swing.JTextField textDire;
    private javax.swing.JTextField textForma;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textRevisor;
    private javax.swing.JTextField textSuper;
    private javax.swing.JTextField textTipo;
    private javax.swing.JTextField textZona;
    // End of variables declaration//GEN-END:variables

    public void llenarCombo() {
        List<Propietario> propietarios = new ArrayList<>();

        PropietarioData pd = new PropietarioData();
        propietarios = pd.listarPropietarios();

        for (Propietario p1 : propietarios) {
            comboPropietario.addItem(p1);

        }
    }

    public Propiedad crearPropiedad() {

        String acceso = textAcce.getText();
        String direcion = textDire.getText();
        String forma = textForma.getText();
        float precio = Float.parseFloat(textPrecio.getText());
        String revisor = textRevisor.getText();
        int superficieMinima = Integer.parseInt(textSuper.getText());
        String tipoPropiedad = textTipo.getText();
        String zona = textZona.getText();
        boolean disponible =false;
        boolean estado = true;

        propiedad1 = new Propiedad(acceso, direcion, propietarioSelect, forma, precio, revisor, superficieMinima, tipoPropiedad, zona, disponible, estado);
        System.out.println(propiedad1);
        return propiedad1;
    }
    private void limpiarTextos() {
        textId.setText("");
        textAcce.setText("");
        textDire.setText("");
        textForma.setText("");
        textPrecio.setText("");
        textRevisor.setText("");
        textSuper.setText("");
        textTipo.setText("");
        textZona.setText("");
        //comboPropietario.removeAllItems();
    }
    private void bloquearCampos(){
        textId.setEnabled(false);
        textAcce.setEnabled(false);
        textDire.setEnabled(false);
        comboPropietario.setEnabled(false);
        textForma.setEnabled(false);
        textPrecio.setEnabled(false);
        textRevisor.setEnabled(false);
        textSuper.setEnabled(false);
        textTipo.setEnabled(false);
        textZona.setEnabled(false);
    }
      private void habilitarCampos(){
       
        textAcce.setEnabled(true);
        textDire.setEnabled(true);
        comboPropietario.setEnabled(true);
        textForma.setEnabled(true);
        textPrecio.setEnabled(true);
        textRevisor.setEnabled(true);
        textSuper.setEnabled(true);
        textTipo.setEnabled(true);
        textZona.setEnabled(true);
    }
}
