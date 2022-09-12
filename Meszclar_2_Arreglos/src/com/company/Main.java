package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        int []b=new int[5];
        int []c=new int[10];
        int j=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingresa el valor de la posicion: "+(i+1)+" del arreglo A");
            a[i]= sc.nextInt();

        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ingresa el valor de la posicion: "+(i+1)+" del arreglo b");
            b[i]= sc.nextInt();
        }
        for (int i = 0; i < 5  ; i++) {
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        for (int elemnto:c) {
            System.out.print(elemnto+",");
        }
    }
}
