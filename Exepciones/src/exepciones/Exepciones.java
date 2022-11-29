/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soporte
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado"+e);
        }catch(IOException e){
            System.out.println("No se puede acceder al Archivo"+e);
        }

        catch (Exception e){
            System.out.println("ERROR "+e);
        }
        finally{
            System.out.println("Yo me ejucuto si o si");
        }
*/      try{
        Integer num=null;
        System.out.println(num.toString());
        }catch(NullPointerException e){
            System.out.println("Debes inicializar tu Objeto");
        }


        
        
    }
    //deja pasar el error ppara ejecutar la siguiente funcion 
    public static void leerArchivo() throws FileNotFoundException, IOException{
        BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\soporte\\Documents\\Documentos\\archivo.txt"));
        String linea;
        while((linea=bf.readLine())!=null   ){
            System.out.println(linea); 
        }
        
        
    }
    
}
