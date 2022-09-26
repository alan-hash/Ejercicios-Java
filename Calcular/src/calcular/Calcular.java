/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float oper,n1,n2;
        Calculadora cal=new Calculadora();
        System.out.println("Ingresa 2 numeros para realizar las operaciones ");
        n1=leer.nextFloat();
        n2=leer.nextFloat();
        
        System.out.println("");
        oper=cal.suma(n1, n2);
        System.out.println("El resultado de la suma es: "+oper);
        
        oper=cal.Resta(n1, n2);
        System.out.println("El resultado de la resta es: "+oper);
        
        oper=cal.Multi(n1, n2);
        System.out.println("El resultado de la multiplicacion es: "+oper);
        
        oper=cal.Division(n1, n2);
        System.out.println("El resultado de la division es: "+oper);
        
        
        
       
    }
    
}
