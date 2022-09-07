/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        float n1,n2,n3,total;
        double tredondeo,redondeo;
        
        
        Scanner leer=new Scanner(System.in);
        name=JOptionPane.showInputDialog("Hola Ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "Tu Nombre es:  "+name);
        
        System.out.println("Ingres el valor del producto 1");
        n1=leer.nextFloat();
        System.out.println("Ingres el valor del producto 2");
        n2=leer.nextFloat();
        System.out.println("Ingres el valor del producto 3");
        n3=leer.nextFloat();
        total=n1+n2+n3;
        System.out.println("El valor del la suma es: "+total);
        tredondeo=Math.round(total);
       
        System.out.println("El valor a pagar con redondeo es de: "+tredondeo);
        
        redondeo=tredondeo-total;
        System.out.println("El redondeo corresponde: "+redondeo);
        
        JOptionPane.showMessageDialog(null, "Gracias por su compra :)");
         
    }
    
}
