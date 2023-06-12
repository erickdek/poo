package poo_p2_pract7_herencia;

/**
 *
 * @author erick
 */
public class Auto extends Vehiculo {
    boolean parabrisas;

    public Auto(String numPlaca, int numRuedas, boolean encendido, String estado) {
        super(numPlaca, numRuedas, encendido, estado);
    }
    
    public void parabrisas(){
        if (this.parabrisas) this.parabrisas = false;
        else {this.parabrisas = false;};
    }

    public boolean isParabrisas() {
        return parabrisas;
    }
}
