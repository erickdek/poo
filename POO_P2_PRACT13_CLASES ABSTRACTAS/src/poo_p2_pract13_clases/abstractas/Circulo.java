package poo_p2_pract13_clases.abstractas;
import java.lang.Math;
/**
 *
 * @author erick
 */
public class Circulo extends Figura {
    double radio;
    public Circulo(double x, double y, double radio){
        super(x,y);
        this.radio = radio;
    }
    
    @Override
    public double calcArea(){
        double result = Math.PI * radio * radio;
        return result;
    }
}
