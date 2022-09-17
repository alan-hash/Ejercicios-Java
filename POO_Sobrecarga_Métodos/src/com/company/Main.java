package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Random rand=new Random();
//        int aleatorio= rand.nextInt(10)+1;
//        System.out.println(aleatorio);

        Vehiculo v1=new Vehiculo("Nissan","1990");
        v1.acelerar();

        Vehiculo v2=new Vehiculo("1931187930");
        v2.acelerar(10);




    }
}
