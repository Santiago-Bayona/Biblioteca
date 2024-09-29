package Biblioteca;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private int salario;
    private int antiguedad;
    private Collection<Prestamo> prestamos;
    private int PrestamosRealizados;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = 0;
        this.antiguedad = antiguedad;
        this.prestamos = new LinkedList<>();
        this.PrestamosRealizados = 0;
    }

    public int getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void incrementarPrestamos() {
        this.PrestamosRealizados++;
    }

    public int getPrestamosRealizados() {
        return PrestamosRealizados;
    }

    /**
     * Metodo para calcular el salrio de un bibliecario
     */
    public void calcularSalario() {
        double totalPrestamos = 0;
        for (Prestamo prestamo : prestamos) {
            totalPrestamos += prestamo.calcularCostoTotal();
        }
        double salarioBase = totalPrestamos * 0.20;
        double bonificacion = salarioBase * (0.02 * antiguedad);
        this.salario = (int) (salarioBase + bonificacion);
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + super.toString() +
                ", Salario=" + salario +
                ", antiguedad=" + antiguedad +
                '}';
    }
}


