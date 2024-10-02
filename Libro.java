package Biblioteca;

import java.time.LocalDate;

public class Libro {
    private String Codigo;
    private String ISBN;
    private String Autor;
    private String Titulo;
    private String Editorial;
    private LocalDate fecha;
    private int UnidadesDisponibles;
    private Estado Estado;
    public enum Estado{
        Muy_Bien, regular, Malo
    }

    /**
 * metodo Constructor de la clase Libro
 * @param codigo
 * @param ISBN
 * @param autor
 * @param titulo
 * @param editorial
 * @param fecha
 * @param unidadesDisponibles
 * @param estado
 */
    pub
    public Libro(String codigo,String ISBN,String autor,String titulo,String editorial, LocalDate fecha,int unidadesDisponibles,Estado estado){
        this.Codigo=codigo;
        this.ISBN=ISBN;
        this.Autor=autor;
        this.Titulo=titulo;
        this.Editorial=editorial;
        this.fecha=fecha;
        this.UnidadesDisponibles=unidadesDisponibles;
        this.Estado=estado;
    }
 /**
    * Metodo para disminuir las unidades de los libros
    */
    public void decrementarUnidades() {
        if (UnidadesDisponibles > 0) {
            UnidadesDisponibles--;
        }
    }
   /**
    * Metodo para aumentar las unidades de los libros
    */
    public void incrementarUnidades() {
        UnidadesDisponibles++;
    }
/**
 * Metodo para obtener el Codigo
 * @return
 */
    public String getCodigo() {
        return Codigo;
    }
/**
 * Metodo para modificar el Codigo
 * @param codigo
 */
    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }
/**
 * Metodo para obtener el ISBN
 * @return
 */
    public String getISBN() {
        return ISBN;
    }
/**
 * Metodo para modificar el ISBN
 * @param ISBN
 */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
/**
 * Metodo para obtener el Autor
 * @return
 */
    public String getAutor() {
        return Autor;
    }
/**
 * Metodo para modificar el Autor
 * @param autor
 */
    public void setAutor(String autor) {
        this.Autor = autor;
    }
/**
 * Metodo para obtener el Titulo
 * @return
 */
    public String getTitulo() {
        return Titulo;
    }
/**
 * Metodo para modificar el Titulo
 * @param titulo
 */
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }
/**
 * Metodo para obtener la Editorial
 * @return
 */
    public String getEditorial() {
        return Editorial;
    }
/**
 * Metodo para modificar la Editorial
 * @param editorial
 */
    public void setEditorial(String editorial) {
        this.Editorial = editorial;
    }
/**
 * Metodo para obtener la fecha
 * @return
 */
    public LocalDate getFecha() {
        return fecha;
    }
/**
 * Metodo para modificar la fecha
 * @param fecha
 */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
/**
 * Metodo para obtener las Unidades Disponibles
 * @return
 */
    public int getUnidadesDisponibles() {
        return UnidadesDisponibles;
    }
/**
 * Metodo para modificar las Unidades Disponibles
 * @param unidadesDisponibles
 */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.UnidadesDisponibles = unidadesDisponibles;
    }
/**
 * Metodo para obtener el estado
 * @return
 */
    public Libro.Estado getEstado() {
        return Estado;
    }
/**
 * Metodo para modificar el estado
 * @param estado
 */
    public void setEstado(Libro.Estado estado) {
        this.Estado = estado;
    }

    /**
     * Metodo que permite disminuir las unidades de un libro cada vez que sea prestado
     */
    public void disminuirUnidades() {
        if (UnidadesDisponibles > 0) {
            UnidadesDisponibles--;
        } else {
            System.out.println("No hay unidades disponibles");
        }}

    /**
     * Metodo que permite sumar las unidaes de un libro cada vez que sea entregado
     */
    public void sumarUnidades() {
        if (UnidadesDisponibles > 0) {
            UnidadesDisponibles++;
        } else {
            System.out.println("No hay unidades disponibles");
        }}



        @Override
    public String toString() {
        return "Libro{" +
                "Codigo='" + Codigo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", Editorial='" + Editorial + '\'' +
                ", fecha=" + fecha +
                ", UnidadesDisponibles=" + UnidadesDisponibles +
                ", Estado=" + Estado +
                '}';
    }
}
