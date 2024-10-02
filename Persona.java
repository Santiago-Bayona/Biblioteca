package Biblioteca;

public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private String Correo;

    /**
     * Metodo constructor de la clase Persona
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public Persona(String nombre,String cedula, String telefono,String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.Correo = correo;
    }

    /**
     * Metodo que permite obtener el nombre de una persona
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite modificar el nombre de una persona
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que permite obtener la cedula de una persona
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo que permita modificar la cedula de una persona
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo que permite obtener el telefono de una persona
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo que permite modificar el telefono de una persona
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo que obtener el correo de una persona
     * @return
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * Metodo que permite modificar el correo de una persona
     * @param correo
     */
    public void setCorreo(String correo) {
        Correo = correo;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Correo='" + Correo + '\'' ;
    }
}

