package Claes;

public abstract class Terreno {

    protected int numeroLados;

    public Terreno(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Terreno{" + "numeroLados=" + numeroLados + '}';
    }
    
    
    public double area() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
