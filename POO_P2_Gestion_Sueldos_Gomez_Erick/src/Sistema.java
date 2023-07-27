import java.util.*;

public class Sistema {
	private double sueldo = 400;
	private String moneda = "$USD";
	
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void putSueldo(Scanner sc) {
		try {
			System.out.println("El sueldo anterior fue de: " + this.moneda + this.sueldo);
			System.out.println("Ingrese el nuevo Sueldo Base: ");
			this.sueldo = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	public void putMoneda(Scanner sc) {
		try {
			System.out.println("La moneda es: " + this.moneda);
			System.out.println("Ingrese la nueva moneda ej: $USD o S/ o $MXN: ");
			this.moneda = sc.nextLine();
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
