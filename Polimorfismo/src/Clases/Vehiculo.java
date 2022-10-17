package Clases;

public class Vehiculo {

    protected String matricula;

    protected String marca;

    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

       public String mostrarDatos() { 
        return "Matricula: "+ this.matricula +" Marca: "+ this.marca+" Modelo: "+ this.modelo ;
       
    }
}
