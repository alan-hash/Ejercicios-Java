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
public class Profesor extends Persona{
    
        
   private int Nmaterias;

    public Profesor(String nombre, int edad, int id, String password,int Nmaterias) {
        super(nombre, edad, id, password);
        this.Nmaterias=Nmaterias;
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

    public int getNmaterias() {
        return Nmaterias;
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: "+this.nombre+ " Edad: "+this.edad+" Identificador: "+this.id+" Password: "+this.password
                +" Numero de materias impartidas: "+this.Nmaterias;
    }

  
  
    
    
    
    
    
}
