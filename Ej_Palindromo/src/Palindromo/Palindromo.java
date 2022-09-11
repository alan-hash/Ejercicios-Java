package Palindromo;

import javax.swing.*;

public class Palindromo {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe un Palindromo");
        int longitud= texto.length();
        char []letras=new char[longitud];
        char[]letrasInv=new char[longitud];
        int inverso=longitud;
        boolean igual=true;

        for (int i = 0; i <longitud ; i++) {
            letrasInv[i]=texto.toLowerCase().charAt(inverso-1);
            inverso--;
            letras[i]=texto.toLowerCase().charAt(i);
            if (letrasInv[i] != letras[i]) {
                igual=false;
                break;
            }
        }
        if (igual==false){
            System.out.println("El texto no es palindormo");
        }else{
            System.out.println("Si es un palindromo");
        }

    }
}
