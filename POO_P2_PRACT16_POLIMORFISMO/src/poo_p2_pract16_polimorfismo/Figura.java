package poo_p2_pract16_polimorfismo;

/**
 *
 * @author erick
 */
public abstract class Figura {
    private String color;
    
    public Figura(String color){
        super();
        this.color = color;
    }
    
    public abstract double superficie();
    
    public String getColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
