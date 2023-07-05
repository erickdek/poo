package poo_p2_pract14_interfaces;

/**
 *
 * @author erick
 */
public class Cuadrado implements Figura, Dibujar {
    double lado;
    
    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        double result = lado * lado;
        return result;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Usted va a dibujar un cuadrado");
    }
    
}
