package Métodos_Accesores;

public class Main {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();

        empleado.setEdad(35);
        System.out.println("EDAD: "+empleado.getEdad());

        empleado.setName("Alan");
        System.out.println("Nombre: "+empleado.getName());




    }
}
