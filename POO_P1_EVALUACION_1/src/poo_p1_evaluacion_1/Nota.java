package poo_p1_evaluacion_1;
/**
 *
 * @author erick
 */
public class Nota {
    private String nombre;
    private double calificacion;
    
    //Constructor - Establecer valores al objeto.
    public Nota(String nombre, double calificacion) { 
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    
    //Metodo - Obtener Nombre
    public String getNombre() {
        return nombre;
    }

    //Metodo - Obtener Calificacion
    public double getCalificacion() {
        return calificacion;
    }
}
