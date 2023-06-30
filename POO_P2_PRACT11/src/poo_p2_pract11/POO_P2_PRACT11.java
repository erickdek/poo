package poo_p2_pract11;
import animal.Animal;
/**
 *
 * @author erick
 */
public class POO_P2_PRACT11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal1 = new Gato();
        Animal animal2 = new Persona();
        
        animal1.comer();
        animal2.comer();
    }
    
}
