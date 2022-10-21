package Clases;

/**
 *
 * @author Soporte
 */
public class Vehiculo {

    /**
     *
     */
    protected String matricula;

    /**
     *
     */
    protected String marca;

    /**
     *
     */
    protected String modelo;

    /**
     *
     * @param matricula
     * @param marca
     * @param modelo
     */
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @return
     */
    public String mostrarDatos() { 
        return "Matricula: "+ this.matricula +" Marca: "+ this.marca+" Modelo: "+ this.modelo ;
       
    }
}
