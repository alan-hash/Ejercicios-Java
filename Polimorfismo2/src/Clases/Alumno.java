/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Soporte
 */
public class Alumno extends Persona{
    
    private int materiasR;
    private int materiasA;
    
    public Alumno(String nombre, int edad, int id, String password,int materiasA,int materiasR) {
        super(nombre, edad, id, password);
        this.materiasA=materiasA;
        this.materiasR=materiasR;
    }

    public int getMateriasR() {
        return materiasR;
    }

    public int getMateriasA() {
        return materiasA;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    
    
     public String mostrarDatos() {
         
        if(this.materiasA==10){
             System.out.println("El alumno es Regular");
         }else{
             System.out.println("El alumno es Iregular");
         } 
        
        return "Nombre: "+this.nombre+ " Edad: "+this.edad+" Identificador: "+this.id+" Password: "+this.password 
                +" Numero de materias aprobadas: "+this.materiasA+" Numero de materias reprobadas: "+this.materiasR;
       
           
     }
 
  
}
