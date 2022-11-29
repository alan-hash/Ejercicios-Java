/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author soporte
 */
public class Ventana extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v=new Ventana();
        v.setVisible(true);
        
    }

    public Ventana() throws HeadlessException {
        
        Dimension d=new Dimension(500, 500);
        this.setSize(d);
    }
    
}
