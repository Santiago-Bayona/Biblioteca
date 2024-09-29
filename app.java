package Biblioteca;

import java.time.LocalDate;

public class app {
    public static void main (String[]args){
        Biblioteca SantoDomingo= new Biblioteca("Santo Domingo","carrera 19",0.0,58);

        Bibliotecario bibliotecario1= new Bibliotecario("Jose","1478444","31245457","Jose@gamil.com", 5);
        Bibliotecario bibliotecario2= new Bibliotecario("Victor","1084512","34758622345","Victor@gamil.com", 8);
        Bibliotecario bibliotecario3= new Bibliotecario("Maria","1084547","313254878","Maria@gamil.com", 7);


        Estudiente estudiente1= new Estudiente("luis","147","22121212","Luis@gmail.com",21);
        Estudiente estudiente2 = new Estudiente("Luna","10245","3115545644", "khskshsjk@gmail.com",17);
        Estudiente estudiente3 = new Estudiente("Javier","14545245","3124573558", "Javier@gmail.com",19);


        Libro libro1= new Libro("1478","14897","gabo","Cien años de Soledad","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);
        Libro libro2= new Libro("1479","14898","aritoteles","el principito","Norma", LocalDate.of(1954,8,17),4, Libro.Estado.regular);
        Libro libro3= new Libro("5745","24555","Fran kafka","La metamorfosis","Norma", LocalDate.of(1915,2,24),9, Libro.Estado.Malo);
        Libro nuevoLibro= new Libro("1474","14891","gabo","el pricipito-edicion especial","Norma", LocalDate.of(1998,4,7),7, Libro.Estado.regular);

        Prestamo prestamo1= new Prestamo("1787",LocalDate.now(),LocalDate.now().plusDays(7),10,estudiente1,bibliotecario1);
        Prestamo prestamo2= new Prestamo("1789",LocalDate.now(),LocalDate.now().plusDays(9),45,estudiente2,bibliotecario2);
        Prestamo prestamo3= new Prestamo("1787",LocalDate.now(),LocalDate.now().plusDays(8),32,estudiente2,bibliotecario3);

        SantoDomingo.agregarEstudiante(estudiente1);
        SantoDomingo.agregarEstudiante(estudiente2);
        SantoDomingo.agregarEstudiante(estudiente3);

        SantoDomingo.agregarBibliotecario(bibliotecario1);
        SantoDomingo.agregarBibliotecario(bibliotecario2);
        SantoDomingo.agregarBibliotecario(bibliotecario3);

        SantoDomingo.agregarLibro(libro1);
        SantoDomingo.agregarLibro(libro2);
        SantoDomingo.agregarLibro(libro3);

        SantoDomingo.agregarPrestamo(prestamo1);
        SantoDomingo.agregarPrestamo(prestamo2);
        SantoDomingo.agregarPrestamo(prestamo3);

        SantoDomingo.reemplazarLibro("14898",nuevoLibro);

        SantoDomingo.entregarPrestamo("1787");

        prestamo1.añadirlibroprestamo(libro1);
        prestamo2.añadirlibroprestamo(libro2);

        SantoDomingo.Consultalibro("1478");

        SantoDomingo.consultarPrestamosPorNombreLibro("Cien años de Soledad");

        SantoDomingo.mostrarPrestamosPorBibliotecario();

        SantoDomingo.ConsultaPrestamo("1789");

        System.out.println("el estudiante con mas prestamos es : " + SantoDomingo.estudianteConMasPrestamos());

        System.out.println(SantoDomingo);


    }
}