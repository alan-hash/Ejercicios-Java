package Clases;
import Clases.Vehiculo;

public class tipoDeportivo extends Vehiculo {

    private int cilindros;

    public tipoDeportivo(String matricula, String marca, String modelo,int cilindros) {
        super(matricula, marca, modelo);
        this.cilindros=cilindros;
        
    }

    public String mostrarDatos() {
         return "Matricula: "+ this.matricula +" Marca: "+ this.marca+" Modelo: "+ this.modelo+" cilindros: "+this.cilindros ;
        
    }
}
