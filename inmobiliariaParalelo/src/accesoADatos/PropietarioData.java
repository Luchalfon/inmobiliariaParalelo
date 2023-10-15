
package accesoADatos;

import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropietarioData {
     
    private Connection con = null;
    
    public PropietarioData(){
        
        con = miConexion.getConexion();//me conecto a la base
             
    }
    
     public void guardarPropietario(Propietario propietario) {

        String sql = " INSERT INTO `propietario`(`apellido`, `nombre`, `DNI`, `domicilio`, `telefono`,`estado`)VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getApellido());  
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getTelefono());
            ps.setBoolean(6,propietario.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               propietario.setId_propietario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "propietario Guardado");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla propietario");
        }

    }
    
     public void modificarPropietario(Propietario propietario) {

        String sql = "UPDATE `propietario` SET `apellido`=?,`nombre`=?,`DNI`=?,`domicilio`=?,`telefono`=? WHERE id_Propietario=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, propietario.getApellido());  
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getTelefono());
            ps.setInt(6, propietario.getId_propietario());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propietario Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Propietario no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario " + ex.getMessage());
        }

    }
     
      public Propietario buscarPropietarioPorID(int id) {
        Propietario propietario = null;
        String sql = "SELECT apellido, nombre, DNI, domicilio, telefono FROM propietario WHERE id_Propietario = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                propietario = new Propietario();
                propietario.setId_propietario(id);
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDni(rs.getInt("DNI"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setEstado(true);
                
               

            } else {
                JOptionPane.showMessageDialog(null, "No existe el propietario");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario " + ex.getMessage());

        }

        return propietario;
    }
     
     
      
    public List<Propietario> listarPropietarios() {

        List<Propietario> propietarios = new ArrayList<>();
        try {
            String sql = "SELECT * FROM propietario WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Propietario propietario;
               
                propietario = new Propietario();
                propietario.setId_propietario(rs.getInt("id_Propietario"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDni(rs.getInt("DNI"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setEstado(true);

                propietarios.add(propietario);
                
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return propietarios;
    }
    
    
    public void eliminarPropietario(int id) {
        try {
            String sql = "UPDATE propietario SET estado = 0 WHERE id_Propietario = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Propietario.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Propietario");
        }

    }
    
    
}
