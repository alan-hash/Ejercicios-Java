/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import Clases.Vehiculo;
import Clases.tipoDeportivo;
import Clases.tipoFurgoneta;
import Clases.tipoTurismo;
import java.util.Scanner;



/**
 *
 * @author soporte
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       Vehiculo v[]=new Vehiculo[4];
        v[0]=new Vehiculo("AAAA", "Carro", "2001");
        v[1]=new tipoDeportivo("BB", "Nissan", "2004", 10);
        v[2]=new tipoTurismo("ccc", "VMW", "2001", 8);
        v[3]=new tipoFurgoneta("ccc", "cc", "2014", 1000);
        
        
        for (int i = 0; i <v.length; i++) {
            System.out.println(v[i].mostrarDatos());
        }
       
       
    }
    
}
