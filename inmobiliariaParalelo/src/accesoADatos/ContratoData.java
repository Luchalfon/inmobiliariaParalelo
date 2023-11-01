
package accesoADatos;

import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

        String sql = "UPDATE `contratoalquiler` SET id_Inquilino=?, id_Propiedad=?, `fecha_Final`=?, `fecha_Inicio`=?, `marca`=?, `vendedor`=?, `vigencia`=?, `nombre_garante`=?, `dni_garante`=?, `tel_garante`=? WHERE codContrato=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,contrato.getInquilino().getId_Inquilino());
            ps.setInt(2, contrato.getPropiedad().getId_propiedad());
            ps.setDate(3, contrato.getFecha_Final());
            ps.setDate(4, contrato.getFecha_Inicio());
            ps.setString(5, String.valueOf(contrato.getMarca()));
            ps.setString(6, contrato.getVendedor());
            ps.setBoolean(7, contrato.getVigencia());
            ps.setString(8, contrato.getNombreGarante());
            ps.setString(9, contrato.getDniGarante());
            ps.setString(10, contrato.getTelGarante());
            ps.setInt(11,contrato.getId_contrato() );
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El contrato se ha modificado");
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
        public void modificarContratoVigencia(Contrato contrato) {

        String sql = "UPDATE `contratoalquiler` SET `vigencia`=? WHERE codContrato=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, contrato.getVigencia());
            ps.setInt(2,contrato.getId_contrato() );
            int exito = ps.executeUpdate();

            if (exito == 1) {
                System.out.println("Vigencia modificada");
            } else {
                System.out.println("No exite contrato");
            }

        } catch (SQLException ex) {
            System.out.println("Error al acceder al contrato");
        }
}

        public List<Contrato> listarContratos() {

        List<Contrato> contratos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `contratoalquiler` WHERE estado=1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Contrato contrato;
               
                contrato = new Contrato();
                
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
              
                contratos.add(contrato);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla contrato" + ex.getMessage());
        }
        return contratos;
    }
      
         public List<Contrato> listarContratosVigentes() {

        List<Contrato> contratos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `contratoalquiler` WHERE estado=1 AND vigencia=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Contrato contrato;
               
                contrato = new Contrato();
                
                int inqId=rs.getInt("id_Inquilino");
                
                Inquilino inquilino= idata.buscarInquilinoPorID(inqId);
                contrato.setInquilino(inquilino);
                
                int proId=rs.getInt("id_Propiedad");
                
                Propiedad propiedad= propiedata.buscarPropiedadPorID(proId);
                contrato.setPropiedad(propiedad);
                contrato.setId_contrato(rs.getInt("codContrato"));
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
              
                contratos.add(contrato);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla contrato" + ex.getMessage());
        }
        return contratos;
    }
          public List<Contrato> listarProyContrato(int Id) {

        List<Contrato> contratos = new ArrayList<>();
        try {
            String sql = "SELECT contratoalquiler.codContrato, contratoalquiler.id_Inquilino, contratoalquiler.id_Propiedad, inquilino.apellido, inquilino.nombre FROM `contratoalquiler`, inquilino WHERE contratoalquiler.id_Inquilino=inquilino.id_Inquilino AND contratoalquiler.id_Propiedad=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Contrato contrato;
               
                contrato = new Contrato();
                
                 int inqId=rs.getInt("id_Inquilino");
                
                Inquilino inquilino= idata.buscarInquilinoPorID(inqId);
                contrato.setInquilino(inquilino);
                 
                int proId=rs.getInt("id_Propiedad");
                
                Propiedad propiedad= propiedata.buscarPropiedadPorID(Id);
                contrato.setPropiedad(propiedad);
                contrato.setId_contrato(rs.getInt("codContrato"));
//                contrato.setFecha_Final(rs.getDate("fecha_Final"));
//                contrato.setFecha_Inicio(rs.getDate("fecha_Inicio"));
//                contrato.setFecha_Realizacion(rs.getDate("fechaRealizacion"));
//                String marca = rs.getString("marca");
//                char marc=marca.charAt(0);
//                contrato.setMarca(marc);
//                contrato.setVendedor(rs.getString("vendedor"));
//                contrato.setEstado(rs.getBoolean("estado"));
//                contrato.setVigencia(rs.getBoolean("vigencia"));
//                contrato.setNombreGarante(rs.getString("nombre_garante"));
//                contrato.setDniGarante(rs.getString("dni_garante"));
//                contrato.setTelGarante(rs.getString("tel_garante"));
              
                contratos.add(contrato);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla contrato" + ex.getMessage());
        }
        return contratos;
    }
}