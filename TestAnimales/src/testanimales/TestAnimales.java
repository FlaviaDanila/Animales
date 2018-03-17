package testanimales;

/**
 *
 * @author Yaki's
 */

public class TestAnimales {

    public static void mostrarQueCome(Animal a) {
        a.comer();
    }
    
    public static void miMascota(Mascota m) {
        m.getNombre();
    }

    public static void main(String[] args) {

        //Crear instancias de cada animal
        Araña spider = new Araña();
        Gato cat = new Gato();
        Pez fish = new Pez();

        spider.comer();
        cat.comer();
        fish.comer();
        
        cat.jugar();
        fish.jugar();
        
        cat.getNombre();
        fish.getNombre();
    }

}
