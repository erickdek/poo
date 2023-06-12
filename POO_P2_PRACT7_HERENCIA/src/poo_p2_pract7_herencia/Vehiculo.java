package poo_p2_pract7_herencia;

public class Vehiculo {
    public String numPlaca;
    public int numRuedas;
    public boolean encendido;
    public String estado;
    
    public Vehiculo(String numPlaca, int numRuedas, boolean encendido, String estado){
        this.encendido = encendido;
        this.estado= estado;
        this.numPlaca = numPlaca;
        this.numRuedas = numRuedas;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setEncendido() {
        this.encendido = true;
        this.estado = "Vehiculo encendido";
    }
    
    public void setApagado() {
        this.encendido = false;
        this.estado = "Vehiculo apagado";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
