package Arreglo;

import javax.swing.*;

public class Arreglo {
    public static void main(String[] args) {
        String texto;
        float calificaciones[]=new float[4],suma=0,promedio=0;
        int semestre=0;
        do{
            texto=JOptionPane.showInputDialog("Ingresa la calificacion del parcial"+(semestre+1));
            calificaciones[semestre]=Float.parseFloat(texto);
            semestre++;
        }while(semestre<4);

        for(float calificacion:calificaciones){
            suma=suma+calificacion;
        }
        promedio=suma/semestre;
        JOptionPane.showMessageDialog(null,"Tu promedio es de: "+ promedio);
    }

}
