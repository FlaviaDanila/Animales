
package testanimales;

import Interfaces.Mascota;

/**
 *
 * @author Cele&Fla
 */

public class Perro extends Patas implements Mascota{

    private String nombre;
    
    public Perro() {
        super(4);
    }
    
    public Perro (String nombre) {
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
        @Override
    public void jugar() {
        System.out.println("El perro juega con pelotas");
    }
    
        @Override
    public void comer() {
        System.out.println("El perro come carne cruda y huesos");
    }
    
    
    
}
