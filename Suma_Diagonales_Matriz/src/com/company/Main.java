package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int matriz[][]=new int[5][5];
        int dato=1;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[i][j]=dato;
                dato=dato+1;
            }
        }

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                System.out.print("\t"+matriz[i][j]+",");

            }
            System.out.println("");
        }

        int diagonalP[]=new int[matriz.length];
        int diagonalS[]=new int[matriz.length];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                if (i==j){
                    diagonalP[i]=matriz[i][j];
                }
                if ((i+j)==matriz.length-1){
                    diagonalS[i]=matriz[i][j];
                }

            }

        }
        System.out.println("");
        int suma=0;
        System.out.println("Tu Diagonal principal es:");
        for (int elemento:diagonalP){
            System.out.print("\t"+ elemento);
            suma=suma+elemento;
        }
        System.out.println("");
        System.out.print("la suma de la Diagonal principal es: "+suma);
        System.out.println("");
        System.out.println("");


         suma=0;
        System.out.println("TU Diagonal secundaria es:");
        for (int elemento:diagonalS){
            System.out.print("\t"+ elemento);
            suma=suma+elemento;
        }
        System.out.println("");
        System.out.print("la suma de la Diagonal Secundari es: "+suma);
        System.out.println("");







    }
}
