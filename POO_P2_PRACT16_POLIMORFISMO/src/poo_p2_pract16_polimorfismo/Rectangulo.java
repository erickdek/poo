package poo_p2_pract16_polimorfismo;

/**
 *
 * @author erick
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double superficie() {
        double result = (this.base*this.altura);
        return result;
    }
    
}
