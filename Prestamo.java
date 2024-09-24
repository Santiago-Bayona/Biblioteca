package Biblioteca;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Prestamo {
    private String codigo;
    public LocalDate fechaprestamo;
    public LocalDate fechaentrega;
    public double costoprestamo;
    private Libro LibroPrestado;
    Collection<Libro>libros;

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

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Libro getPrestado() {
        return LibroPrestado;
    }

    public void setPrestado(Libro prestado) {
        this.LibroPrestado = prestado;
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

