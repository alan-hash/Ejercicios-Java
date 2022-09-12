package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        char []abecedario= new char[91-65];
        for (int i = 65, indice=0 ; i <91 ; i++,indice++) {
            abecedario[indice ]=(char)i;
            System.out.println("posicion "+indice+": "+ abecedario[indice ]);
        }
        System.out.println("Inserte un numero entre  0 y "+(abecedario.length-1)+",-1 para acabar");
        int num= leer.nextInt();
        String cadena="";

        while (num!=-1){
            if (num>=0 && num<abecedario.length){
                System.out.println("Inserte un numero entre  0 y "+(abecedario.length-1)+",-1 para acabar");
                cadena+=abecedario[num];

            }else {
                System.out.println("Error el numero no es  valido es entre  0 y "+(abecedario.length-1)+",-1 para acabar");
            }
            num= leer.nextInt();

        }
        System.out.println("La cadena es: " +cadena);

    }
}
