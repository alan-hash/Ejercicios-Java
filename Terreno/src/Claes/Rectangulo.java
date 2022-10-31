package Claes;

public class Rectangulo extends Terreno {

    private double lado1;

    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Rectangulo{"+"Numero de lados="+super.toString()+"lado1=" + this.lado1 + ", lado2=" + this.lado2 + '}';
    }
    
 
    public double area() {
        return this.lado1*this.lado2;
    }
}
