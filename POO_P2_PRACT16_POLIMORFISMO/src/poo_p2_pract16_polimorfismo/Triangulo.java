package poo_p2_pract16_polimorfismo;

/**
 *
 * @author erick
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double superficie() {
        double result = (this.base*this.altura)/ 2;
        return result;
    }
    
}
