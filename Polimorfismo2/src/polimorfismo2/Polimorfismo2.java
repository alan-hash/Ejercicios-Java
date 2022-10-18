/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

import Clases.Alumno;
import Clases.Persona;
import Clases.Profesor;

/**
 *
 * @author soporte
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("hola");
        
        Persona people[]=new Persona[2];
        
        people[0]=new Alumno("Alan", 20,19311,"123456",8,2);
        people[1]=new Profesor("Alfredo", 30, 19234, "12345677", 4);
        
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].mostrarDatos());
        }
        
       
    }
    
}
