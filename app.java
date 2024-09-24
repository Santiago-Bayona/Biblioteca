package Biblioteca;

import java.time.LocalDate;

public class app {
    public static void main (String[]args){
        Biblioteca SantoDomingo= new Biblioteca("Santo Domingo","carrera 19");
        Bibliotecario bibliotecario1= new Bibliotecario("Jose","1478444","31245457","Jose@gamil.com", 2000,5);
        Estudiente estudiente1= new Estudiente("luis","147","22121212","Luis@gmail.com");
        Estudiente estudiente2 = new Estudiente("Luna","10245","3115545644", "khskshsjk@gmail.com");
        Libro libro1= new Libro("1478","14897","gabo","Cien años de Soledad","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);
        Libro libroNuevo= new Libro("7885","44554","Kafka","Metamorofois","Norma", LocalDate.of(1974,5,12),7, Libro.Estado.Muy_Bien);
        Prestamo prestamo1 = new Prestamo("1787",LocalDate.of(2024,8,10),LocalDate.of(2024,8,15),5.6);
        SantoDomingo.agregarLibro(libro1);
        SantoDomingo.agregarPrestamo(prestamo1);
        SantoDomingo.realizarPrestamo("1478",LocalDate.of(2024,8,10),LocalDate.of(2024,8,15),5.0,estudiente1,bibliotecario1);
        SantoDomingo.agregarEstudiante(estudiente1);
        SantoDomingo.agregarEstudiante(estudiente2);
        SantoDomingo.agregarBibliotecario(bibliotecario1);

        SantoDomingo.ConsultaLibro("1478");
        System.out.println(SantoDomingo);
    }
}
