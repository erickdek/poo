package poo_p2_lab2_jerarquia_productos;

/**
 *
 * @author erick
 */
public class Product extends ProductOff {
    public String nombre;
    public double precio;
    public String seccion;
    
    public Product(String n, double p){
         this.nombre = n;
         this.precio = p;
    };
    
    //Constructor para 
    public Product(String n, double p, String s){
         this.nombre = n;
         this.precio = p;
         this.seccion = s;
    };
    
    public Product(String n, double p, String s, long d){
         this.nombre = n;
         this.offDays = d;
         this.precio = p;
         this.seccion = s;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
     
     
}
