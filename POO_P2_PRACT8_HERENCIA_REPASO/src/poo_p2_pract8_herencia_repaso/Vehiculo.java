package poo_p2_pract8_herencia_repaso;

/**
 *
 * @author erick
 */
public class Vehiculo {
    public String numPlaca;
    public int numRuedas;
    public boolean boolEncendido;
    
    public Vehiculo (String numPlaca, int numRuedas, boolean encendido){
        this.numPlaca = numPlaca;
        this.boolEncendido = encendido;
        this.numRuedas = numRuedas;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void OnOff() {
        if (this.boolEncendido) {
            this.boolEncendido = false;
            System.out.println("Se apago el vehiculo");
        } else {
            this.boolEncendido = true;
            System.out.println("Se encendio el vehiculo");
        }
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setBoolEncendido(boolean boolEncendido) {
        this.boolEncendido = boolEncendido;
    }
    
    public void showNumRuedas(){
        System.out.println("El numero de ruedas son: " + this.numRuedas);
    }
    
    public void showPlaca(){
        System.out.println("La placa es: " + this.numPlaca);
    }
}
