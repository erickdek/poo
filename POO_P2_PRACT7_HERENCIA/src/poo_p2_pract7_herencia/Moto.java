package poo_p2_pract7_herencia;

/**
 *
 * @author erick
 */
public class Moto extends Vehiculo {
    int tipoEncendido;

    public Moto(String numPlaca, int numRuedas, boolean encendido, String estado) {
        super(numPlaca, numRuedas, encendido, estado);
    }

    public void setTipoEncendido(int tipoEncendido) {
        //0 = parada, 1 = boton/llave
        this.tipoEncendido = tipoEncendido;
    }

    public int getTipoEncendido() {
        return tipoEncendido;
    }
    
    
}
