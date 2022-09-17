package com.company;

public class Vehiculo {
    String marca;
    String modelo;
    String sku;//identificador

    public Vehiculo(String sku) {
        this.sku = sku;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }



    public void acelerar(){
        if(this.marca !=null && this.modelo !=null ){
            System.out.println("El coche "+this.marca+" perteneciente al año "+this.modelo+" " +
                    "esta acelerando");

        }else  if(this.sku!=null){
            System.out.println("El coche con el SKU="+sku+" esta acelerando");
        }

    }


    public void acelerar(int km){
        if(this.marca !=null && this.modelo !=null ){
            System.out.println("El coche "+this.marca+" perteneciente al año "+this.modelo+" " +
                    "esta acelerando a una velocidad de "
                    +km);

        }else  if(this.sku!=null){
            System.out.println("El coche con el SKU="+sku+" esta acelerando a una " +
                    "velocida de "+ km+" kilometros por hora");
        }

    }




}
