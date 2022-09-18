package Constantes;

public class Persona {
    private int dinero;
    private final String name;

    public Persona(String name) {
        this.name = name;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getName() {
        return name;
    }
}
