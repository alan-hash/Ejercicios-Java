package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int mayor=0,temp;
        System.out.println("Ingresa numeros divididos por coma");
        String texto= leer.nextLine();

        String numerosEntxt[]=texto.split(",");
        int cantidad= numerosEntxt.length;
        int numeros[]=new int[cantidad];

        for (int i = 0; i <cantidad ; i++) {
            numeros[i]=Integer.parseInt(numerosEntxt[i]) ;
        }
        for (int i = 0; i <(cantidad-1); i++) {
            for (int j = 0; j <(cantidad-1) ; j++) {
                if (numeros[j]>numeros[j+1]){
                    temp=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=temp;
                }
            }
        }
        System.out.println("Numeros ordenados de forma acendente");
        for (int i = 0; i <cantidad ; i++) {
            System.out.print(numeros[i]+",");
        }
        System.out.println("");

        System.out.println("Numeros ordenados de forma decendente");
        for (int i = cantidad-1; i>=0; i=i-1) {
            System.out.print(numeros[i]+",");
        }
    }
}
