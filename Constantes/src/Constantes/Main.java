package Constantes;

public class Main {

    public static void main(String[] args) {
	Persona person=new Persona("juan");

        System.out.println("el nombre es: "+person.getName());
        person.setDinero(100);
        System.out.println("DINERO="+person.getDinero());


    }
}
