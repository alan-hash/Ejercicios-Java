/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

import Animal.Animal;
import Animal.Humano;
import Animal.Pajaro;

/**
 *
 * @author soporte
 */
public class Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal an=new Animal();
        an.Comer();
        an.Correr();
        
        Humano hm=new Humano();
        hm.Comer();
        hm.Correr();
      
        Pajaro pj=new Pajaro();
        pj.Vuela();
    }
    
}
