package poo_p2_prueba1_perimetro;

/**
 *
 * @author erick
 */
public class FiguraCuadrado extends Figura {
    public FiguraCuadrado (double lado){
        this.lado = lado;
    }
    
    @Override
    public double Area(){
        double result = lado * lado;
        return result;
    }
    
    @Override
    public double Perimetro(){
        double result = 4 * lado;
        return result;
    }
}
