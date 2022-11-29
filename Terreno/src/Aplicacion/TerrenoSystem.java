/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;


import Clases.Rectangulo;
import Clases.Triangulo;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Clases.Terreno;


/**
 *
 * @author soporte
 */
public class TerrenoSystem {
    static Scanner leer=new Scanner(System.in);
    static ArrayList <Terreno> pedazoTerreno=new ArrayList<Terreno>();
   

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
        mostrarResultados();
    }
    
    

    protected static void llenaTriangulo() {
        System.out.println("Triangulo");
        double lado1,lado2,lado3;
        System.out.println("Ingrese las medidad del lado1 del triangulo");
        lado1=leer.nextDouble();
        System.out.println("Ingrese las medidad del lado2 del triangulo");
        lado2=leer.nextDouble();
        System.out.println("Ingrese las medidad del lado3 del triangulo");
        lado3=leer.nextDouble();
        Triangulo t=new Triangulo(lado1, lado2, lado3);
        pedazoTerreno.add(t);
        
        
        
    }

    protected static void llenaRectangulo() {
        System.out.println("Rectangulo");
        double lado1,lado2;
        System.out.println("Ingrese las medidad del lado1 del rectangulo");
        lado1=leer.nextDouble();
        System.out.println("Ingrese las medidad del lado2 del rectangulo");
        lado2=leer.nextDouble();
        Rectangulo t=new Rectangulo(lado1, lado2);
        pedazoTerreno.add(t);
      
    }

    private static void mostrarResultados() {
        double area=0;
       for (Terreno t:pedazoTerreno){
           System.out.println(t.toString()+"Area"+t.area());
           area=area+t.area();
       }
        System.out.println("EL AREA TOTAL DEL TERRENO ES:"+area);
    }
    
    
    

    
}
