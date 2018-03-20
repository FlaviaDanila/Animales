
package testanimales;

/**
 *
 * @author Cele&Fla
 */

public abstract class Patas extends Animal{
    
    private int patas;
    
    public Patas() {
        
    }
    
    public Patas(int patas) {
        this.patas = patas;
    }
    
    public void setPatas(int patas) {
        this.patas = patas;
    }
        
     public int getPatas() {
     return this.patas;   
    }
    
     
    
}
