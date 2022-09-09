/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo_for;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class Ciclo_for {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        
         /*
    }
       for(int i =1; i<=10;i++){
           System.out.println("I= "+i);
       } 
      */ 
    /*
    for(int i=10;i>=1;i=i-1){
            System.out.println("i:"+i);
    }
    */
        System.out.println("Ingresa el numero de la tabala de multipliicar");
        int inicial=leer.nextInt();
        System.out.println("Ingresa el limite de la tabala de multipliicar");
        int lim=leer.nextInt();
        
        for(int i=1;i<=lim;i=i+1){
            System.out.println(inicial+ " * "+i+" = "+inicial*i);
        }
       
    }
}
    

