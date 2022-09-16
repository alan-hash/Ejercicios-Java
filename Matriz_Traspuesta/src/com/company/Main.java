package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1	2	3
        4	5	6
        7	8	9
                */
        Scanner leer=new Scanner(System.in);
        int matriz[][]=new int[3][3];
        int matrizT[][]=new int[3][3];


        for (int i = 0; i < matriz.length ; i++) {
            System.out.println("Ingresa los datos de la fila "+(i+1));
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[j][i]=matriz[i][j];
            }
        }

        System.out.println("Matriz Normal");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");

        }

        System.out.println("Matriz transpues");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                System.out.print(matrizT[i][j]+"\t");
            }
            System.out.println("");

        }




    }
}
