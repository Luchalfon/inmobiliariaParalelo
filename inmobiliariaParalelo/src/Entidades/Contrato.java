
package Entidades;

import java.sql.Date;


public class Contrato {
    private int id_contrato;
    private Inquilino inquilino;
    private Date fecha_Final;
    private Date fecha_Inicio;
    private Date Fecha_Realizacion;
    private char marca;
    private Propiedad propiedad;
    private String vendedor;
    private boolean estado;
    private String vigencia;
    private String nombreGarante;
    private String dniGarante;
    private String telGarante;

    public Contrato(Inquilino inquilino, Date fecha_Final, Date fecha_Inicio, Date Fecha_Realizacion, char marca, Propiedad propiedad, String vendedor, boolean estado, String vigencia, String nombreGarante, String dniGarante, String telGarante) {
        this.inquilino = inquilino;
        this.fecha_Final = fecha_Final;
        this.fecha_Inicio = fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
        this.estado = estado;
        this.vigencia = vigencia;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.telGarante = telGarante;
    }

    

    public Contrato(int id_contrato, Inquilino inquilino, Date fecha_Final, Date fecha_Inicio, Date Fecha_Realizacion, char marca, Propiedad propiedad, String vendedor,String vigencia,String nombreGarante,String dniGarante,String telGarante) {
        this.id_contrato = id_contrato;
        this.inquilino = inquilino;
        this.fecha_Final = fecha_Final;
        this.fecha_Inicio = fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
        this.vigencia = vigencia;
        this.nombreGarante = nombreGarante;
        this.dniGarante = dniGarante;
        this.telGarante = telGarante;
    }

    public Contrato() {
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Date getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(Date fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Realizacion() {
        return Fecha_Realizacion;
    }

    public void setFecha_Realizacion(Date Fecha_Realizacion) {
        this.Fecha_Realizacion = Fecha_Realizacion;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public String getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(String dniGarante) {
        this.dniGarante = dniGarante;
    }

    public String getTelGarante() {
        return telGarante;
    }

    public void setTelGarante(String telGarante) {
        this.telGarante = telGarante;
    }

    
    @Override
    public String toString() {
        return "Contrato{" + "id_contrato=" + id_contrato + ", inquilino=" + inquilino + ", fecha_Final=" + fecha_Final + ", fecha_Inicio=" + fecha_Inicio + ", Fecha_Realizacion=" + Fecha_Realizacion + ", marca=" + marca + ", propiedad=" + propiedad + ", vendedor=" + vendedor + '}';
    }
    
    
}
