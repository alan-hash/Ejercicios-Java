/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_math;

/**
 *
 * @author LALO
 */
public class Operaciones_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num1=5;
       double raiz=0;
       raiz=Math.sqrt(num1);
       
       System.out.println("Raiz: "+raiz);
       double expo;
       expo=Math.pow(num1,2);
       System.out.println("Exponencial: "+expo);
       
       //Numero Absoluto
       float numAbs=-5.5f;
       float resAbs=Math.abs(numAbs);
       System.out.println("Numero Absoluto: "+resAbs);
       
       float numero=29.90f;
       float redondeo=Math.round(numero);
       System.out.println("Reodndeo: "+redondeo);
       
       double ran=Math.random();
       System.out.println("Random: "+ran*100);
       
        
       
       
    }
    
}
