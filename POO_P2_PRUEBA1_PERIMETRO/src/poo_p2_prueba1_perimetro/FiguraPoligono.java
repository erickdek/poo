package poo_p2_prueba1_perimetro;

/**
 *
 * @author erick
 */
public class FiguraPoligono extends Figura {
    public FiguraPoligono (double base, double apotema, int numLados){
        this.base = base;
        this.apotema = apotema;
        this.numLados = numLados;
    }
    
    @Override
    public double Area(){
        double result = ( this.Perimetro() * apotema ) / 2;
        return result;
    }
    
    @Override
    public double Perimetro(){
        double result = base * numLados;
        return result;
    }
}
