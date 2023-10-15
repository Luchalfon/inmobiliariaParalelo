
package Entidades;


public class Propietario {
    private int id_propietario;
    private String apellido;
    private int dni;
    private String domicilio;
    private String nombre;
    private String telefono;
    private boolean estado;

    public Propietario() {
    }

    public Propietario(String apellido, int dni, String domicilio, String nombre, String telefono,boolean estado) {
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado=estado;
    }

    public Propietario(int id_propietario, String apellido, int dni, String domicilio, String nombre, String telefono,boolean estado) {
        this.id_propietario = id_propietario;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado=estado;
    }

   

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return id_propietario +" - "+ dni +" - " + apellido +", " + nombre;
    }
    
    
    
    
}
