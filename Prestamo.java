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

    /**
     * Metod constructor de la clase prestamo
     * @param codigo
     * @param fechaprestamo
     * @param fechaentrega
     * @param Costoprestamo
     * @param estudiente
     * @param bibliotecario
     */
    public Prestamo(String codigo, LocalDate fechaprestamo, LocalDate fechaentrega, int Costoprestamo, Estudiente estudiente, Bibliotecario bibliotecario) {
        this.codigo = codigo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
        this.Costoprestamo = Costoprestamo;
        this.estudiente=estudiente;
        this.bibliotecario=bibliotecario;
        this.detallePrestamos=new LinkedList<>();
        this.bibliotecario.incrementarPrestamos();
        this.bibliotecario.getPrestamos().add(this);
    }

    /**
     * Metod que permite obtener el codigo del prestamo
     * @return el codigo del prestamo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo que permite modificar el codigo del prestamo
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metod que permite obtener la fecha en la que se haya hecho el prestamo
     * @return la fecha del prestamo
     */
    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    /**
     * Metodo que permite modificar la fecha en la que se hay hecho el prestamo
     * @param fechaprestamo
     */
    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    /**
     * Metodo que permite obtener la fecha de entrega del prestamo
     * @return La fecha de la entrega
     */
    public LocalDate getFechaentrega() {
        return fechaentrega;
    }

    /**
     * Metodo que permite modificar la fecha de entrega del prestamo
     * @param fechaentrega
     */
    public void setFechaentrega(LocalDate fechaentrega) {

        this.fechaentrega = fechaentrega;
    }

    /**
     * Metodo que permite obtener el coste del prestamo
     * @return El costo del prestamo
     */
    public double getCostoprestamo() {
        return Costoprestamo;
    }

    /**
     * Metodo que permite metodo que permite modificar el coste del prestamo
     * @param costoprestamo
     */
    public void setCostoprestamo(int costoprestamo) {
        this.Costoprestamo = costoprestamo;
    }

    /**
     * Metodo que permite obtener el estudiante que pidio el prestamo
     * @return El estudiante
     */
    public Estudiente getEstudiente() {
        return estudiente;
    }

    /**
     * Metodo que permite modificar al estudiante que pidio el prestamo
     * @param estudiente
     */
    public void setEstudiente(Estudiente estudiente) {
        this.estudiente = estudiente;
    }

    /**
     * Metodo que permite obtener al biblotecario del prestamo
     * @return Biblotecario
     */
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    /**
     * Metodo que permite modificar el biblotecario del prestamo
     * @param bibliotecario
     */
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    /**
     * Metodo que permite obtener la coleccion detalle prestamo del prestamo
     * @return coleccion del detalle prestamo
     */
    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    /**
     * Metodo que permite modificar la coleccion detalle prestamo del prestamo
     * @param detallePrestamos
     */
    public void setLibros(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    /**
     * Metodo que permite añadir un libro a un prestamo
     * @param libro
     * @param cantidad
     * @param costoPorDia
     */
    public void añadirlibroprestamo(Libro libro, int cantidad, double costoPorDia) {
        if (libro.getUnidadesDisponibles() > 0) {
            libro.disminuirUnidades();

            DetallePrestamo detalle = new DetallePrestamo(cantidad, libro);
            int diasPrestamo = (int) ChronoUnit.DAYS.between(fechaprestamo, fechaentrega);
            detalle.calcularSubTotal(costoPorDia, diasPrestamo);

            this.detallePrestamos.add(detalle);

            System.out.println("El libro " + libro.getTitulo() + " ha sido prestado con éxito.");
        } else {
            System.out.println("No hay unidades disponibles del libro " + libro.getTitulo() + ".");
        }
    }

    /**
     * Metodo que permite calcular el costo total de un prestamo
     * @return
     */
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

