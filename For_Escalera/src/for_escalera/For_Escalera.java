/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_escalera;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class For_Escalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Tamono de la escalera:");
        int num=leer.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.println("");
        }
      
    }
    
}
