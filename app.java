package Biblioteca;

import java.time.LocalDate;

public class app {
    public static void main (String[]args){
        Biblioteca SantoDomingo= new Biblioteca("Santo Domingo","carrera 19",0.0,58);
        Bibliotecario bibliotecario1= new Bibliotecario("Jose","1478444","31245457","Jose@gamil.com", 2000,5);
        Estudiente estudiente1= new Estudiente("luis","147","22121212","Luis@gmail.com",21);
        Estudiente estudiente2 = new Estudiente("Luna","10245","3115545644", "khskshsjk@gmail.com",17);
        Libro libro1= new Libro("1478","14897","gabo","Cien años de Soledad","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);
        Libro libro2= new Libro("1479","14898","aritoteles","el principito","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);
        Prestamo prestamo1= new Prestamo("1787",LocalDate.now(),LocalDate.now().plusDays(7),10,estudiente1,bibliotecario1);
        SantoDomingo.agregarEstudiante(estudiente1);
        SantoDomingo.agregarEstudiante(estudiente2);
        SantoDomingo.agregarPrestamo(prestamo1);
        SantoDomingo.agregarBibliotecario(bibliotecario1);
        SantoDomingo.agregarLibro(libro1);
        SantoDomingo.agregarLibro(libro2);
        Libro nuevoLibro= new Libro("1479","14898","gabo","el pricipito-edicion especial","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);
        SantoDomingo.reemplazarLibro("14898",nuevoLibro);
        SantoDomingo.CostoPrestamo("1787");
        SantoDomingo.añadirlibroprestamo(libro1, LocalDate.now(),estudiente1,bibliotecario1);
        SantoDomingo.Consultalibro("1478");
        System.out.println("el estudiante con mas prestamos es : " + SantoDomingo.estudianteConMasPrestamos());
        System.out.println(SantoDomingo);


    }
}