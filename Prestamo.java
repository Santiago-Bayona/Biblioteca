package Biblioteca;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public Prestamo(String codigo, LocalDate fechaprestamo, LocalDate fechaentrega, int Costoprestamo, Estudiente estudiente, Bibliotecario bibliotecario) {
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.Costoprestamo = Costoprestamo;
        this.estudiente=estudiente;
        this.bibliotecario=bibliotecario;
        this.detallePrestamos=new LinkedList<>();
        this.bibliotecario.incrementarPrestamos();
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

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setLibros(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public void añadirlibroprestamo(Libro libro, int cantidad, double costoPorDia) {
        if (libro.getUnidadesDisponibles() > 0) {
            libro.disminuirUnidades();

            // Crear un nuevo detalle de préstamo con los argumentos necesarios
            DetallePrestamo detalle = new DetallePrestamo(cantidad, libro);
            int diasPrestamo = (int) ChronoUnit.DAYS.between(fechaprestamo, fechaentrega);
            detalle.calcularSubTotal(costoPorDia, diasPrestamo);

            // Agregar el detalle a la colección de detalles de préstamo
            this.detallePrestamos.add(detalle);

            System.out.println("El libro " + libro.getTitulo() + " ha sido prestado con éxito.");
        } else {
            System.out.println("No hay unidades disponibles del libro " + libro.getTitulo() + ".");
        }
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (DetallePrestamo detalle : detallePrestamos) {
            total += detalle.getSubTotal();
        }
        return total;
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

