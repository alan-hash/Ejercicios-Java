package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el numero de longitude");
        int longitud= leer.nextInt();
        int numeros[]=new int[longitud];
        int num;

        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Inserte el numero de la posicion "+i);

            do{
                num=leer.nextInt();
                if (!(num>0 && num<=10)) {
                    System.out.println("Error solo numeros entre 1 y 10");
                }

            }while (!(num>0 && num<=10));
            numeros[i]=num;
        }

        System.out.println("Tus numeros son");

        for (int i = 0; i <numeros.length ; i++) {

            System.out.print(numeros[i]+",");

        }



    }
}
