package arreglos;

import javax.swing.*;

public class Arreglos {
    public static void main(String[] args) {
        String texto= JOptionPane.showInputDialog("Escribe un texto");
        int longitud=texto.length(); //longitud de un texto
        char[]caracter=new char[longitud];
        int inverso=longitud;

        for (int i = 0; i <longitud ; i++) {
            caracter[i]= texto.charAt(inverso-1);
            inverso--;
        }
        System.out.println("El inverso de tu cadena es");
        System.out.println(caracter);

        System.out.println("Las letras de tu cadena son");

        for (int i = 0; i <longitud ; i++) {
            System.out.println("Tu letra numero "+i+" es: "+caracter[i]);
        }
    }
}
