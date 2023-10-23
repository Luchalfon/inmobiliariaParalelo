package vistas;

import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
import accesoADatos.ContratoData;
import accesoADatos.InquilinoData;
import accesoADatos.PropiedadData;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;

import java.util.List;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ULP
 */
public class contratoVista extends javax.swing.JInternalFrame {

    public contratoVista() {
        initComponents();
        modificar.setEnabled(false);
        firmar.setEnabled(false);
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
    private Inquilino inquilinoSelec;
    private int idInquilinoSelec;
    private Propiedad propiedadSelec;
    private int idPropiedSelec;
    private Date fechaHoy;
    private String fechaFormateadaInicio;
    private String fechaFormateadaFinal;
    private Contrato contrato1;
    private Date fechainicial;
    private Date fechafinal;
    private String fechahoy, fechaIni, fechaFin;
    private String fInicial, fFinal;
    java.sql.Date date1, date2, dateHoy,fechaChooser;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        textVendedor = new javax.swing.JTextField();
        textVigencia = new javax.swing.JTextField();
        textGarante = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        comboInquilino = new javax.swing.JComboBox<>();
        comboPropiedad = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        firmar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jdFecha1 = new com.toedter.calendar.JDateChooser();
        jdFecha2 = new com.toedter.calendar.JDateChooser();
        textFecha_Realizacion = new javax.swing.JTextField();
        vigenciaSi = new javax.swing.JRadioButton();
        vigenciaNo = new javax.swing.JRadioButton();
        textDias = new javax.swing.JTextField();
        calculoFecha = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1080, 630));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de contrato");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Inquilino");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Propiedad");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Inicio");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Final");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Realizacion");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Vendedor");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Vigencia");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Garante");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("DNI Garante");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Tel. Garante");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("CONTRATO");

        textId.setEditable(false);

        comboInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInquilinoActionPerformed(evt);
            }
        });

        comboPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropiedadActionPerformed(evt);
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

        nuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/nuevo1.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        firmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/firmar.png"))); // NOI18N
        firmar.setText("Firmar");
        firmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        firmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmarActionPerformed(evt);
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

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diseño/salir2.png"))); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jdFecha1.setDateFormatString("yyyy-MM-dd");

        jdFecha2.setDateFormatString("yyyy-MM-dd");

        textFecha_Realizacion.setEditable(false);
        textFecha_Realizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFecha_RealizacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(vigenciaSi);
        vigenciaSi.setText("Vigente");

        buttonGroup1.add(vigenciaNo);
        vigenciaNo.setText("No Vigente");

        calculoFecha.setText("Calcular vigencia");
        calculoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                            .addComponent(jdFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textTel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textGarante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textVigencia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboPropiedad, javax.swing.GroupLayout.Alignment.LEADING, 0, 615, Short.MAX_VALUE)
                                .addComponent(comboInquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textMarca))
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFecha_Realizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDias, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(calculoFecha)
                                .addContainerGap(42, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(firmar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(838, 838, 838)
                        .addComponent(vigenciaSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vigenciaNo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jdFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textFecha_Realizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(vigenciaSi)
                            .addComponent(vigenciaNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(calculoFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firmar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(textDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // FECHA INICIO
    private void jdFecha1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFecha1PropertyChange
        // TODO add your handling code here:


    }//GEN-LAST:event_jdFecha1PropertyChange

    // FECHA FINAL
    private void jdFecha2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFecha2PropertyChange


    }//GEN-LAST:event_jdFecha2PropertyChange

    private void firmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmarActionPerformed
        //aca guardamos firmar contrato
        dateHoy = Date.valueOf(LocalDate.now());
        fechaIni = ((JTextField) jdFecha1.getDateEditor().getUiComponent()).getText();
        fechaFin = ((JTextField) jdFecha2.getDateEditor().getUiComponent()).getText();
        crearContrato();
        ContratoData conData = new ContratoData();
        conData.guardarContrato(contrato1);

        textMarca.setText("");
        textDni.setText("");
        textId.setText("");
        textVendedor.setText("");
        textTel.setText("");
        textVigencia.setText("");
        textGarante.setText("");

        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        firmar.setEnabled(false);
        eliminar.setEnabled(false);
        buscar.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_firmarActionPerformed

    private void comboInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInquilinoActionPerformed
        inquilinoSelec = (Inquilino) comboInquilino.getSelectedItem();
        idInquilinoSelec = inquilinoSelec.getId_Inquilino();

        // TODO add your handling code here:
    }//GEN-LAST:event_comboInquilinoActionPerformed

    private void comboPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropiedadActionPerformed
        propiedadSelec = (Propiedad) comboPropiedad.getSelectedItem();
        idPropiedSelec = propiedadSelec.getId_propiedad();
// TODO add your handling code here:
    }//GEN-LAST:event_comboPropiedadActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        llenarComboPropiedad();
        llenarComboInquilino();
        nuevo.setEnabled(false);
        buscar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        firmar.setEnabled(true);
        textMarca.setText("");
        textDni.setText("");
        textId.setText("");
        textVendedor.setText("");
        textTel.setText("");
        textVigencia.setText("");
        textGarante.setText("");


    }//GEN-LAST:event_nuevoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:

        Contrato cont = new Contrato();
        ContratoData contdata = new ContratoData();
        cont.setId_contrato(Integer.parseInt(textId.getText()));
        cont.setInquilino(inquilinoSelec);
        cont.setPropiedad(propiedadSelec);

        //dateHoy = Date.valueOf(LocalDate.now());
        fInicial = ((JTextField) jdFecha1.getDateEditor().getUiComponent()).getText();
        fFinal = ((JTextField) jdFecha2.getDateEditor().getUiComponent()).getText();
        //cont.setFecha_Realizacion(dateHoy);
        cont.setFecha_Inicio(Date.valueOf(fInicial));
        cont.setFecha_Final(Date.valueOf(fFinal));

        cont.setVendedor(textVendedor.getText());
        cont.setVigencia(Boolean.parseBoolean(textVigencia.getText()));
        cont.setNombreGarante(textGarante.getText());
        cont.setDniGarante(textDni.getText());
        cont.setTelGarante(textTel.getText());
        String mar = textMarca.getText();
        char mark = mar.charAt(0);
        cont.setMarca(mark);

        contdata.modificarContrato(cont);

//        textMarca.setText("");
//        textDni.setText("");
//        textId.setText("");
//        textVendedor.setText("");
//        textTel.setText("");
//        textVigencia.setText("");
//        textGarante.setText("");
//    
//        nuevo.setEnabled(true);
//        modificar.setEnabled(false);
//        firmar.setEnabled(false);
//        eliminar.setEnabled(false);
//        buscar.setEnabled(true);

    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:

//       guardar.setEnabled(false);
        String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Buscar por N° de contrato"}, "seleccion")).toString();

        switch (opciones) {

            case "Buscar por N° de contrato":
                String id = JOptionPane.showInputDialog("Ingrese el Codigo");

                int miId = Integer.parseInt(id);

                ContratoData contData = new ContratoData();
                Contrato cont = contData.buscarContratoPorID(miId);
                llenarComboPropiedad();
                llenarComboInquilino();
                //comparamos el inquilino de la base y lo seteamos en el comboBox
                DefaultComboBoxModel<Inquilino> model = (DefaultComboBoxModel<Inquilino>) comboInquilino.getModel();
                int contador = model.getSize();
                for (int i = 0; i < contador; i++) {
                    Inquilino inqui = model.getElementAt(i);
                    if (cont.getInquilino().getId_Inquilino() == inqui.getId_Inquilino()) {
                        comboInquilino.setSelectedIndex(i);
                    }
                }

                DefaultComboBoxModel<Propiedad> modelo = (DefaultComboBoxModel<Propiedad>) comboPropiedad.getModel();
                int contador1 = modelo.getSize();
                for (int i = 0; i < contador1; i++) {
                    Propiedad propie = modelo.getElementAt(i);
                    if (cont.getPropiedad().getId_propiedad() == propie.getId_propiedad()) {
                        comboPropiedad.setSelectedIndex(i);
                    }
                }

                
                
                jdFecha1.setDate(cont.getFecha_Inicio());
               jdFecha2.setDate(cont.getFecha_Final());
             //   Date fechaactual = new Date(System.currentTimeMillis());
                
                //aca escribir calculo
               
                
                textId.setText(id);
                textVendedor.setText(cont.getVendedor());
                
                textVigencia.setText(String.valueOf(cont.getVigencia()));
                textGarante.setText(cont.getNombreGarante());
                textDni.setText(cont.getDniGarante());
                textTel.setText(cont.getTelGarante());
                textMarca.setText(String.valueOf(cont.getMarca()));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String fechaComoCadena = sdf.format(cont.getFecha_Realizacion());
                textFecha_Realizacion.setText(fechaComoCadena);

                break;
        }

        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        nuevo.setEnabled(true);
        firmar.setEnabled(false);
//        
//        
//        
    }//GEN-LAST:event_buscarActionPerformed

    private void textFecha_RealizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFecha_RealizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFecha_RealizacionActionPerformed

    private void calculoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoFechaActionPerformed
                // String fechaIni=((JTextField)jdFecha1.getDateEditor().getUiComponent()).getText();
     // String fechaFin=((JTextField)jdFecha2.getDateEditor().getUiComponent()).getText();

      java.util.Date fechaactual = new java.util.Date(System.currentTimeMillis());
      jdFecha1.setDate(fechaactual); //poner fecha en el chooser
      
      java.util.Date fechaFinal=jdFecha2.getDate();
      
      int milisecondsByDay = 86400000;
      int dias = (int) ((fechaFinal.getTime()-fechaactual.getTime()) / milisecondsByDay);
      String diasS=String.valueOf(dias+" Dias");
      textDias.setText(diasS);

        if(dias<=0){
           vigenciaNo.setSelected(true);
           textVigencia.setText("False");
           
        }else{
            vigenciaSi.setSelected(true);
            textVigencia.setText("True");
            
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_calculoFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculoFecha;
    private javax.swing.JComboBox<Inquilino> comboInquilino;
    private javax.swing.JComboBox<Propiedad> comboPropiedad;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton firmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdFecha1;
    private com.toedter.calendar.JDateChooser jdFecha2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textDias;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textFecha_Realizacion;
    private javax.swing.JTextField textGarante;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textTel;
    private javax.swing.JTextField textVendedor;
    private javax.swing.JTextField textVigencia;
    private javax.swing.JRadioButton vigenciaNo;
    private javax.swing.JRadioButton vigenciaSi;
    // End of variables declaration//GEN-END:variables

    public void llenarComboPropiedad() {
        List<Propiedad> propiedades = new ArrayList<>();

        PropiedadData pd = new PropiedadData();
        propiedades = pd.listarPropiedad();

        for (Propiedad p1 : propiedades) {
            comboPropiedad.addItem(p1);

        }
    }

    public void llenarComboInquilino() {
        List<Inquilino> inquilinos = new ArrayList<>();

        InquilinoData ind = new InquilinoData();
        inquilinos = ind.listarinquilino();

        for (Inquilino in1 : inquilinos) {
            comboInquilino.addItem(in1);

        }
    }

    public Contrato crearContrato() {

        char marca = textMarca.getText().charAt(0);
        String vendendor = textVendedor.getText();
        boolean vigencia = Boolean.parseBoolean(textVigencia.getText());
        String garante = textGarante.getText();
        String dniGarante = textDni.getText();
        String telGarante = textTel.getText();
        boolean estado1 = true;
        contrato1 = new Contrato(inquilinoSelec, Date.valueOf(fechaFin), Date.valueOf(fechaIni), dateHoy, marca, propiedadSelec, vendendor, estado1, vigencia, garante, dniGarante, telGarante);
        System.out.println(fechaFin);
        System.out.println(fechaIni);
        System.out.println(contrato1);
        return contrato1;
    }

}
