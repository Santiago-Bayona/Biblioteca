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
    private int prestamosRealizados;

    public Libro(String codigo,String ISBN,String autor,String titulo,String editorial, LocalDate fecha,int unidadesDisponibles,Estado estado){
        this.Codigo=codigo;
        this.ISBN=ISBN;
        this.Autor=autor;
        this.Titulo=titulo;
        this.Editorial=editorial;
        this.fecha=fecha;
        this.UnidadesDisponibles=unidadesDisponibles;
        this.Estado=estado;
        this.prestamosRealizados = 0;
    }

    public void decrementarUnidades() {
        if (UnidadesDisponibles > 0) {
            UnidadesDisponibles--;
        }
    }

    public void incrementarUnidades() {
        UnidadesDisponibles++;
    }

    public void incrementarPrestamos() {
        prestamosRealizados++;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        this.Editorial = editorial;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return UnidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.UnidadesDisponibles = unidadesDisponibles;
    }

    public Libro.Estado getEstado() {
        return Estado;
    }

    public void setEstado(Libro.Estado estado) {
        this.Estado = estado;
    }
    public void disminuirUnidades() {
        if (UnidadesDisponibles > 0) {
            UnidadesDisponibles--;
        } else {
            System.out.println("No hay unidades disponibles");
        }
    }


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
