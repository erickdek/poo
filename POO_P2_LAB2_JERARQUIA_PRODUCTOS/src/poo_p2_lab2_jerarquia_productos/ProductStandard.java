package poo_p2_lab2_jerarquia_productos;

/**
 *
 * @author erick
 */
public class ProductStandard extends Product {
    public String seccion;

    public ProductStandard(String nombre, double precio, String seccion) {
        super(nombre, precio);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    
}
