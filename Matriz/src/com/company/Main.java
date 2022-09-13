package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//	int matriz[][]={{5,20,30},{8,15,5},{54,5,2}};

        Scanner leer=new Scanner(System.in);
        System.out.println("Digita la longitud de filas de la matriz");
        int registros= leer.nextInt();
        System.out.println("Digita la longitud de columnas de la matriz");
        int col= leer.nextInt();


        int matriz[][]= new int[registros][col];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("ingresa 3 datos de la fila "+(i+1));

            for (int j = 0; j < matriz.length; j++) {
             matriz[i][j]= leer.nextInt();
            }

        }

        System.out.println("\nEsta es tu matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");
        }

    }

}
