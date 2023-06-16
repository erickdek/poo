package poo_p2_prueba1_perimetro;

/**
 *
 * @author erick
 */
public class FiguraRectangulo extends Figura {
    public FiguraRectangulo (double lado, double base){
        this.lado = lado;
        this.base = base;
    }
    
    @Override
    public double Area(){
        double result = base * lado;
        return result;
    }
    
    @Override
    public double Perimetro(){
        double result = 2 * ( base + lado);
        return result;
    }
}
