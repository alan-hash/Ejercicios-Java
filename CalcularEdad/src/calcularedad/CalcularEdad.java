/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularedad;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class CalcularEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu año de nacimiento");
        int anon=leer.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        int mesn=leer.nextInt();
        System.out.println("Ingresa tu dia de nacimiento");
        int day=leer.nextInt();
        
     
   
        Calendar fechaNac=new GregorianCalendar(anon,mesn,day);
        
       
        Calendar fechaA=Calendar.getInstance();
        int anoNac=fechaNac.get(Calendar.YEAR);
        int anoHoy=fechaA.get(Calendar.YEAR);
        
        int edad=anoHoy-anoNac;
        System.out.println("Tu edad es de: "+edad+" años");
        
        
        
        
        
        
        
    }
    
}
