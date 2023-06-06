import java.util.Scanner;

public class MenuHelper {
    private Scanner scanner;

    public MenuHelper() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("1. Crear un equipo");
        System.out.println("2. Agregar estudiante");
        System.out.println("3. Mostrar estudiantes");
        System.out.println("4. Mostrar equipos");
        System.out.println("5. Buscar un equipo");
        System.out.println("6. Buscar un estudiante");
        System.out.println("0. Salir");
    }

    public void mostrarMenuCrearEquipo() {
        System.out.println("----- CREAR UN EQUIPO -----");
        System.out.println("1. Futbol Masculino");
        System.out.println("2. Futbol Femenino");
        System.out.println("3. Basquet Masculino");
        System.out.println("4. Basquet Femenino");
        System.out.println("5. Voley Masculino");
        System.out.println("0. Volver al menú principal");
    }

    public void mostrarMenuBuscarEquipo() {
        System.out.println("----- BUSCAR UN EQUIPO -----");
        System.out.println("1. Buscar por ID de equipo");
        System.out.println("2. Buscar por nombre de equipo");
        System.out.println("0. Volver al menú principal");
    }

    public void mostrarMenuBuscarEstudiante() {
        System.out.println("----- BUSCAR UN ESTUDIANTE -----");
        System.out.println("1. Buscar por ID de estudiante");
        System.out.println("2. Buscar por número de estudiante");
        System.out.println("0. Volver al menú principal");
    }

    public int leerOpcion() {
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public void limpiarBuffer() {
        scanner.nextLine();
    }
}