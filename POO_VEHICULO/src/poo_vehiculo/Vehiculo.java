/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_vehiculo;

/**
 *
 * @author Windows
 */
public class Vehiculo {
    
    String marca;
    String modelo;
    String color;
    private boolean llave=false;
   

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    private void enciende(){       
        System.out.println("Auto encendiendo");
    }
      
    public void llave(int clave){
        if(clave==193111){
             llave=true;
            System.out.println("el auto a encendido correctamente");
            
        }else{
            
            System.out.println("tu no eres el propietario");
            
        }
        
    }
    
    
      
    public void mando(String accion){
        if(llave==true){
           enciende();
        }
        
    }
    
    
    public void acelerar(int kilometro){
        System.out.println("el automovil "+this.marca+" esta acelerando "+kilometro+" por hora");
        
   }
    
    public void frena(){
        System.out.println("el automovil esta frenando");
    }

    public String getMarca() {
        //System.out.println(this.marca);
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
    
    
    
}
