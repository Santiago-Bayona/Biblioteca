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

    public Biblioteca(String nombre, String direccion,double ganancia, int cantidadLibros) {
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.ganancia=ganancia;
        this.cantidadLibros=cantidadLibros;
        this.estudientes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
        this.libros = new LinkedList<>();
        this.prestamos=new LinkedList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public Collection<Estudiente> getEstudientes() {
        return estudientes;
    }

    public void setEstudientes(Collection<Estudiente> estudientes) {
        this.estudientes = estudientes;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

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
     * @return
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
     * Metodo que permite calcular el costo de un prestamo, multiplicando el CostoPorDia por la cantiadad de días prestaodo
     * @param codigo
     */
    public void CostoPrestamo(String codigo) {
        Long diferencia = null;
        double costo = 0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                diferencia = ChronoUnit.DAYS.between(prestamo.getFechaprestamo(), prestamo.getFechaentrega());
                costo = prestamo.getCostoprestamo();
                break;
            }
        }
        if (diferencia != null) {
            System.out.println("Costo del préstamo = " + (diferencia * costo) + " pesos");
        } else {
            System.out.println("No se encontró el préstamo con el código proporcionado.");
        }
    }

    /**
     * Metodo que permiyte añadir un libro a un prestamo
     * @param libro
     * @param fechaPrestamo
     * @param estudiente
     * @param bibliotecario
     */
    public void añadirlibroprestamo(Libro libro, LocalDate fechaPrestamo,Estudiente estudiente, Bibliotecario bibliotecario) {
        if (libro.getUnidadesDisponibles() > 0) {
            libro.disminuirUnidades();
            prestamos.add(new Prestamo(libro.getISBN(), fechaPrestamo, LocalDate.now(), 0,estudiente,bibliotecario));
            System.out.println("El libro " + libro.getTitulo() + " ha sido prestado con éxito.");
        }
    }

    /**
     * Metodo que permite encontrar la información del estudiante con más préstamos
     * @return
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
    public void consultarPrestamosPorNombreLibro(String nombreLibro) {
        int contadorPrestamos = 0; 

        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().getTitulo().equalsIgnoreCase(nombreLibro)) {
                contadorPrestamos++;  
                System.out.println("Préstamo encontrado: " + prestamo.getCodigo() 
                                   + ", Fecha: " + prestamo.getFechaprestamo() 
                                   + ", Libro: " + prestamo.getLibro().getTitulo());
            }
        }
        
        
        System.out.println("El libro \"" + nombreLibro + "\" está incluido en " + contadorPrestamos + " préstamos.");
    }

    public void  mostrarPrestamosPorBibliotecario() {
    for (Bibliotecario bibliotecario : bibliotecarios) {
        System.out.println("Bibliotecario: " + bibliotecario.getNombre() + 
                           " - Préstamos realizados: " + bibliotecario.getPrestamosRealizados());
    }
}

    /**
     * Metodo que permite ver toda la información de la biblioteca
     * @return
     */
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
