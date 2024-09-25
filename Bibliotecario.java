package Biblioteca;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private int Salario;
    private int antiguedad;
    private Collection<Prestamo>prestamos;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.Salario = salario;
        this.antiguedad = antiguedad;
        this.prestamos=new LinkedList<>();
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
        return "Bibliotecario{" + super.toString() +
                ", Salario=" + Salario +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
