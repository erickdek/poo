package poo_p2_prueba1_perimetro;

/**
 *
 * @author erick
 */
public class FiguraTriangulo extends Figura {
    public FiguraTriangulo (double lado, double base, double altura){
        this.lado = lado; //A
        this.base = base; //B
        this.lado2 = Math.sqrt( Math.pow(lado, 2) + Math.pow(base, 2) ); //C
        this.altura = altura; 
    }
    
    @Override
    public double Area(){
        double result = ( base * altura )/2;
        return result;
    }
    
    @Override
    public double Perimetro(){
        double result = lado + lado2 + base;
        return result;
    }
}
