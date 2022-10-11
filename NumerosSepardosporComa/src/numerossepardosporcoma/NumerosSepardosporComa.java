/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerossepardosporcoma;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class NumerosSepardosporComa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa una Fecha");
        String cadena=leer.nextLine();
        String []fechaseparada=cadena.split(",");
       
        String dia=fechaseparada[0];
        String mes=fechaseparada[1];
        String año=fechaseparada[2];
        
        System.out.println("El dia es: "+dia);
        System.out.println("El mes es: "+mes);
        System.out.println("El año es: "+año);
        
        
    }
    
}
