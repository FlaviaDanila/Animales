
package testanimales;

/**
 *
 * @author Yaki's
 */

public class Araña extends Patas {
    
    public Araña() {
     super(8);   
    }
    
    @Override
    public void comer() {
        System.out.println("La araña come insectos");
    }
    
}
