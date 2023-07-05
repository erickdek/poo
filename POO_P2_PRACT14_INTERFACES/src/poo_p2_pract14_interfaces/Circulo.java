package poo_p2_pract14_interfaces;
import java.lang.Math;
/**
 *
 * @author erick
 */
public class Circulo implements Figura, Dibujar, Rotar {
    double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    @Override
    public double calcArea() {
        double result = Math.PI * radio * radio;
        return result;
    }

    @Override
    public void dibujar() {
        System.out.println("Usted va a dibujar un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Usted va a rotar un circulo");
    }
    
}
