/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumen_cilindro;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class Volumen_Cilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float pi=3.1416f;
        float diametro,altura,radio;
        double volumne;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Diametro:");
        diametro=leer.nextFloat();
        
        System.out.println("Altura: ");
        altura=leer.nextFloat();
        
        radio=diametro/2;
        volumne=pi*Math.pow(radio,2)*altura;
        System.out.println("Volumne de un vaso: "+ Math.round(volumne));
         
    
    }
    
}
