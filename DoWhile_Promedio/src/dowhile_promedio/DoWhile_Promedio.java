
package dowhile_promedio;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author LALO
 */
public class DoWhile_Promedio {

 
    public static void main(String[] args) {
      int contador=0;
      float calificacion=0, suma=0, promedio; 
      String texto;
      do{
          texto= JOptionPane.showInputDialog("Ingresa la calificacion del semestre "+ (contador+1));
          
          if(texto.equals("")){
           JOptionPane.showMessageDialog(null, "Ingresa una calificacion");
          }
          else {
              if(texto!=null){
                  calificacion=Float.parseFloat(texto);
                  suma=suma+calificacion;
                  contador ++;
              }
          }
          
        } while(texto!=null );

      if(contador>0){
          promedio=suma/contador;
          JOptionPane.showMessageDialog(null,"Tu promedio es: "+promedio);
      }else{
          JOptionPane.showMessageDialog(null, "Ingresa una calificacion");
      }
    }
}
    

