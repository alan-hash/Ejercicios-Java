package Clases;

public class tipoTurismo extends Vehiculo {

    private int numeroPuertas;

    public tipoTurismo(String matricula, String marca, String modelo,int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas=numeroPuertas;
    }

    public String mostrarDatos() {
         return "Matricula: "+ this.matricula +" Marca: "+ this.marca+" Modelo: "+ this.modelo+ " Numero de puertas: " +this.numeroPuertas;
         
    }
}
