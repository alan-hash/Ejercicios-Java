/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerorandom_ciclo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class NumeroRandom_Ciclo {


    public static void main(String[] args) {
        Random random=new Random();
        int aleatorio=random.nextInt(5)+1;
      //int aleatorio=50;
        System.out.println("el numero random es: "+aleatorio);
        int num= Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar un numero entre 1 y 5 que estoy pensando") );  
        while(num!= aleatorio){
            System.out.println("");
            aleatorio=random.nextInt(5)+1;
            System.out.println("el numero random es: "+aleatorio);
            num= Integer.parseInt(JOptionPane.showInputDialog("Intenatlo otra vez"));  
            if(num==0){
                break; 
            }
        }  
        if(num!=0){
            JOptionPane.showMessageDialog(null, "Felicidades me has ganado");    
        }
        else{
              JOptionPane.showMessageDialog(null, "El numero en el que pennsab era "+aleatorio+ " Te gane");
         }
          
    }
    
}
