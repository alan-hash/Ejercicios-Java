package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        int aleatorio;
        Scanner leer=new Scanner(System.in);
        System.out.println("Inserte la longitud ");
        int longitud= leer.nextInt();

        int[] numeros= new int[longitud];
        int num;
        for (int i = 0; i <numeros.length ; i++) {
            aleatorio= rand.nextInt(10)+1;
            numeros[i]=aleatorio;
            System.out.println("Tu numero aleatorio es: "+numeros[i]);
        }

    }
}
