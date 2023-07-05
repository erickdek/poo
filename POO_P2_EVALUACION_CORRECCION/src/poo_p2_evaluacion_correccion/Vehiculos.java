package poo_p2_evaluacion_correccion;

/**
 *
 * @author erick
 */
public class Vehiculos {
    private boolean parabrisasOn;
    private String numPlaca;
    public String marca;
    public String color;
    public int numRuedas;
    private int estado; //0 Nuevo, 1 Usado, 2 Dañado
    
    public Vehiculos(String placa, String marca, String color, int ruedas){
        this.estado = 0;
        this.numPlaca = placa;
        this.marca = marca;
        this.numRuedas = ruedas;
        this.color = color;
        this.parabrisasOn = false;
    }
    public Vehiculos(String placa, String marca, String color, int ruedas, int estado){
        this.estado = estado;
        this.numPlaca = placa;
        this.marca = marca;
        this.numRuedas = ruedas;
        this.color = color;
        this.parabrisasOn = false;
    }
    
    //Show los datos
    public void showData(){
        System.out.print("Info del Vechiculo:");
        System.out.println(
            "\nPlaca: " + this.getNumPlaca() +
            "\nColor: " + this.getColor() +
            "\nMarca: " + this.getMarca() +
            "\nRuedas: " + this.getNumRuedas()
            );
    }
    
    //Parabrisas apagar o encender
    public boolean ParabrisasOnOff(){
        if (this.isParabrisasOn()){
            //Si los parabrisas estan encendidos apagarlos
            this.setParabrisasOn(false);
            System.out.println("Los parabrisas se apagaron.");
        } else {
            //De lo contrario encenderlos
            this.setParabrisasOn(true);
            System.out.println("Los parabrisas se encendieron.");
        }
        
        return this.isParabrisasOn();
    }

    public boolean isParabrisasOn() {
        return parabrisasOn;
    }

    public void setParabrisasOn(boolean parabrisasOn) {
        this.parabrisasOn = parabrisasOn;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
