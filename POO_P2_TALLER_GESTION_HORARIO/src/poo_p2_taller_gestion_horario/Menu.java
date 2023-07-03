package poo_p2_taller_gestion_horario;
import java.util.Scanner;

/**
 *
 * @author erick
 */
class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Registrar laboratorio");
        System.out.println("2. Registrar asignatura");
        System.out.println("3. Asignar horario a asignatura");
        System.out.println("4. Visualizar horario completo");
        System.out.println("5. Mostrar datos de un laboratorio");
        System.out.println("6. Registrar empleado");
        System.out.println("7. Cambiar director");
        System.out.println("8. Salir");
        System.out.println("Seleccione una opcion:");
    }

    public static void mostrarMenuTipoLaboratorio() {
        System.out.println("TIPO DE LABORATORIO");
        System.out.println("1. Normal");
        System.out.println("2. Informático");
        System.out.println("3. Químico");
        System.out.println("Seleccione una opcion:");
    }
    
    public static void mostrarDias(){
        System.out.println(
            "Seleccione el dia:" +
            "\n1. Lunes" + 
            "\n2. Martes" + 
            "\n3. Miercoles" + 
            "\n4. Jueves" + 
            "\n5. Viernes" + 
            "\n6. Sabado" + 
            "\n7. Domingo");
    }
    
    public static void mostrarHoras(){
        System.out.println(
            "Seleccione la hora:" + 
            "\n1. 7:00-9:00" + 
            "\n2. 9:00-11:00" + 
            "\n3. 11:00-13:00" + 
            "\n4. 13:30-15:30");
    }
    
    public static void mostrarTipoLaboratory(){
        System.out.println(
            "Seleccione el tipo de laboratorio:" +
            "\n1. Laboratorio normal" + 
            "\n2. Laboratorio informatico" +  
            "\n3. Laboratorio quimico");
    }

    public static int leerOpcion() {
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        return opcion;
    }
}
