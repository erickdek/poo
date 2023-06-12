package poo_p2_pract8_persona;

/**
 *
 * @author erick
 */
public class Deportista extends Persona {
    String deporte;
    public Deportista(String nombre, int edad, String genero, long cedula, String deporte){
        super(nombre, edad, genero, cedula);
        this.deporte = deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }
    
    
}
