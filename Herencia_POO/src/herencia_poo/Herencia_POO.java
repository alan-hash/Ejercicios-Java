/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_poo;


import herencia_poo.Estudiante;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class Herencia_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        float suma=0;
        
        System.out.println("Ingrese la matricula del Estudiante:");
        String matri=leer.nextLine();
        
        System.out.println("Ingrese el nombre del Estudiante:");
        String nombre=leer.nextLine();
        
        System.out.println("Ingrese el Apellido del Estudiante:");
        String Apellido=leer.nextLine();
        
        System.out.println("Ingrese la edad del Estudiante:");
        int edad=leer.nextInt();
      
        System.out.println("*************************************************");
        System.out.println("Ingrese el Numero de materias");
        int Nmaterias=leer.nextInt();
        
        for (int i = 0; i <Nmaterias ; i++) {
            System.out.println("Ingrese la calificacion de la materia "+(i+1));
            float cali=leer.nextFloat();
             suma=suma+cali;
        }
        float promedio=suma/Nmaterias;
        
        Estudiante estudi=new Estudiante(nombre, Apellido, edad, matri, promedio);
        System.out.println("*************************************************");
        System.out.println("DATOS DEL ESTUDIANTE:");
        estudi.MuestraName();
        estudi.MuestraApellido();
        estudi.MuestraEdad();
        JOptionPane.showMessageDialog(null,"El Promedio de "+ estudi.getNombre()+" corresponde a: "+ promedio);
        
        
        
        
        
        
        
    }
    
}

