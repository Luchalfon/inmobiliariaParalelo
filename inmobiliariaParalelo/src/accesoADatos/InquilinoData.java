
package accesoADatos;

import Entidades.Inquilino;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InquilinoData {
     private Connection con = null;
    
    public InquilinoData(){
        
        con = miConexion.getConexion();//me conecto a la base
             
    }
    
     public void guardarInquilino(Inquilino inquilino) {

        String sql = " INSERT INTO `inquilino`(`apellido`, `nombre`, `DNI`, `detalle`, `tipo`,`cuit`,`telefono`,`estado`)VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inquilino.getApellido());  
            ps.setString(2, inquilino.getNombre());
            ps.setInt(3, inquilino.getDni());
            ps.setString (4, String.valueOf(inquilino.getDetalle()));
            ps.setString(5, String.valueOf(inquilino.getTipo()));
            ps.setString(6,inquilino.getCuit());
            ps.setString(7, inquilino.getTelefono());
            ps.setBoolean(8, true);
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               inquilino.setId_Inquilino(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inquilino Guardado");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla inquilino");
        }

    }
    
    public void modificarInquilino(Inquilino inquilino) {

        String sql = "UPDATE `inquilino` SET `apellido`=?,`nombre`=?,`DNI`=?,`detalle`=?,`tipo`=?,`cuit`=?,`telefono`=? WHERE id_Inquilino=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inquilino.getApellido());  
            ps.setString(2, inquilino.getNombre());
            ps.setInt(3, inquilino.getDni());
            ps.setString(4, String.valueOf(inquilino.getDetalle()));
            ps.setString(5,String.valueOf(inquilino.getTipo()));
            ps.setString(6, inquilino.getCuit());
            ps.setString(7, inquilino.getTelefono());
            ps.setInt(8, inquilino.getId_Inquilino());
            
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inquilino Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Inquilino no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino " + ex.getMessage());
        }

    }
     
      public Inquilino buscarInquilinoPorID(int id) {
        Inquilino inquilino=null;
        
         
        String sql = "SELECT apellido, nombre, DNI, detalle, tipo, cuit, telefono FROM inquilino WHERE id_Inquilino = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inquilino = new Inquilino();
                inquilino.setId_Inquilino(id);
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setDni(rs.getInt("DNI"));
                String deta=rs.getString("detalle");
                char detalle1=deta.charAt(0);
                inquilino.setDetalle(detalle1);
                String tip=rs.getString("tipo");
                char tipo1=tip.charAt(0);
                inquilino.setTipo(tipo1);
                inquilino.setCuit(rs.getString("cuit"));
                inquilino.setTelefono(rs.getString("telefono"));
                inquilino.setEstado(true);
                                     
               

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Inquilino");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilino" + ex.getMessage());

        }

        return inquilino;
    }
     
     
      
    public List<Inquilino> listarinquilino() {

        List<Inquilino> inquilinos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inquilino WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Inquilino inquilino;
               
                inquilino = new Inquilino();
                inquilino.setId_Inquilino(rs.getInt("id_Inquilino"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setDni(rs.getInt("DNI"));
                String deta=rs.getString("detalle");
                char detalle1=deta.charAt(0);
                inquilino.setDetalle(detalle1);
                String tip=rs.getString("tipo");
                char tipo1=tip.charAt(0);
                inquilino.setTipo(tipo1);
                inquilino.setCuit(rs.getString("cuit"));
                inquilino.setTelefono(rs.getString("telefono"));
                inquilino.setEstado(true);

                inquilinos.add(inquilino);
                
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inquilino " + ex.getMessage());
        }
        return inquilinos;
    }
    
    
    public void eliminarInquilino(int id) {
        try {
            String sql = "UPDATE inquilino SET estado = 0 WHERE id_Inquilino = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Inquilino.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inquilino");
        }

    }
}
