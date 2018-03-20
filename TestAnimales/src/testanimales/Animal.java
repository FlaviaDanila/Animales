
package testanimales;

import Interfaces.Comparables;
import Interfaces.Sonidos;

/**
 *
 * @author Yaki's
 */

public abstract class Animal implements Sonidos, Comparables {
    
    //private int patas;
    private String sonido;
    
    public Animal() {
        
    }
    
    public void comer() {
        
    }
    
        @Override
    public void emitirSonido() {
        
    }

        @Override
    public String getSonido() {
        return this.sonido;
    }

        @Override
    public void setSonido(String sonido) {
        
    }

/* Este contructor y sus get&set los pasé a Class Patas
    public Animal(int patas) {
        this.patas = patas;
    }
    
   public int getPatas() {
     return this.patas;   
    }
    
    public void setPatas(int patas) {
        this.patas = patas;
    }
*/
    
}
