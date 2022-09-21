package herencia_poo;


import herencia.Persona;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import herencia.Persona;

public class Estudiante extends Persona {

    private String matricula;

    private float calificacion;

    public Estudiante(String nombre, String Apellido, int edad,String matricula, float calificacion) {
        super(nombre, Apellido, edad);
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

 
    public String getMatricula() {
        return this.matricula;
    }

    public float getCalificacion() {
        return this.calificacion;
    }

    public void MuestraName() {
        System.out.println("NOMBRE: "+this.getNombre());
    }

    public void MuestraApellido() {
        System.out.println("APELLIDO: "+this.getApellido());
        
    }

    public void MuestraEdad() {
        
        System.out.println("EDAD: "+ this.getEdad());
    }
}
