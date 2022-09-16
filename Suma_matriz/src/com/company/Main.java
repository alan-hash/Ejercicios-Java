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
        int sumafil=0, sumacol=0;

        System.out.println("Ingresa el numero de filas de la matriz");
        int fila= leer.nextInt();

        System.out.println("Ingresa el numero de columnas de la matriz");
        int col= leer.nextInt();

        int matriz[][]=new int[col][fila];

        for (int i = 0; i <col ; i++) {
            System.out.println("iNGRESA LOS DATOSS DE LA FILA "+(i+1));
            for (int j = 0; j < fila ; j++) {
                matriz[i][j]= leer.nextInt();
            }
        }


        System.out.println("Tu matriz es:");
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <fila ; j++) {
                System.out.print(matriz[i][j]+",");
            }
            System.out.println("");

        }
        System.out.println("");


        for (int i = 0; i <col; i++) {
            sumafil=0;
            for (int j = 0; j <fila ; j++) {
                sumafil=sumafil+matriz[i][j];
            }
            System.out.println("Suma de tu fila " +(i+1)+" es:"+sumafil);

        }

        System.out.println("");

        for (int j = 0; j <fila; j++) {
            sumacol=0;
            for (int i = 0; i <col ; i++) {
                sumacol=sumacol+matriz[i][j];
            }
            System.out.println("Suma de las columnas " +(j+1)+" es:"+sumacol);

        }







    }
}
