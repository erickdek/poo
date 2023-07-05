package poo_p2_evaluacion_correccion;

/**
 *
 * @author erick
 */
public class Camion extends Vehiculos {
    private double carga;
    private String transmision;
    
    public Camion(String placa, String marca, String color, int ruedas, int estado, String transmision, double carga){
        super(placa, marca, color, ruedas, estado);
        this.transmision = transmision;
        this.carga = carga;
    }
    //Show los datos
    @Override
    public void showData(){
        System.out.print("Info del Vechiculo:");
        System.out.println(
            "\nPlaca: " + this.getNumPlaca() + "\nColor: " + this.getColor() +  "\nMarca: " + this.getMarca() + "\nTransmision: " + this.getTransmision() + "\nCarga: " + this.getCarga() + "\nRuedas: " + this.getNumRuedas()  );
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
}
