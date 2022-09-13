package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //5 10 15 58 20 56 65
        Scanner leer=new Scanner(System.in);
        int elemento[]= new int[7];
        System.out.println("insera 7 numeros para que los busque");
        for (int i = 0; i <7 ; i++) {
            elemento[i]= leer.nextInt();
        }
        System.out.println("ingrese el dato que deseas buscar");
        int numbuscar= leer.nextInt();
        int i=0;
        boolean bandera=false;
        while (i<7 && bandera==false){
            if (numbuscar==elemento[i]){
                bandera=true;
            }
            i++;
        }
        if (bandera){
            System.out.println("Tu numero fue encontrado exitosamente en la posicion "+i);
        }else {
            System.out.println("Numero no encontrado");
        }


    }
}
