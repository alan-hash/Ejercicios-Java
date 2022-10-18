/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author soporte
 */
public class Persona {
    String nombre;
    int edad;
    int id;
    String password;

    public Persona(String nombre, int edad, int id, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.password = password;
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
        return "Nombre: "+this.nombre+ " Edad: "+this.edad+" Identificador: "+this.id+" Password: "+this.password;
     }
      
    
}
