  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional_if_else;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class Condicional_If_Else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numUser,numSis,num1;
        
        numSis=(int)(Math.random()*10);
        System.out.println("El numero del sistema es: "+numSis);
        
        System.out.println("Ingresa el numero "+numSis);
        numUser=leer.nextInt();
        
        if(numUser==numSis){
            System.out.println("Tu numero es igual");
  
            
        }if(numUser < numSis){
            System.out.println("El numero no es igual y es menor");   
        }
        
        if(numUser > numSis){
            System.out.println("El numero no es igual y es mayor");
        } 
        System.out.println("");
        System.out.println("Ingresa un numero mayor o igual al del sistema");
        num1=leer.nextInt();
        
        
        if (num1==numSis || num1>numSis){
            System.out.println("La respuesta es correcta");
        }else{
            System.out.println("La respuesta es incorrecta");
        }
        
    }
    
}
