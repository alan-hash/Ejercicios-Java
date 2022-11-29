 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcion_java;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author soporte
 */
public class Exepcion_Java {

    /**
     * @param args the command line arguments
     * 
     */
    
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
           //EXPCIONES VERIFICADAS
           /*
        BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\soporte\\Documents\\Documentos\\archivo.txt"));
        String linea;
        while((linea=bf.readLine())!=null   ){
            System.out.println(linea); 
        }
        */
        
        //Exepciones No Verificadas
        int a,b,resultado;
        a=10;b=0;
        resultado=a/b;
        System.out.println(resultado);
        
        
    }
    
}
