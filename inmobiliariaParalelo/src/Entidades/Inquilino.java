
package Entidades;


public class Inquilino {
    
    private int id_Inquilino;
    private String apellido;
    private String nombre;
    private int dni;
    private char detalle;
    private char tipo;
    private String cuit;
    private String telefono;
    private boolean estado;

    public Inquilino() {
    }

    public Inquilino(String apellido, String nombre, int dni, char detalle, char tipo, String cuit, String telefono, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.detalle = detalle;
        this.tipo = tipo;
        this.cuit = cuit;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Inquilino(int id_Inquilino, String apellido, String nombre, int dni, char detalle, char tipo, String cuit, String telefono, boolean estado) {
        this.id_Inquilino = id_Inquilino;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.detalle = detalle;
        this.tipo = tipo;
        this.cuit = cuit;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getId_Inquilino() {
        return id_Inquilino;
    }

    public void setId_Inquilino(int id_Inquilino) {
        this.id_Inquilino = id_Inquilino;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getDetalle() {
        return detalle;
    }

    public void setDetalle(char detalle) {
        this.detalle = detalle;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  id_Inquilino + " " + apellido + " " + nombre ;
    }
    
    
            
    
}
