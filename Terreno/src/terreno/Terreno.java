/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;

import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class Terreno {
    static Scanner leer=new Scanner(System.in);

    public static void main(String[] args) {

        char res;
        int opcion;
        do{
           System.out.println("Que tipo de figura vas ingresar");
           System.out.println("1)TRIANGULO");
           System.out.println("2)RECTANGULO");
           opcion=leer.nextInt();
           switch(opcion){
               case 1:llenaTriangulo();
               break;
               
               case 2:llenaRectangulo();
               break;
               
           }
            
            
            
            
            
           System.out.println("Desea ingresar mas secciones de terreno para calcular? s/n");
            res=leer.next().charAt(0); 
        }while(res=='s' || res=='S');
    }
    
    

    protected static void llenaTriangulo() {
        System.out.println("Triangulo");
    }

    protected static void llenaRectangulo() {
        System.out.println("Rectangulo");
    }
    
}
