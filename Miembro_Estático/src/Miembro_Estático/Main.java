package Miembro_Estático;

public class Main {

    public static void main(String[] args) {
        Estatica i1=new Estatica();
        Estatica i2=new Estatica();
//
//        System.out.println(i1.normal);
//        System.out.println(i2.normal);
//
//        i1.normal="Cambio de valor de i1";
//        i2.normal="Cambio de valor de i2";
//
//
//        System.out.println("");
//        System.out.println(i1.normal);
//        System.out.println(i2.normal);


        System.out.println("i1="+i1.estatico);
        System.out.println("i2="+i2.estatico);

        i1.estatico="Nuevo  valor de i1";
        i2.estatico="Nuevo  valor de i2";

        System.out.println("");
        System.out.println(i1.estatico);
        System.out.println(i2.estatico);







    }
}
