
package Entidades;


public class Propiedad {
  private int id_propiedad;
  private String accesibilidad;
  private String direccion;
  private Propietario propietario;
  private String forma;
  private float precio;
  private String revisor;
  private int superficieMinima;
  private String tipoPropiedad;
  private String tipoZona;
  private boolean disponible;
  private boolean estado;

    public Propiedad() {
    }

    public Propiedad(String accesibilidad, String direccion, Propietario propietario, String forma, float precio, String revisor, int superficieMinima, String tipoPropiedad, String tipoZona,boolean disponible, boolean estado) {
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.propietario = propietario;
        this.forma = forma;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoPropiedad = tipoPropiedad;
        this.tipoZona = tipoZona;
        this.disponible=disponible;
        this.estado = estado;
    }

    public Propiedad(int id_propiedad, String accesibilidad, String direccion, Propietario propietario, String forma, float precio, String revisor, int superficieMinima, String tipoPropiedad, String tipoZona,boolean disponible, boolean estado) {
        this.id_propiedad = id_propiedad;
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.propietario = propietario;
        this.forma = forma;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoPropiedad = tipoPropiedad;
        this.tipoZona = tipoZona;
        this.disponible=disponible;
        this.estado = estado;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  id_propiedad + " - " + tipoPropiedad + " - " + direccion + " - " + precio;
    }


  
  
  
  
}
