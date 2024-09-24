package Biblioteca;


public class Estudiente extends Persona{

   public String correoinstitucional;
    public Estudiante (String nombre,String cedula, String telefono,String correo,String correoinstitucional) {
        super(nombre,cedula,telefono,correo);
        this.correoinstitucional = correoinstitucional;
    }

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional=correoinstitucional;
    }



    @Override
    public String toString() {
        return "Estudiante= {" + super.toString() +"correoinstitucional= "+correoinstitucional+"}";
    }


}
