package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


       int suma=0;
       float media;

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad");
        int longitud= leer.nextInt();
        int[] numeros= new int[longitud];

        for (int i = 0; i<numeros.length; i++) {
            numeros[i]=i+1;
            System.out.println("posicion:"+i+" "+numeros[i]);
            suma=suma+numeros[i];

        }
        System.out.println("el resulltado de la suma es: "+suma);
        media=suma/ numeros.length;
        System.out.println("La media es de: "+media);



    }
}
