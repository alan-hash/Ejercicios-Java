package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //5 10 15 30 58 20 56 65
        Scanner leer=new Scanner(System.in);


        int elemento[]= new int[8];
        System.out.println("insera 8 numeros para que los busque");
        for (int i = 0; i <8 ; i++) {
            elemento[i]= leer.nextInt();
        }
        System.out.println("ingrese el dato que deseas buscar");
        int numbuscar= leer.nextInt();

        int n= elemento.length, inferior=0, centro=0;
        int superior=n-1;
        boolean bandera=false;

        while (inferior<=superior){
            centro=(superior+inferior)/2;
            if (elemento[centro]==numbuscar){
                bandera=true;
                break;
            }else if (numbuscar<elemento[centro]){
                superior=centro-1;
            }
            else{
                inferior=centro+1;
            }

        }
        if(bandera==true){
            System.out.println("Numero encontrado en la posicion "+(centro+1));
        }else{
            System.out.println("Numero no encontrado");
        }


    }
}
