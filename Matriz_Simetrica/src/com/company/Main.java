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
        boolean symetric=true;


        System.out.println("Ingresa el numero de columnas de la matriz");
        int col= leer.nextInt();

        System.out.println("Ingresa el numero de filas de la matriz");
        int fila= leer.nextInt();

        int matriz[][]=new int[col][fila];

        for (int i = 0; i < matriz[0].length ; i++) {
            System.out.println("ingrese los datos de la matriz de la fila "+(i+1));
            for (int j = 0; j < matriz[1].length ; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        if(col==fila){
            for (int i = 0; i < matriz[0].length ; i++) {
                for (int j = 0; j <matriz[1].length ; j++) {
                    if (matriz[i][j]!=matriz[j][i]){
                        symetric=false;
                        break;

                    }

                }
                if(symetric==false){
                    break;

                }
            }
            
            
        }else {
            System.out.println("la  matriz  que ingresastes no es simetrica");
            System.exit(0);
        }




        if(symetric==true){
            System.out.println("Tu matriz si es simetrica");

        }else {
            System.out.println("La matriz no es simetrica intenta de nuevo");
        }

    }
}
