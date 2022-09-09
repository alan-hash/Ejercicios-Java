/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package do_while;

import java.util.Random;

/**
 *
 * @author LALO
 */
public class Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       /*
        int i=1;
       do{
           System.out.println("i: "+i);
           i++;
       }while(i<=10);
         */
       /*
       int i=10;
       do {
           System.out.println("i: "+i);
           i=i-1;
       }while(i>=1);
       */
       
       Random rand=new Random();
       int i= 1;
       int ale=rand.nextInt(5)+1;
       System.out.println("aleatorio= "+ale);
       
       do{
           System.out.println("i: "+i);
           i=i+1;
           
       }while(i<=ale);
       
    }
    
}
