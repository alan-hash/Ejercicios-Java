
package poo_vehiculo;

/**
 *
 * @author Windows
package poo_vehiculo;

 */
public class POO_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo coche1=new Vehiculo("vocho", "330","negro");
        Vehiculo coche2=new Vehiculo("tsuru", "Nissan","rojo");
        
        System.out.println(coche1.getMarca());
        System.out.println(coche2.getModelo());
        
        coche1.llave(193111);
        coche1.mando("");    
        coche1.acelerar(20);
    
        
   
        // TODO code application logic here
    }
    
}
