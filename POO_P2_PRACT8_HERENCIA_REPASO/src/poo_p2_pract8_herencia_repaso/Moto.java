package poo_p2_pract8_herencia_repaso;

/**
 *
 * @author erick
 */
public class Moto extends Vehiculo {
    public Moto (String numPlaca, int numRuedas, boolean encendido){
        super(numPlaca, numRuedas, encendido);
        System.out.println("Se creo la moto");
    }
    
    @Override
    public void OnOff() {
        if (this.boolEncendido) {
            this.boolEncendido = false;
            System.out.println("Se apago la moto");
        } else {
            this.boolEncendido = true;
            System.out.println("Se encendio la moto");
        }
    }
}
