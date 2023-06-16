package poo_p2_pract8_herencia_repaso;

/**
 *
 * @author erick
 */
public class Auto extends Vehiculo {
    boolean parabrisas;
    
    public Auto (String numPlaca, int numRuedas, boolean encendido, boolean parabrisas){
        super(numPlaca, numRuedas, encendido);
        this.parabrisas = parabrisas;
    }
    
    public void OnOffParabrisas(){
        if (this.parabrisas) {
            this.parabrisas = false;
            System.out.println("Se apagaron los parabrisas.");
        } else {
            this.parabrisas = true;
            System.out.println("Se encendieron los parabrisas.");
        }
    }
}
