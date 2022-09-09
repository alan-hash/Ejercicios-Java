/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i,repeti,j,rep;
       /*
        System.out.println("Coloca un valor entero:");
        i=leer.nextInt();
        
       while(i>=1){
           System.out.println("i= "+i);
           i=i-1;  
       }
       
        System.out.println("Ingresa cuatas veces quieres que se repita hola ");
        rep=leer.nextInt();
        j=1;
        while(j<=rep){
            System.out.println("Hola.");
            j=j+1;  
        }
        */
       
        System.out.println("Ingrece valor inicial");
         i=leer.nextInt();
         System.out.println("Ingrese valor final");
         rep=leer.nextInt();
         
         while(i<=rep){
             System.out.println("i: "+i);
             i++; 
             
                 
         }
        
        
        
        
    }
}
