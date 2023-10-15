/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import Entidades.Contrato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ULP
 */
public class ContratoData {

    private Connection con = null;
    private ContratoData cd = new ContratoData();

    public ContratoData() {

        con = miConexion.getConexion();
    }

     public void guardarContrato(Contrato contrato) {

        String sql = "INSERT INTO `contratoalquiler`( `id_Inquilino`, `id_Propiedad`, `fecha_Final`, `fecha_Inicio`, `fechaRealizacion`, `marca`, `vendedor`, `estado`, `vigencia`, `nombre_garante`, `dni_garante`, `tel_garante`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, contrato.getInquilino().getId_Inquilino());
            ps.setInt(2, contrato.getPropiedad().getId_propiedad());  
            ps.setDate(3, contrato.getFecha_Final());
            ps.setDate(4, contrato.getFecha_Inicio());
            ps.setDate(5, contrato.getFecha_Realizacion());
            ps.setString(6, String.valueOf(contrato.getMarca()));
            ps.setString(7, contrato.getVendedor());
            ps.setBoolean(8, contrato.getEstado());
            ps.setString(9, contrato.getVigencia());
            ps.setString(10, contrato.getNombreGarante());
            ps.setString(11, contrato.getDniGarante());
            ps.setString(12, contrato.getTelGarante());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               contrato.setId_contrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato Firmado");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla contrato");
        }

    }
}
