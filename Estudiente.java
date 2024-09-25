package Biblioteca;


import java.util.Collection;
import java.util.LinkedList;

public class Estudiente extends Persona{
    private int edad;
    private Collection<Prestamo>prestamos;

    public Estudiente (String nombre,String cedula, String telefono,String correo, int edad){
        super(nombre,cedula,telefono,correo);
        this.edad=edad;
        this.prestamos=new LinkedList<>();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante= {" + super.toString() + " Edad: " + edad +" }";
    }
}
