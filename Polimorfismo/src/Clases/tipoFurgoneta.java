package Clases;
public class tipoFurgoneta extends Vehiculo {

    private int carga;

    public tipoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga=carga;
    }
    

    public String mostrarDatos() {
         return "Matricula: "+ this.matricula +" Marca: "+ this.marca+" Modelo: "+ this.modelo +" carga: "+this.carga ;
    }
}
