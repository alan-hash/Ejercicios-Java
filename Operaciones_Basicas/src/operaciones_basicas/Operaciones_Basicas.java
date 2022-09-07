/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class Operaciones_Basicas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        float num1,num2,sum,rest,multi,divi,resu;
        System.out.println("Ingresa Dos Numeros");
        num1=leer.nextFloat();
        num2=leer.nextFloat();
        sum=num1+num2;
        rest=num1-num2;
        multi=num1*num2;
        divi=num1/num2;
        resu=num1%num2;
        
        
        System.out.println("El resultado de la suma es: "+ sum);
        System.out.println("El resultado de la resta es: "+ rest);
        System.out.println("El resultado de la multiplicacion es: "+ multi);
        System.out.println("El resultado de la division es: "+ divi);
        System.out.println("El resuido de la division es: "+ resu);
 
        
    }
    
}
