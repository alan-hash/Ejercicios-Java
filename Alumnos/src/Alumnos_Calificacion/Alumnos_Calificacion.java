/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumnos_Calificacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class Alumnos_Calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        
        int cantAlum=Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL NUMERO DE ALUMNOS"));
        Alumnos a[]=new Alumnos[cantAlum];
        
        for (int i = 0; i <cantAlum; i++) {
           a[i]=new Alumnos(JOptionPane.showInputDialog("Ingresa el nombre del Alumno"+(i+1)),JOptionPane.showInputDialog("Ingresa el Aula").charAt(0));
           a[i].setCalificacion(Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificacion del alumno")));
        }
        
        float suma=0;
        float promedio=0;
        int cantidadAula=0;
        char aula=JOptionPane.showInputDialog("INGRESA LA AULA EN LA QUE DESEAS OBTENER LAS CALIFICACIONES").charAt(0);
        
        for (int i = 0; i <cantAlum; i++) {
        if(a[i].getAula()==aula){
            suma=suma+a[i].getCalificacion();
            cantidadAula++;  
            }
        }
        promedio=suma/cantidadAula;
        JOptionPane.showMessageDialog(null, "El promedio general corrsponde a: "+promedio);
       
        
    }
    
}
