
package testanimales;

/**
 *
 * @author Yaki's
 */

public class Gato extends Patas implements Mascota{
    
    private String nombre;
    
    public Gato() {
        
    }
    
    public Gato(String nombre) {
        
    }
    
    @Override
    public void comer() {
        System.out.println("El gato come ratones y palomas");
    }
       
}
