package herencia_poo;

public class Persona {

    private String nombre;

    private String Apellido;

    private int edad;

    public Persona(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

  

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public int getEdad() {
        return this.edad;
    }
}
