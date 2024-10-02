package Biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Biblioteca {
    public String Nombre;
    public String Direccion;
    private double ganancia;
    private int cantidadLibros;
    Collection<Estudiente> estudientes;
    Collection<Bibliotecario> bibliotecarios;
    Collection<Libro> libros;
    Collection<Prestamo>prestamos;
    Collection<DetallePrestamo>detallePrestamos;

    /**
     * Metodo constructor de la clase Biblioteca
     * @param nombre
     * @param direccion
     * @param ganancia
     * @param cantidadLibros
     */
    public Biblioteca(String nombre, String direccion,double ganancia, int cantidadLibros) {
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.ganancia=ganancia;
        this.cantidadLibros=cantidadLibros;
        this.estudientes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
        this.libros = new LinkedList<>();
        this.prestamos=new LinkedList<>();
        this.detallePrestamos=new LinkedList<>();
    }

    /**
     * Metodo que permite obtener el nombre de la biblioteca
     * @return el nombre de la biblioteca
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo que permite moficar el nombre de la biblioteca
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * Metodo que permite obtener la ganancia de la Biblioteca
     * @return la ganacia de la biblioteca
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * Metodo que permite modificar la ganancia de la biblioteca
     * @param ganancia
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * Metodo que permite obtener la cantidad de libros de la biblioteca
     * @return cantida de libros en la biblioteca
     */
    public int getCantidadLibros() {
        return cantidadLibros;
    }

    /**
     * Metodo que permite modificar la cantidad de libros de la biblioteca
     * @param cantidadLibros
     */
    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    /**
     * Metodo que permite obtener la direccion de la biblioteca
     * @return la direccion de la biblioteca
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Metodo que permite modificar la direccion de la biblioteca
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    /**
     * Metodo que permite obtener la coleccion de estudiantes de la biblioteca
     * @return coleccion de estudiantes
     */
    public Collection<Estudiente> getEstudientes() {
        return estudientes;
    }

    /**
     * Metodo que permite modificar la coleccion de estudiantes de la biblioteca
     * @param estudientes
     */
    public void setEstudientes(Collection<Estudiente> estudientes) {
        this.estudientes = estudientes;
    }

    /**
     * Metodo que permite obtener la coleccion de biblotecarios de la biblioteca
     * @return coleccion de biblotecarios
     */
    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /**
     *Metodo que permite modificar la coleccion de biblotecarios de la biblioteca
     * @param bibliotecarios
     */
    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /**
     * Metodo que permite obtener la coleccion de libros de la biblioteca
     * @return coleccion de libros
     */
    public Collection<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo que permite modificar la coleccion de libros de la biblioteca
     * @param libros
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo que permite obtener la coleccion de prestámos de la biblioteca
     * @return Coleccion de prestámos
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo que permite modificar la coleccion de prestámos de la biblioteca
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }


    /**
     * metodo para verificar que no hayan 2 estudiantes repetidos
     * @param cedula
     * @return un booleano
     */
    public boolean verificarEstudiante(String cedula) {
        for (Estudiente estudiente : estudientes) {
            if (cedula.equals(estudiente.getCedula())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo para verificar que no hayan 2 bibliotecarios repetidos
     * @param cedula
     * @return un booleano
     */
    public boolean verificarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (cedula.equals(bibliotecario.getCedula())) {
                return false;
            }
        }
        return true;
    }

    /**
     * metodo para verificar que no hayan 2 libros repetidos
     * @param ISBN
     * @return un booleano
     */
    public boolean verificarLibro(String ISBN) {
        for (Libro libro : libros) {
            if (libro.equals(libro.getISBN())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que vincula a los estudiantes con la biblioteca
     * @param estudiente
     */
    public void agregarEstudiante(Estudiente estudiente){
        if(verificarEstudiante(estudiente.getCedula())){
            estudientes.add(estudiente);
        }
    }

    /**
     * Metodo que vincula a los bibliotecarios con la biblioteca
     * @param bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario){
        if(verificarBibliotecario(bibliotecario.getCedula())){
            bibliotecarios.add(bibliotecario);
        }
    }

    /**
     * Metodo que vincula a los libros con la biblioteca
     * @param libro
     */
    public void agregarLibro(Libro libro){
        if(verificarLibro(libro.getISBN())){
            libros.add(libro);
        }
    }

    /**
     * Metodo que permite consultar la información de un libro
     * @param codigo
     */
    public void Consultalibro(String codigo) {
        Boolean centinela =false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("El libro consultado es: " + libro);
                centinela=true;
            }
        }
        if(centinela == false){
            System.out.println("El libro con ese codigo no existe");
        }
    }

    /**
     * Metodo que permite consultar la información de un prestamo
     * @param codigo
     */
    public void ConsultaPrestamo(String codigo) {
        Boolean centinela =false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                System.out.println("El prestamo consultado es: " + prestamo);
                centinela=true;
            }
        }
        if(centinela == false){
            System.out.println("El prestamo con ese codigo no existe");
        }
    }

    /**
     * Metodo que vincula a los prestamos con la biblioteca
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo){
        if(verificarPrestamo(prestamo.getCodigo())){
            prestamos.add(prestamo);
        }
    }

    /**
     * Metodo para verificar que no haya 2 prestamos iguales
     * @param codigo
     * @return boolean
     */
    public boolean verificarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.equals(prestamo.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite reemplazar la información un libro por otro nuevo
     * @param ISBN
     * @param nuevoLibro
     * @return el reemplazo del libro
     */
    public boolean reemplazarLibro(String ISBN, Libro nuevoLibro) {
        if (ISBN == null || nuevoLibro == null) {
            System.out.println("ISBN o libro nuevo no pueden ser nulos.");
            return false;
        }

        Iterator<Libro> iterator = libros.iterator();

        while (iterator.hasNext()) {
            Libro libroActual = iterator.next();
            if (libroActual.getISBN() != null && libroActual.getISBN().equals(ISBN)) {
                iterator.remove();
                libros.add(nuevoLibro);
                System.out.println("Libro con ISBN " + ISBN + " reemplazado por " + nuevoLibro);
                return true;
            }
        }
        System.out.println("No se encontró el libro con ISBN " + ISBN);
        return false;
    }

    /**
     * Metodo que permite entregar un prestamo, calculando el costo
     * @param codigo
     */
    public void entregarPrestamo(String codigo) {
        Long diferencia = null;
        double costo = 0;
        Prestamo prestamoEntregado = null;

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                diferencia = ChronoUnit.DAYS.between(prestamo.getFechaprestamo(), prestamo.getFechaentrega());
                costo = prestamo.getCostoprestamo();
                prestamoEntregado = prestamo;
                break;
            }
        }
        if (prestamoEntregado != null) {
            double costoTotal = diferencia * costo;
            System.out.println("Costo del préstamo = " + costoTotal + " pesos.");
            for (DetallePrestamo detallePrestamo:detallePrestamos) {
                Libro libro = detallePrestamo.getLibro();
                libro.sumarUnidades();
            }
            System.out.println("El préstamo ha sido entregado y se ha actualizado el stock del libro.");
        } else {
            System.out.println("No se encontró el préstamo con el código proporcionado.");
        }
    }

    /**
     * Metod que permite ver en cuantos préstamos está un libro
     * @param nombreLibro
     */
    public void consultarPrestamosPorNombreLibro(String nombreLibro) {
        int contadorPrestamos = 0;
        for (Prestamo prestamo : prestamos) {
            for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
                if (detallePrestamo.getLibro().getTitulo().equals(nombreLibro)) {
                    contadorPrestamos++;
                    System.out.println("Préstamo encontrado: " + prestamo.getCodigo()
                            + ", Fecha del préstamo: " + prestamo.getFechaprestamo()
                            + ", Fecha de entrega: " + prestamo.getFechaentrega()
                            + ", Libro: " + detallePrestamo.getLibro().getTitulo());
                    break;
                }
            }
        }

        System.out.println("El libro \"" + nombreLibro + "\" está incluido en " + contadorPrestamos + " préstamos.");
    }


    /**
     * Metodo que permite encontrar la información del estudiante con más préstamos
     * @return el estudiante con más prestámos
     */
    public Estudiente estudianteConMasPrestamos() {
        Estudiente estudianteConMas = null;
        int maxPrestamos = 0;
        LinkedList<Estudiente> estudiantes = new LinkedList<>();
        for (Prestamo prestamo : prestamos) {
            Estudiente estudiante = prestamo.getEstudiente();
            if (!estudiantes.contains(estudiante)) {
                estudiantes.add(estudiante);
            }
        }
        for (Estudiente estudiante : estudiantes) {
            int contador = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getEstudiente().equals(estudiante)) {
                    contador++;
                }
            }
            if (contador > maxPrestamos) {
                maxPrestamos = contador;
                estudianteConMas = estudiante;
            }
        }

        return estudianteConMas;
    }

    /**
     * Metodo que permite la cantidad préstamos realizada por cada bibliotecario
     */
    public void  mostrarPrestamosPorBibliotecario() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            System.out.println("Bibliotecario: " + bibliotecario.getNombre() +
                    " - Préstamos realizados: " + bibliotecario.getPrestamosRealizados());
        }
    }

    /**
     * Metodo que permite calcular la ganacia de la biblioteca
     */
    public double calcularTotalrecaudado() {
        double total = 0;
        for (Prestamo prestamo : this.prestamos) {
            for (DetallePrestamo detalle : prestamo.getDetallePrestamos()) {
                total += detalle.getSubTotal();
            }
        }
        this.ganancia = total; // Actualiza la ganancia con el total recaudado
        return total;
    }




    @Override
    public String toString() {
        return "Biblioteca{" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", ganancia=" + ganancia +
                ", cantidadLibros=" + cantidadLibros +
                ", estudientes=" + estudientes +
                ", bibliotecarios=" + bibliotecarios +
                ", libros=" + libros +
                ", prestamos=" + prestamos +
                '}';
    }
}