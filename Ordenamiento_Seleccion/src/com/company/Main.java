package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int elemento[]= new int[5];
        int menor,pos,tem;
        System.out.println("insera 5 numeros para que los ordene");
        for (int i = 0; i <5 ; i++) {
            elemento[i]= leer.nextInt();
        }
        for (int i = 0; i <elemento.length-1 ; i++) {
            menor=elemento[i];
            pos=i;
            for (int j = i+1; j < elemento.length; j++) {
                if (elemento[j]<menor){
                    menor=elemento[j];
                    pos=j;
                }
            }
            if(pos!=i){
                tem=elemento[i];
                elemento[i]=elemento[pos];
                elemento[pos]=tem;
            }
        }

        System.out.println("Elementos ordenados acendente");
        for (int i = 0; i <elemento.length ; i++) {
            System.out.print(elemento[i]+",");
        }
        System.out.println("");

        System.out.println("Elementos ordenados decendente");
        for (int i = elemento.length-1; i >=0 ; i--) {
            System.out.print(elemento[i]+",");
        }

    }
}
