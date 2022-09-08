/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales_anidadas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class Condicionales_anidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        num=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 1 y 10000"));
        if(num>0 && num<10){
           JOptionPane.showMessageDialog(null, "Tu numero es unidad");
            
        }else{
            if(num>=10 && num<100 ){
                JOptionPane.showMessageDialog(null, "Tu numero es decena");
                
            }else{
                if(num>=100 && num<1000){
                    JOptionPane.showMessageDialog(null, "Tu numero es unidad de millar ");
                }
            }
        }
        
        
    }
    
}
