import java.util.*;

abstract class Personal {
	private String nombre;
	private String apellidos;
	private int edad;
	
	List<Bono> Bonos = new ArrayList();;
	
	public Personal(String nom, String ape, int edad){
		this.apellidos = ape;
		this.edad = edad;
		this.nombre = nom;
	}
	//Obtenemos el Nombre + Apellido
	abstract String getNomApe();
	
	//Mostramos info del usuario
	public void showInfo(String moneda, double sueldoB) {
		System.out.println("Nombre: " + this.getNomApe()
				+ "\nEdad: " + this.getEdad()
				+ "\nBonos: " + this.calcBono(sueldoB));
		//Mostramos el total del sueldo
		this.showSueldo(moneda, sueldoB);
		//Mostrar la lista de bonos
		this.showBono(moneda);
		System.out.println("================\n");
	}
	
	//Calculamos el bono
	public double calcBono(double sueldB) {
		double total = 0.0;
		double auxope = 0.0;
		try {
			for (Bono bono : Bonos) {
				switch (bono.getOpe()) {
				case 1:
					total += bono.getAmount();
					break;
				case 2:
					total -= bono.getAmount();
					break;
				case 3:
					total += sueldB + (sueldB * ( bono.getAmount() / 100 ));
					break;
				default:
					break;
				}
			}
			
			return total;
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
		return 0.0;
	}
	
	//Mostrar la lista de bonos
	public void showBono(String moneda) {
		try {
			int i = 1;
			for (Bono bono : Bonos) {
				switch (bono.getOpe()) {
				case 1: //Agregar
					System.out.println("Bono " + i + ": " + "+ " + moneda + bono.getAmount() + " || " + bono.getDesc());
					break;
				case 2: //Reducir
					System.out.println("Bono " + i + ": " + "- " + moneda + bono.getAmount() + " || " + bono.getDesc());
					break;
				case 3: //Agregar un porcentaje
					System.out.println("Bono " + i + ": " + "+ " + moneda + bono.getAmount() + "%" + " || " + bono.getDesc());
					break;
				case 4: //Reducir un porcentaje
					System.out.println("Bono " + i + ": " + "- " + moneda + bono.getAmount() + "%" + " || " + bono.getDesc());
					break;
				default:
					break;
				}
				i ++;
			}
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
	}

	//GETTERS Y SETTERS 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Bono> getBonos() {
		return 	Bonos;
	}

	public void setBonos(List<Bono> bonos) {
		this.Bonos = bonos;
	}
	
	//Agregamos un Bono
	public void addBonos(Scanner sc) {
		String desc; int ope; double amount;
		try {
			sc.nextLine();
			System.out.println("Se va a agregar un bono a " + this.getNomApe());
			
			System.out.println("Ingrese una descripcion: ");
			desc = sc.nextLine();
			
			System.out.println("Ingrese una opcion:"
					+ "\n 1. Sumar"
					+ "\n 2. Restar"
					+ "\n 3. Agregar un porcentaje" );
			
			ope = sc.nextInt();
			System.out.println("Ingrese la cantidad: ");
			
			amount = sc.nextDouble();
			
			//Agregamos al Array Bonos
			Bonos.add(new Bono(desc,ope,amount));
			
			System.out.println("Se agrego un bono al usuario.");
		} catch(Exception e) {
			System.out.println("Hubo un error");
		}
		
	}
	
	//Mostramos el Sueldo
	public void showSueldo(String moneda, double sueldoB) {
		double bonos = this.calcBono(sueldoB);
		double total = sueldoB + bonos;
		
		System.out.println("El sueldo a pagar es: " + moneda + total);
	}
}
