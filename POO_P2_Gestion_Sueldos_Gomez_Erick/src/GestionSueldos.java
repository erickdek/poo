import java.util.*;

public class GestionSueldos {
	//Arrays
	public static List <Docente> Docentes = new ArrayList();
	public static List <Limpieza> Limpieza = new ArrayList();
	public static List <Tecnico> Tecnicos = new ArrayList();
	public static List <Administrativo> Administradores = new ArrayList();
	
	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		Sistema conf = new Sistema();
		
		do {
			System.out.println("Binvenidos al sistema de gestion de sueldos");
			System.out.println("Ingrese una opcion"
					+ "\n 1. Agregar un Docente"
					+ "\n 2. Agregar un Tecnico"
					+ "\n 3. Agregar un Administrador"
					+ "\n 4. Agregar uno de Limpieza"
					+ "\n 5. Agregar un Bono"
					+ "\n 6. Mostrar los datos de un empleado"
					+ "\n 7. Establecer Sueldo Base - " + conf.getMoneda() + conf.getSueldo()
					+ "\n 8. Establecer la Moneda - " + conf.getMoneda()
					+ "\n 9. Salir");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 1:
				addDocente(sc);
				break;
			case 2:
				addTecnico(sc);
				break;
			case 3:
				addAdministrativo(sc);
				break;
			case 4:
				addLimpieza(sc);
				break;
			case 5:
				addBono(sc);
				break;
			case 6:
				ShowDataUser(sc,conf.getMoneda(),conf.getSueldo());
				break;
			case 7:
				conf.putSueldo(sc);
				break;
			case 8:
				conf.putMoneda(sc);
				break;
			}
		} while (op != 9);
		
	}
	
	//Agregar un Bono
	public static void addBono(Scanner sc) {
		try {
			int op, id;
			System.out.println("Agregaremos un Bono."
					+ "\n 1. A un Docente"
					+ "\n 2. A un Tecnico"
					+ "\n 3. A un Administrativo"
					+ "\n 4. A uno de Limpieza");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 1:
				showDocentes();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Docente user = Docentes.get(id - 1);
				user.addBonos(sc);
				Docentes.set(id - 1, user);
				break;
			case 2:
				showTecnicos();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Tecnico userTec = Tecnicos.get(id - 1);
				userTec.addBonos(sc);
				Tecnicos.set(id - 1, userTec);
				break;
			case 3:
				showAdministrativos();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Administrativo userAdmin = Administradores.get(id - 1);
				userAdmin.addBonos(sc);
				Administradores.set(id - 1, userAdmin);
				break;
			case 4:
				showLimpieza();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Limpieza userLimpieza = Limpieza.get(id - 1);
				userLimpieza.addBonos(sc);
				Limpieza.set(id - 1, userLimpieza);
				break;
			}
			
			System.out.println("Se agrego un bono.");
			
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
	}
	
	//Mostrar Datos del Usuario
	public static void ShowDataUser(Scanner sc, String moneda, double sueldo) {
		try {
			int op, id;
			System.out.println("Mostrar info de un empleado."
					+ "\n 1. A un Docente"
					+ "\n 2. A un Tecnico"
					+ "\n 3. A un Administrativo"
					+ "\n 4. A uno de Limpieza");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				showDocentes();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Personal user = Docentes.get(id - 1);
				user.showInfo(moneda,sueldo);
				break;
			case 2:
				showTecnicos();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Personal userTec = Tecnicos.get(id - 1);
				userTec.showInfo(moneda,sueldo);
				break;
			case 3:
				showAdministrativos();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Personal userAdmin = Administradores.get(id - 1);
				userAdmin.showInfo(moneda,sueldo);
				break;
			case 4:
				showLimpieza();
				System.out.println("Ingrese el ID del usuario: ");
				id = sc.nextInt();
				Personal userLimpieza = Limpieza.get(id - 1);
				userLimpieza.showInfo(moneda,sueldo);
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
	}
	
	//Mostrar los datos del usuario - Tipo Docente
	public static void showDocentes() {
		try {
			int i = 1;
			System.out.println("Docentes: ");
			for (Personal user : Docentes){
				System.out.println( i + " : " + user.getNomApe());
				i ++;
			}
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Mostrar los datos del usuario - Tipo Tecnico
	public static void showTecnicos() {
		try {
			int i = 1;
			System.out.println("Tecnicos: ");
			for (Personal user : Tecnicos){
				System.out.println( i + " : " + user.getNomApe());
				i ++;
			}
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Mostrar los datos del usuario - Tipo Administrativo
	public static void showAdministrativos() {
		try {
			int i = 1;
			System.out.println("Administradores: ");
			for (Personal user : Administradores){
				System.out.println( i + " : " + user.getNomApe());
				i ++;
			}
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Mostrar los datos del usuario - Tipo Limpieza
	public static void showLimpieza() {
		try {
			int i = 1;
			System.out.println("Equipo de Limpieza: ");
			for (Personal user : Limpieza){
				System.out.println( i + " : " + user.getNomApe());
				i ++;
			}
		} catch (Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Agregar al Array Usuario - Docente
	public static void addDocente(Scanner sc) {
		try {
			String nom; String ape; int edad; String titulo;
			System.out.println("Ingresamos un Docente.");
			
			System.out.println("Ingrese el Nombre: ");
			nom = sc.nextLine();
			
			System.out.println("Ingrese el Apellido: ");
			ape = sc.nextLine();
			
			System.out.println("Ingrese el Titulo: ");
			titulo = sc.nextLine();
			
			System.out.println("Ingrese la edad: ");
			edad = sc.nextInt();
			
			//Agregamos al Array
			Docentes.add(new Docente(nom,ape,edad,titulo));
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Agregar al Array Usuario - Limpieza
	public static void addLimpieza(Scanner sc) {
		try {
			String nom; String ape; int edad; String area;
			System.out.println("Ingresamos uno de limpieza.");
			
			System.out.println("Ingrese el Nombre: ");
			nom = sc.nextLine();
			
			System.out.println("Ingrese el Apellido: ");
			ape = sc.nextLine();
			
			System.out.println("Ingrese el Area que realiza la limpieza: ");
			area = sc.nextLine();
			
			System.out.println("Ingrese la edad: ");
			edad = sc.nextInt();
			
			//Agregamos al Array
			Limpieza.add(new Limpieza(nom,ape,edad,area));
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Agregar al Array Usuario - Administrativo
	public static void addAdministrativo(Scanner sc) {
		try {
			String nom; String ape; int edad; String sec;
			System.out.println("Ingresamos un Administrativo.");
			
			System.out.println("Ingrese el Nombre: ");
			nom = sc.nextLine();
			
			System.out.println("Ingrese el Apellido: ");
			ape = sc.nextLine();
			
			System.out.println("Ingrese la Seccion: ");
			sec = sc.nextLine();
			
			System.out.println("Ingrese la edad: ");
			edad = sc.nextInt();
			
			//Agregamos al Array
			Administradores.add(new Administrativo(nom,ape,edad,sec));
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
	
	//Agregamos un tecnico al array
	public static void addTecnico(Scanner sc) {
		try {
			String nom; String ape; int edad; int nivel;
			System.out.println("Ingresamos un Administrativo.");
			
			System.out.println("Ingrese el Nombre: ");
			nom = sc.nextLine();
			
			System.out.println("Ingrese el Apellido: ");
			ape = sc.nextLine();
			
			System.out.println("Ingrese el nivel: ");
			nivel = sc.nextInt();
			
			System.out.println("Ingrese la edad: ");
			edad = sc.nextInt();
			
			//Agregamos al Array
			Tecnicos.add(new Tecnico(nom,ape,edad,nivel));
		} catch(Exception e) {
			System.out.println("Hubo un error.");
		}
		
	}
}
