/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirstringentero;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class ConvertirStringEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese los numero a calcular separados por comas");
        String cadena=leer.nextLine();
        String textojunto=cadena.replaceAll("\\s","");
        String []textoSeparado=textojunto.split(",");
       
        for (int i = 0; i < textoSeparado.length; i++) {
           int numero=Integer.parseInt(textoSeparado[i]);
           System.out.print(numero+"+");
           suma=suma+numero;  
        }
        System.out.println("");
        System.out.println("el resultado de la suma de numero es "+suma);
        
    }
    
}
