/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class EntradaDatos_Conslole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,suma;
        String cadena;
        char caracter;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Escribe tu Nombre ");
        cadena=entrada.nextLine();
        caracter=cadena.charAt(0);
       
        
        System.out.println("ingrese el numero 1");
        num1=entrada.nextInt();
      
     
        System.out.println("ingrese el numero 2");
        num2=entrada.nextInt();
     
        suma=num1+num2;
        System.out.println("Tu nombre es: "+cadena);
        System.out.println("El caracter de tu primer letra es: "+caracter);
        System.out.println("el resultado de la suma es: "+ suma);
        
        
        
           
        
        
    }
    
}
