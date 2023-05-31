package test_estuding;

/**
 *
 * @author erick
 */
public class Notas {
    public double nota;
    public String nombre;
    private int cedula;

    public Notas(double nota, String nombre, int cedula) {
        this.nota = nota;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }
    
    //get - Obtener
    //set - establecer
    //put - actualizar
    //del - eliminar
}
