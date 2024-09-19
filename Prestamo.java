package Biblioteca;
import java.time.LocalDate;
import java.util.LinkedList;

public class Prestamo {
    private String codigo;
    public LocalDate fechaprestamo;
    public LocalDate fechaentrega;
    public double costoprestamo;
    LinkedList<Libro>libros;

    public Prestamo(String codigo, LocalDate fechaprestamo, LocalDate fechaentrega, double costoprestamo) {
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.costoprestamo = costoprestamo;
        this.libros=new LinkedList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDate getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(LocalDate fechaentrega) {

        this.fechaentrega = fechaentrega;
    }

    public double getCostoprestamo() {  
        return costoprestamo;
    }

    public void setCostoprestamo(double costoprestamo) {
        this.costoprestamo = costoprestamo;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public void Cantidadprestar(int unidadesDisponibles) {
        for (Libro libro : libros) {
            if (libro.getUnidadesDisponibles() > 0) {
                unidadesDisponibles--;
            } else {
                System.out.println("No hay unidades disponibles.");
            }
        }
    }

    public void agregarLibroPrestamo(String codigo) {
        LinkedList<Libro> prestar = new LinkedList<>();
        int unidadesDisponibles = 0;

        // Contar unidades disponibles
        for (Libro libro : libros) {
            unidadesDisponibles += libro.getUnidadesDisponibles();
        }

        if (unidadesDisponibles > 0) {
            for (Libro libro : libros) {
                if (libro.getCodigo().equals(codigo)) {
                    prestar.add(libro);
                }
            }
        } else {
            System.out.println("No hay unidades disponibles para prestar.");
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "codigo='" + codigo + '\'' +
                ", fechaprestamo=" + fechaprestamo +
                ", fechaentrega=" + fechaentrega +
                ", costoprestamo=" + costoprestamo +
                '}';
    }
}


