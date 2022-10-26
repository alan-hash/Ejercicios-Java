package Animal;


import Animal.Animal;

public class Humano extends Animal {

    @Override
    public void Comer() {
        
         System.out.println("Soy un humano y como");
    }

    @Override
    public void Correr() {
         System.out.println("Soy un humano y corro con zapatos");
    }
}
