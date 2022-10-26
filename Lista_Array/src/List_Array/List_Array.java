 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List_Array;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * @author soporte
 */
public class List_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String msj=leer.nextLine();
       
        listadinamica();
    }

    private static void Listanormal() {
       int Nelementos=Integer.parseInt((JOptionPane.showInputDialog("Ingresa el numero de elementos")));
       String lista[]=new String[Nelementos];
       
       
        for (int i = 0; i <Nelementos; i++) {
           lista[i]=new String();
           lista[i]=JOptionPane.showInputDialog("Ingresa el elemento "+(i+1)+" de la lista");
        }
        
        
        System.out.println("Resultados de la lisya normal");
        for (int i = 0; i < Nelementos; i++) {  
            System.out.println(lista[i]);
        }
       
    }

    private static void listadinamica() {
        Scanner leer=new Scanner(System.in);
        
        ArrayList <String> lista=new ArrayList<String>();
        char respuesta;
        int valor;
        
        do{
            System.out.println("ingresa el valor");
            valor=leer.nextInt();
            String valor2=String.valueOf(valor); 
            lista.add(valor2);
            System.out.println("Deseas seguir metiendo elementos  S/N");
            respuesta=leer.next().charAt(0);
            
        }while(respuesta=='s' || respuesta=='S');
        
        System.out.println("Resultados de la lista normal");
        for (int i = 0; i < lista.size(); i++) {  
            System.out.println(lista.get(i));
        }
      
        
    }
    
}
