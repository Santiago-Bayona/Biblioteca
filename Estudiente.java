package Biblioteca;


public class Estudiente extends Persona{

    public Estudiente (String nombre,String cedula, String telefono,String correo){
        super(nombre,cedula,telefono,correo);
    }


    @Override
    public String toString() {
        return "Estudiante= {" + super.toString() +" }";
    }
}
