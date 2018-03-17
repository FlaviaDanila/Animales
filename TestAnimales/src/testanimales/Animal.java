
package testanimales;

/**
 *
 * @author Yaki's
 */

public abstract class Animal {
    
    private int patas;
    
    public Animal() {
        
    }
    
    public Animal(int patas) {
        this.patas = patas;
    }
    
    public void comer() {
        
    }
    
    public int getPatas() {
     return this.patas;   
    }
    
    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    
    
}
