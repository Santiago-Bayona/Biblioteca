package Biblioteca;

public class DetallePrestamo {
    private int cantidad;
    private double subTotal;
    private Libro libro;

    public DetallePrestamo(int cantidad, Libro libro){
        this.cantidad=cantidad;
        this.libro=libro;
        this.subTotal=0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

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
