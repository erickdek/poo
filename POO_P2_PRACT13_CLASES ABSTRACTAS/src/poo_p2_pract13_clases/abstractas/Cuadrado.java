package poo_p2_pract13_clases.abstractas;

/**
 *
 * @author erick
 */
public class Cuadrado extends Figura {
    double lado;
    public Cuadrado(double x, double y, double lado){
        super(x,y);
        this.lado = lado;
    }
    
    @Override
    public double calcArea(){
        double result = lado * lado;
        return result;
    }
}
