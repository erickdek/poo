package poo_p2_pract13_clases.abstractas;

/**
 *
 * @author erick
 */
public abstract class Figura {
    double x;
    double y;
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //Calcular Area
    public abstract double calcArea();
    
}
