/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_taller_gestion_horario;
import java.util.Scanner;

/**
 *
 * @author erick
 */
class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("1. Agregar laboratorio");
        System.out.println("2. Asignar horario a asignatura");
        System.out.println("3. Mostrar información de laboratorios");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        return scanner.nextInt();
    }

    public String pedirNombre() {
        System.out.print("Ingrese el nombre: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextLine();
    }

    public int pedirCapacidad() {
        System.out.print("Ingrese la capacidad: ");
        return scanner.nextInt();
    }

    public String pedirUbicacion() {
        System.out.print("Ingrese la ubicación: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextLine();
    }

    public String pedirTipo() {
        System.out.print("Ingrese el tipo: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextLine();
    }

    public String pedirEquipo() {
        System.out.print("Ingrese el equipo: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextLine();
    }

    public String pedirNombreAsignatura() {
        System.out.print("Ingrese el nombre de la asignatura: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return scanner.nextLine();
    }

    public String pedirHorarioAsignatura() {
        System.out.print("Ingrese el horario de la asignatura: ");
        return scanner.nextLine();
    }
}
