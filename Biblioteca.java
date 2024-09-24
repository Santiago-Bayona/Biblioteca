package Biblioteca;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    public String Nombre;
    public String Direccion;
    Collection<Estudiente> estudientes;
    Collection<Bibliotecario> bibliotecarios;
    List<Libro> libros;
    Collection<Prestamo>prestamos;

    public Biblioteca(String nombre, String direccion) {
        this.Nombre = nombre;
        this.Direccion = direccion;
        this.estudientes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
        this.libros = new ArrayList<>();
        this.prestamos=new LinkedList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
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

    public boolean verificarEstudiante(String cedula) {
        for (Estudiente estudiente : estudientes) {
            if (cedula.equals(estudiente.getCedula())) {
                return false;
            }
        }
        return true;
    }
    public boolean verificarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (cedula.equals(bibliotecario.getCedula())) {
                return false;
            }
        }
        return true;
    }
    public boolean verificarLibro(String ISBN) {
        for (Libro libro : libros) {
            if (libro.equals(libro.getISBN())) {
                return false;
            }
        }
        return true;
    }

    public void agregarEstudiante(Estudiente estudiente){
        if(verificarEstudiante(estudiente.getCedula())){
            estudientes.add(estudiente);
        }
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario){
        if(verificarBibliotecario(bibliotecario.getCedula())){
            bibliotecarios.add(bibliotecario);
        }
    }

    public void agregarLibro(Libro libro){
        if(verificarLibro(libro.getISBN())){
            libros.add(libro);
        }
    }
    public Libro ConsultaLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }

    public void agregarPrestamo(Prestamo prestamo){
        if(verificarPrestamo(prestamo.getCodigo())){
            prestamos.add(prestamo);
        }
    }
    public boolean verificarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.equals(prestamo.getCodigo())) {
                return false;
            }
        }
        return true;
    }
    public void reemplazarLibro(String codigoViejo, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigoViejo)) {
                libros.set(i, nuevoLibro);
                System.out.println("Libro reemplazado con éxito.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }







    @Override
    public String toString() {
        return "Biblioteca{" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", estudientes=" + estudientes +
                ", bibliotecarios=" + bibliotecarios +
                ", libros=" + libros +
                ", prestamos=" + prestamos +
                '}';
    }
}
