/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_case;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int selec;
        
        do{
        System.out.println("N1: Acceso\nN2: Configuracion\nN3: Ayuda\nN4: Salir");
        System.out.println("Seleccione una opcion: ");
        selec=leer.nextInt();
        
        switch(selec){
            case 1:
                System.out.println("Seleccionastes el acceso");
                break;
                
            case 2:
                System.out.println("Seleccionastes la config");
                break;
             
            case 3:
                System.out.println("Seleccionastes la ayuda");
                break;
                
            case 4:
                System.exit(0);
                
            
            default:
                System.out.println("No valido");
                break;    
               
        }
            System.out.println("******************************");
        }while(selec!=4);

        
    }
    
}
