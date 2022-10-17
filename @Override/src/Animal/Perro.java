package Animal;


import Animal.Animal;

public class Perro extends Animal {

    @Override
    public void Comer() {
         System.out.println("Soy un perro y como");
    }

    @Override
    public void Correr() {
         System.out.println("Soy un perro y corro en 4 patas");
    }
}
