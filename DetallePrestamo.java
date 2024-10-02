package Biblioteca;

public class DetallePrestamo {
    private int cantidad;
    private double subTotal;
    private Libro libro;


    /**
     * Metodo constructor de la clase detalleprestamo
     * @param cantidad
     * @param libro
     */  
    public DetallePrestamo(int cantidad, Libro libro){
        this.cantidad=cantidad;
        this.libro=libro;
        this.subTotal=0;
    }
/**
 * Metodo para obtener la cantidad
 * @return
 */
    public int getCantidad() {
        return cantidad;
    }
/**
 * Metodo para modificar la cantidad
 * @param cantidad
 */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
/**
 * Metodo para obtener el libro
 * @return
 */
    public Libro getLibro() {
        return libro;
    }
/**
 * Metodo para modificar el libro
 * @param libro
 */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
/**
 * Metodo para obtener el subtotal
 * @return
 */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Metodo que permite calcular el subtotal de un prestamo
     * @param costoPorDia
     * @param diasPrestamo
     */
    public void calcularSubTotal(double costoPorDia, int diasPrestamo) {
        this.subTotal = costoPorDia * diasPrestamo * cantidad;
    }

    @Override
    public String toString() {
        return "DetallePrestamo{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", libro=" + libro +
                '}';
    }
}
