package Biblioteca;

public class Bibliotecario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String Correo;
    private int Salario;
    private int antiguedad;

    public Bibliotecario(String nombre,String cedula, String telefono,String correo,int salario,int antiguedad) {
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.Correo=correo;
        this.Salario=salario;
        this.antiguedad=antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Correo='" + Correo + '\'' +
                ", Salario=" + Salario +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
