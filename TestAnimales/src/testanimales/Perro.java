
package testanimales;

import Interfaces.Mascota;

/**
 *
 * @author Cele&Fla
 */

public class Perro extends Patas implements Mascota{

        @Override
    public void jugar() {
        System.out.println("El perro juega con pelotas");
    }
    
        @Override
    public void comer() {
        System.out.println("El perro come carne cruda y huesos");
    }
    
    
    
}
