package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             /*
Maria	Ramirez	C
Juan	Perez	B
Ines	Montes	B
Rene	Pacheco	B
Elena	Morales	A
Mario	Dias	C
Sonia	Navarro	A
        */
        boolean check=true;
        Scanner leer=new Scanner(System.in);
                            //columnas/filas
        String alumno[][]=new  String[3][3];
        /*se ingres alumno.leng(alumnos[0].lenght) que representa el numero de columnas en caso de que se
        dese sacar la longutud de las filas es alumnos[1].lenght
        */

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingresa los datos del alumno "+(i+1));
            for (int j = 0; j < alumno[1].length; j++) {
                alumno[i][j]= leer.next();
            }

        }
        System.out.println("Digita el aula de los alumnos que quieres visualizar");
        String aula= leer.next();
        aula=aula.toLowerCase();

        for (int i = 0; i < alumno.length ; i++) {
            if(alumno[i][2].toLowerCase().equals(aula)){
                check=false;
                System.out.println("");
                for (int j = 0; j < alumno[1] .length; j++) {
                    System.out.print(alumno[i][j]+",");
                }
            }
        }

        System.out.println("");

        if (check==true){
            System.out.println("El aula "+aula+" No existe");
        }



    }
}
