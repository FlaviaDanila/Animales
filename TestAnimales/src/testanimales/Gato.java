
package testanimales;

/**
 *
 * @author Yaki's
 */

public class Gato extends Patas implements Mascota{
    
    private String nombre;
    
    public Gato() {
       super(4); 
    }
    
    public Gato(String nombre) {
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public void comer() {
        System.out.println("El gato come ratones y palomas");
    }
    
    public void jugar() {
        System.out.println("El gato juega con plumas y pelotas");
    }
    
}
