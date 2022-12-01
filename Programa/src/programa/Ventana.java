/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author soporte
 */
public class Ventana extends JFrame{
  
    public Ventana(String title) throws HeadlessException, InterruptedException {
        super(title);
        //poner tamaño de ventanas
        Dimension d=new Dimension(500,500);
        this.setSize(d);
       //***************************** 
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);//para cerrar ventanas
       this.setLocation(3000, 300);//posicionar ventana 
       
      
    }
    
}
