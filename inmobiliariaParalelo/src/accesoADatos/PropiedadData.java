
package accesoADatos;

import Entidades.Propiedad;
import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PropiedadData {
    
     private Connection con = null;
     private PropietarioData pd=new PropietarioData();
    public PropiedadData(){
        
          con = miConexion.getConexion();//me conecto a la base
         
        
    }

    
    public void guardarPropiedad(Propiedad propiedad) {

        String sql = " INSERT INTO `propiedadinmueble`( `accesibilidad`, `direccion`, id_Propietario, `forma`, `precioTazado`, `revisor`, `superficieMinima`, `tipoDeLocal`, `zona`, disponible, `estado`)VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propiedad.getAccesibilidad());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getPropietario().getId_propietario());  
            ps.setString(4, propiedad.getForma());
            ps.setFloat(5, propiedad.getPrecio());
            ps.setString(6,propiedad.getRevisor());
            ps.setInt(7,propiedad.getSuperficieMinima());
            ps.setString(8,propiedad.getTipoPropiedad());
            ps.setString(9,propiedad.getTipoZona());
            ps.setBoolean(10,propiedad.isDisponible());
            ps.setBoolean(11,propiedad.isEstado());
            
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               propiedad.setId_propiedad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "propiedad Guardada");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla propiedad");
        }

    }
    
    public void modificarPropiedad(Propiedad propiedad) {

        String sql = "UPDATE `propiedadinmueble` SET `accesibilidad`=?,`direccion`=?,`id_Propietario`=?,`forma`=?,`precioTazado`=? ,`revisor`=? ,`superficieMinima`=?,`tipoDeLocal`=?,`zona`=? WHERE id_Propiedad=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, propiedad.getAccesibilidad());
            ps.setString(2, propiedad.getDireccion());
            ps.setInt(3, propiedad.getPropietario().getId_propietario());  
            ps.setString(4, propiedad.getForma());
            ps.setFloat(5, propiedad.getPrecio());
            ps.setString(6,propiedad.getRevisor());
            ps.setInt(7,propiedad.getSuperficieMinima());
            ps.setString(8,propiedad.getTipoPropiedad());
            ps.setString(9,propiedad.getTipoZona());
            ps.setInt(10,propiedad.getId_propiedad()) ;
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propidad Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La propiedad no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad " + ex.getMessage());
        }

    }
     
     public Propiedad buscarPropiedadPorID(int id) {
        Propiedad propiedad = null;
        String sql = "SELECT id_propietario,accesibilidad,direccion,forma,precioTazado,revisor,superficieMinima,tipoDeLocal,zona FROM propiedadinmueble WHERE id_Propiedad = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                propiedad = new Propiedad();
                propiedad.setId_propiedad(id); 
                Propietario propie=pd.buscarPropietarioPorID(rs.getInt("id_propietario"));
                
                propiedad.setPropietario(propie);
                propiedad.setAccesibilidad(rs.getString("accesibilidad"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setForma(rs.getString("forma"));
                propiedad.setPrecio(rs.getInt("precioTazado"));
                propiedad.setRevisor(rs.getString("revisor"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setTipoZona(rs.getString("zona"));
                    
              //  propiedad.setPrecio(jop);
                          

            } else {
                JOptionPane.showMessageDialog(null, "No existe la propiedad");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propiedad " + ex.getMessage());

        }

        return propiedad;
        
        
    }
     
     
      
    public List<Propiedad> listarPropiedad() {

        List<Propiedad> propiedades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `propiedadinmueble` WHERE estado=1 AND disponible=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Propiedad propiedad;
               
                propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                Propietario propie=pd.buscarPropietarioPorID(rs.getInt("id_Propietario"));
                
                propiedad.setPropietario(propie);
                
                propiedad.setAccesibilidad(rs.getString("accesibilidad"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setForma(rs.getString("forma"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setRevisor(rs.getString("revisor"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setDisponible(rs.getBoolean("disponible"));
                propiedad.setEstado(true);
               
                propiedades.add(propiedad);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla propiedad" + ex.getMessage());
        }
        return propiedades;
    }
    
    
    public void eliminarPropiedad(int id) {
        try {
            String sql = "UPDATE propiedadinmueble SET estado = 0 WHERE id_Propiedad = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la propiedad.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Propiedad");
        }

    }
   public List<Propiedad> obtenerPropiedadesPorPropietario(int id_Propietario) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        String sql = "SELECT propiedadinmueble.id_Propiedad,propiedadinmueble.direccion,propiedadinmueble.precioTazado,propiedadinmueble.tipoDeLocal FROM propiedadinmueble WHERE propiedadinmueble.estado=1 AND propiedadinmueble.id_Propietario= ? AND propiedadinmueble.disponible=0";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_Propietario);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {

                Propiedad propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_propiedad"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                
               
                propiedades.add(propiedad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Inscripción");
        }
        return propiedades;
    }    
    
public List<Propiedad> obtenerPropiedadesPorZona(String zona) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        String sql = "SELECT id_Propiedad,tipoDeLocal,direccion,precioTazado,zona,superficieMinima FROM propiedadinmueble WHERE estado=1 AND disponible=0 AND zona= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, zona);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {

                Propiedad propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
               
                propiedades.add(propiedad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Propiedad");
        }
        return propiedades;
    }       




public List<Propiedad> obtenerPropiedadesPorTipo(String tipo) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        String sql = "SELECT id_Propiedad,tipoDeLocal,direccion,precioTazado,zona,superficieMinima FROM propiedadinmueble WHERE estado=1 AND disponible=0 AND tipoDeLocal= ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {

                Propiedad propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                
               
                propiedades.add(propiedad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Propiedad");
        }
        return propiedades;
    }       

public List<Propiedad> obtenerPropiedadesPorSup(int superf) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        String sql = "SELECT id_Propiedad,tipoDeLocal,direccion,precioTazado,zona,superficieMinima FROM propiedadinmueble WHERE estado=1 AND disponible=0 AND superficieMinima > ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, superf);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {

                Propiedad propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                
               
                propiedades.add(propiedad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Propiedad");
        }
        return propiedades;
    }       

public List<Propiedad> obtenerPropiedadesPorPrecio(float precio) {

        ArrayList<Propiedad> propiedades = new ArrayList<>();

        String sql = "SELECT id_Propiedad,tipoDeLocal,direccion,precioTazado,zona,superficieMinima FROM propiedadinmueble WHERE estado=1 AND disponible=0 AND precioTazado < ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, precio);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {

                Propiedad propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                
               
                propiedades.add(propiedad);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla Propiedad");
        }
        return propiedades;
    }       

 public List<Propiedad> listarPropiedadesDisponibles() {

        List<Propiedad> propiedades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `propiedadinmueble` WHERE estado=1 AND disponible=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Propiedad propiedad;
               
                propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                Propietario propie=pd.buscarPropietarioPorID(rs.getInt("id_Propietario"));
                
                propiedad.setPropietario(propie);
                
                propiedad.setAccesibilidad(rs.getString("accesibilidad"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setForma(rs.getString("forma"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setRevisor(rs.getString("revisor"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setDisponible(rs.getBoolean("disponible"));
                propiedad.setEstado(true);
               
                propiedades.add(propiedad);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla propiedad" + ex.getMessage());
        }
        return propiedades;
    }

 public void modificarPrecioPropiedad(Propiedad propiedad) {

        String sql = "UPDATE `propiedadinmueble` SET `precioTazado`=? WHERE id_Propiedad=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, propiedad.getPrecio());
            ps.setInt(2, propiedad.getId_propiedad());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Propidad Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La propiedad no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad " + ex.getMessage());
        }

    }

 public void modificarDisponibilidadPropiedad(Propiedad propiedad) {

        String sql = "UPDATE `propiedadinmueble` SET `disponible`=? WHERE id_Propiedad=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, propiedad.isDisponible());
            ps.setInt(2, propiedad.getId_propiedad());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                System.out.println("Disponibilidad Modificada");
            } else {
                System.out.println("No existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad " + ex.getMessage());
        }

    }
 public List<Propiedad> listarPropiedadTodos() {

        List<Propiedad> propiedades = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `propiedadinmueble` WHERE estado=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Propiedad propiedad;
               
                propiedad = new Propiedad();
                propiedad.setId_propiedad(rs.getInt("id_Propiedad"));
                Propietario propie=pd.buscarPropietarioPorID(rs.getInt("id_Propietario"));
                
                propiedad.setPropietario(propie);
                
                propiedad.setAccesibilidad(rs.getString("accesibilidad"));
                propiedad.setDireccion(rs.getString("direccion"));
                propiedad.setForma(rs.getString("forma"));
                propiedad.setPrecio(rs.getFloat("precioTazado"));
                propiedad.setRevisor(rs.getString("revisor"));
                propiedad.setSuperficieMinima(rs.getInt("superficieMinima"));
                propiedad.setTipoPropiedad(rs.getString("tipoDeLocal"));
                propiedad.setTipoZona(rs.getString("zona"));
                propiedad.setDisponible(rs.getBoolean("disponible"));
                propiedad.setEstado(true);
               
                propiedades.add(propiedad);
                          
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla propiedad" + ex.getMessage());
        }
        return propiedades;
    }

}
