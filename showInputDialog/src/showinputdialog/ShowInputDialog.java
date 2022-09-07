/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showinputdialog;

import javax.swing.JOptionPane;


public class ShowInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String cadena=JOptionPane.showInputDialog("Mete Una cadena");
        JOptionPane.showMessageDialog(null,"Esta es tu cadena: "+cadena);
        
       
        char caracter=cadena.charAt(0);
        JOptionPane.showMessageDialog(null,"El primer caracter de la cadena corresponde a :"+caracter);
        
        
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Mete un Numero entero"));
        //JOptionPane.showMessageDialog(null,"Tu numero es: "+num1);
        
        float num2=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el Numero2 que sea flotante:"));
        //JOptionPane.showMessageDialog(null, "Tu numero es: "+num2);
        
       
        float suma=num1+num2;
        JOptionPane.showMessageDialog(null, "El resultado de tu suma es: "+suma);
        
   
      
    }
    
}
