package poo_p2_evaluacion_correccion;

/**
 *
 * @author erick
 */
public class Auto extends Vehiculos {
    private int multas;
    private String transmision;
    public Auto(String placa, String marca, String color, int ruedas, int estado, String transmision, int multas){
        super(placa, marca, color, ruedas, estado);
        this.transmision = transmision;
        this.multas = multas;
    }
    
    //Show los datos
    @Override
    public void showData(){
        System.out.print("Info del Vechiculo:");
        System.out.println(
            "\nPlaca: " + this.getNumPlaca() +
            "\nColor: " + this.getColor() +
            "\nMarca: " + this.getMarca() +
            "\nTransmision: " + this.getTransmision() +
            "\nMultas: " + this.getMultas() +
            "\nRuedas: " + this.getNumRuedas()
            );
    }
    
    public int addMulta(){
        this.multas += 1;
        System.out.println("El auto recibio una multa...");
        return this.multas;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
}
