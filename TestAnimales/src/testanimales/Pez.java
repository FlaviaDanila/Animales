
package testanimales;

/**
 *
 * @author Yaki's
 */

public class Pez extends Animal implements Mascota{
   
    private String nombre;
    
    public Pez() {
        
    }
    
    public Pez(String nombre) {
        
    }
    
    @Override
    public void comer() {
        System.out.println("El pez come algas");
    }
    
}
