package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int mayor=0;
        System.out.println("Ingresa numeros divididos por coma");
        String texto= leer.nextLine();

        String numerosEntxt[]=texto.split(",");
        int cantidad= numerosEntxt.length;
        int numeros[]=new int[cantidad];

        for (int i = 0; i <cantidad ; i++) {
            numeros[i]=Integer.parseInt(numerosEntxt[i]) ;
        }
        for (int numero:numeros) {
            if (numero>mayor){
                mayor=numero;
            }
        }
        System.out.println("El numero mayor es: "+mayor );


    }
}
