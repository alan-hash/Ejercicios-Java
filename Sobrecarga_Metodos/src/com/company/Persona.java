package com.company;

public class Persona {

    String nombre;
    String Edad;
    String Sexo;

    public Persona(String nombre, String edad, String sexo) {
        this.nombre = nombre;
        Edad = edad;
        Sexo = sexo;
    }

    public void persona(){
        System.out.println("el nombre de la persona es: "+this.nombre);
    }

    public void cumpleños(int dia,String mes,int year){
        System.out.println("La edad del pasajero es de "+this.Edad+" y su cumpleano es el dia "+dia+" del mes "
                +mes+" del ano "+ year);

    }

}
