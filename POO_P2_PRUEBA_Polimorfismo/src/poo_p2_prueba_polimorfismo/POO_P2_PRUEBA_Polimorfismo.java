package poo_p2_prueba_polimorfismo;

/**
 *
 * @author erick
 */
public class POO_P2_PRUEBA_Polimorfismo {
    public static void main(String[] args) {
        // Crear objetos de tipo Animal
        Animal perro = new AnimalPerro();
        Animal gato = new AnimalGato();

        // Llamar al método hacerSonido() en los objetos de tipo Animal
        perro.hacerSonido(); // Salida: 'guau guau'.
        gato.hacerSonido(); // Salida: 'miau miau'.
    }
}
