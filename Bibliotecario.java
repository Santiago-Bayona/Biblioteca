package Biblioteca;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {
    private int salario;
    private int antiguedad;
    private Collection<Prestamo> prestamos;
    private int PrestamosRealizados;

    /**
     * Metodo constructor de la clase Bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param antiguedad
     */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int antiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = 0;
        this.antiguedad = antiguedad;
        this.prestamos = new LinkedList<>();
        this.PrestamosRealizados = 0;
    }

    /**
     * Metod que permite obtener el salario del biblotecario
     * @return el salario del biblotecario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * Metod que permite obtener los años de antiguedad del biblotecario
     * @return los años de antiguedad del biblotecario
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Metodo que permite modicar los años de antiguedad del biblotecario
     * @param antiguedad
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Metodo que permite obtener la coleccion de préstamos del biblotecario
     * @return la coleccion de préstamos
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo que permite modificar la coleccion de préstamos del biblotecario
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metod que permite obtener los préstamos realizados del biblotecario
     * @return préstamos realizados por el biblotecario
     */
    public int getPrestamosRealizados() {
        return PrestamosRealizados;
    }

    /**
     * Metodo que incrementa los préstamos
     */
    public void incrementarPrestamos() {
        this.PrestamosRealizados++;
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


