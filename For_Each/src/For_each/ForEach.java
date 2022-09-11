package For_each;

public class ForEach {
    public static void main(String[] args) {
        String [] perros={"perro1","perro2","perro3","perro5","perro6"};

        /*
        for (int i = 0; i <perros.length ; i++) {
            System.out.println(perros[i]);

        }*/
        int i=1;
        for (String perro:perros) {
            System.out.println(i+perro);
            i++;
        }
    }
}
