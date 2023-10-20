/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoADatos;

import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
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
    private InquilinoData idata=new InquilinoData(); 
    private PropiedadData propiedata=new PropiedadData();

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
            ps.setBoolean(9, contrato.getVigencia());
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
     
      public void modificarContrato(Contrato contrato) {

        String sql = "UPDATE `contratoalquiler` SET `fecha_Final`=?, `fecha_Inicio`=?, `marca`=?, `vendedor`=?, `vigencia`=?, `nombre_garante`=?, `dni_garante`=?, `tel_garante`=? WHERE codContrato=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, contrato.getFecha_Final());
            ps.setDate(2, contrato.getFecha_Inicio());
            ps.setString(3, String.valueOf(contrato.getMarca()));
            ps.setString(4, contrato.getVendedor());
            ps.setBoolean(5, contrato.getVigencia());
            ps.setString(6, contrato.getNombreGarante());
            ps.setString(7, contrato.getDniGarante());
            ps.setString(8, contrato.getTelGarante());
            ps.setInt(9,contrato.getId_contrato() );
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contrato Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El contrato no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato " + ex.getMessage());
        }
}

       public Contrato buscarContratoPorID(int id) {
        Contrato contrato = null;
        String sql = "SELECT id_Inquilino,id_Propiedad,fecha_Final, fecha_Inicio,fechaRealizacion,marca,vendedor,estado,vigencia,nombre_garante,dni_garante,tel_garante FROM contratoalquiler WHERE codContrato =? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                contrato = new Contrato();
                contrato.setId_contrato(id);
                
                int inqId=rs.getInt("id_Inquilino");
                
                Inquilino inquilino= idata.buscarInquilinoPorID(inqId);
                contrato.setInquilino(inquilino);
                
                int proId=rs.getInt("id_Propiedad");
                
                Propiedad propiedad= propiedata.buscarPropiedadPorID(proId);
                contrato.setPropiedad(propiedad);
                
                contrato.setFecha_Final(rs.getDate("fecha_Final"));
                contrato.setFecha_Inicio(rs.getDate("fecha_Inicio"));
                contrato.setFecha_Realizacion(rs.getDate("fechaRealizacion"));
                String marca = rs.getString("marca");
                char marc=marca.charAt(0);
                contrato.setMarca(marc);
                contrato.setVendedor(rs.getString("vendedor"));
                contrato.setEstado(rs.getBoolean("estado"));
                contrato.setVigencia(rs.getBoolean("vigencia"));
                contrato.setNombreGarante(rs.getString("nombre_garante"));
                contrato.setDniGarante(rs.getString("dni_garante"));
                contrato.setTelGarante(rs.getString("tel_garante"));
                                         

            } else {
                JOptionPane.showMessageDialog(null, "No existe el contrato");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contrato " + ex.getMessage());

        }

        return contrato;
        
}
}