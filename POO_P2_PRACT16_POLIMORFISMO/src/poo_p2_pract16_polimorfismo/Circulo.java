package poo_p2_pract16_polimorfismo;
import java.lang.Math;
/**
 *
 * @author erick
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI * radio;
    }
    
}
