package testanimales;

import Interfaces.Mascota;

/**
 *
 * @author Yaki's
 */

public class Pez extends Animal implements Mascota {

    private String nombre;

    public Pez() {

    }

    public Pez(String nombre) {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public void comer() {
        System.out.println("El pez come algas");
    }

    public void jugar() {
        System.out.println("El pez no juega");
    }

}
