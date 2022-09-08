/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase_string;

import java.util.Scanner;

/**
 *
 * @author LALO
 */
public class SwitchCase_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String selec;
     
        System.out.println("acceso\nconfiguracion\nayuda\nsalir");
        System.out.println("Seleccione una opcion: ");
        selec=leer.nextLine();
        selec=selec.toLowerCase();
        
        
      
        switch(selec){
            case "acceso":
                System.out.println("Seleccionastes el acceso");
                break;
                
            case "configuracion":
                System.out.println("Seleccionastes la config");
                break;
             
            case "ayuda":
                System.out.println("Seleccionastes la ayuda");
                break;
                
            case "salir":
                System.exit(0);
                
            
            default:
                System.out.println("No valido");
                break;    
               
        }
        
        /*
        System.out.println("Saludame por favor");
        String resp=leer.nextLine();
        resp=resp.toLowerCase();
        
        if(resp.equals("hola")==true){
            System.out.println("Como estas? ");
            
        }else{
            System.out.println("No te entiendo");
        }
        */
    }
       
    }
    

