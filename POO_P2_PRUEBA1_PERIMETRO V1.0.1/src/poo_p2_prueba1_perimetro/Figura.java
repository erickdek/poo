package poo_p2_prueba1_perimetro;
import java.util.*;

/**
 *
 * @author erick
 */
public class Figura {
    public double lado = 0.0;
    public double lado2 = 0.0;
    public double altura = 0.0;
    public double base = 0.0;
    public double radio = 0.0;
    public int numLados = 0;
    public double apotema = 0.0;
    
    
    public double Area(){
        double result = 0.0;
        result = lado * lado;
        return result;
    }
    
    public double Perimetro(){
        double result = 0.0;
        result = lado + altura + base;
        return result;
    }
    
}
