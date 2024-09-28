package Biblioteca;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {
    private String codigo;
    public LocalDate fechaprestamo;
    public LocalDate fechaentrega;
    public int Costoprestamo;
    private Estudiente estudiente;
    private Bibliotecario bibliotecario;
    Collection<DetallePrestamo>detallePrestamos;
     private Libro libro;


    public Prestamo(Libro libro,String codigo, LocalDate fechaprestamo, LocalDate fechaentrega, int Costoprestamo, Estudiente estudiente, Bibliotecario bibliotecario) {
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.Costoprestamo = Costoprestamo;
        this.estudiente=estudiente;
        this.bibliotecario=bibliotecario;
        this.libro=libro
        this.detallePrestamos=new LinkedList<>();
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
        return Costoprestamo;
    }

    public void setCostoprestamo(int costoprestamo) {
        this.Costoprestamo = costoprestamo;
    }

    public Estudiente getEstudiente() {
        return estudiente;
    }

    public void setEstudiente(Estudiente estudiente) {
        this.estudiente = estudiente;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
     public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setLibros(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "codigo='" + codigo + '\'' +
                ", fechaprestamo=" + fechaprestamo +
                ", fechaentrega=" + fechaentrega +
                ", Costoprestamo=" + Costoprestamo +
                ", estudiente=" + estudiente +
                ", bibliotecario=" + bibliotecario +
                ", detallePrestamos=" + detallePrestamos +
                '}';
    }
}

