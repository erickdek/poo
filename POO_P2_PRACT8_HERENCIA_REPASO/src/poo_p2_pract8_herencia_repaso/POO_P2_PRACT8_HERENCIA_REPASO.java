package poo_p2_pract8_herencia_repaso;

/**
 *
 * @author erick
 */
public class POO_P2_PRACT8_HERENCIA_REPASO {
    public static void main(String[] args) {
        Auto car1 = new Auto("JKF455", 4, false, false);
        Moto moto1 = new Moto("KJF345", 2,false);
        
        moto1.OnOff();
        car1.OnOff();
        moto1.OnOff();
        car1.OnOffParabrisas();
        car1.showNumRuedas();
        moto1.showNumRuedas();
        moto1.showPlaca();
        car1.showPlaca();
    }
    
}
