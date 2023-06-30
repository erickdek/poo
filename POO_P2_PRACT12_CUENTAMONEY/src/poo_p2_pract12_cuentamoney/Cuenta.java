package poo_p2_pract12_cuentamoney;

/**
 *
 * @author erick
 */
public class Cuenta extends CuentaGestor {
    private String Nombre_persona;
    private String Apellido_persona;
    private long Cedula_persona;
    private double Saldo;
    
    public Cuenta(String nombre, String apellido){
        this.Nombre_persona = nombre;
        this.Apellido_persona = apellido;
        this.Saldo = 0.0;
    }
    
    public Cuenta(String nombre, String apellido, long cedula){
        this.Nombre_persona = nombre;
        this.Apellido_persona = apellido;
        this.Cedula_persona = cedula;
        this.Saldo = 0.0;
    }
    
    public Cuenta(String nombre, String apellido, long cedula, double saldo){
        this.Nombre_persona = nombre;
        this.Apellido_persona = apellido;
        this.Cedula_persona = cedula;
        this.Saldo = saldo;
    }
    
    //Mostrar los datos
    public void showAccount(){
        System.out.println(
            "Hola, " + this.Nombre_persona
            + "\n- Los datos de cuenta son:"
            + "\n- Sus nombres: " + this.getNombre_persona() + " " + this.getApellido_persona()
            + "\n- Su cedula es: " + this.getCedula_persona()
            + "\n- Su limite para transferencias es: " + this.getLimitTransfer()
            + "\n- Su saldo actual es: " + this.getSaldo()
        );
        if (this.getLimitTransfer() > 0){
            System.out.println(
            "Su limite para transferencias es: " + this.getLimitTransfer()
        );
        }
    }
    public void showSaldo(){
        System.out.println(
                "Su saldo actual es: US$" + this.getSaldo()
        );
    }

    public String getNombre_persona() {
        return Nombre_persona;
    }

    public String getApellido_persona() {
        return Apellido_persona;
    }

    public double getSaldo() {
        return Saldo;
    }

    public long getCedula_persona() {
        return Cedula_persona;
    }
    
    //SETTERS
    public void setNombre_persona(String Nombre_persona) {
        this.Nombre_persona = Nombre_persona;
    }

    public void setApellido_persona(String Apellido_persona) {
        this.Apellido_persona = Apellido_persona;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setCedula_persona(long Cedula_persona) {
        this.Cedula_persona = Cedula_persona;
    }
    
    
    public void newTransfer( double amount ){
        if(checkTransfer(this.Saldo, amount)){
            this.Saldo = this.Saldo - amount;
            System.out.println("Su transferencia de : US$" + amount + ", fue realizada con exito");
            this.showSaldo();
        } else {
            System.out.println("Su cuenta no permite realizar esta transferencia.");
        }
    }
    
    public void newRecarga(double amount ){
        this.Saldo += amount;
        this.showSaldo();
    }
}
