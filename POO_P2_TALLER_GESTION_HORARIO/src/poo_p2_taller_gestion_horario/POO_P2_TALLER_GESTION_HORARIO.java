/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p2_taller_gestion_horario;
import  java.util.*;
/**
 *
 * @author erick
 */
public class POO_P2_TALLER_GESTION_HORARIO {
    
    private static List<Laboratorio> laboratorios;
    private static List<Asignatura> asignaturas;
    private static Menu menu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        laboratorios = new ArrayList<>();
        asignaturas = new ArrayList<>();
        menu = new Menu();

        boolean salir = false;

        while (!salir) {
            int opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1:
                    agregarLaboratorio();
                    break;
                case 2:
                    asignarHorarioAsignatura();
                    break;
                case 3:
                    mostrarInformacionLaboratorios();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    private static void agregarLaboratorio() {
        String nombre = menu.pedirNombre();
        int capacidad = menu.pedirCapacidad();
        int tipoLaboratorio = seleccionarTipoLaboratorio();

        Laboratorio laboratorio;
        if (tipoLaboratorio == 1) {
            String ubicacion = menu.pedirUbicacion();
            laboratorio = new Laboratorio1(nombre, capacidad, ubicacion);
        } else {
            String tipo = menu.pedirTipo();
            laboratorio = new Laboratorio2(nombre, capacidad, tipo);
        }

        while (true) {
            System.out.print("¿Desea agregar un equipo al laboratorio? (S/N): ");
            String respuesta = menu.pedirRespuestaSiNo();
            if (respuesta.equalsIgnoreCase("S")) {
                String equipo = menu.pedirEquipo();
                laboratorio.agregarEquipo(equipo);
            } else {
                break;
            }
        }

        laboratorios.add(laboratorio);
        System.out.println("Laboratorio agregado exitosamente.");
    }

    private static int seleccionarTipoLaboratorio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de laboratorio:");
        System.out.println("1. Laboratorio 1");
        System.out.println("2. Laboratorio 2");
        System.out.print("Ingrese una opción: ");

        int opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
        }

        return opcion;
    }

    private static void asignarHorarioAsignatura() {
        if (laboratorios.isEmpty()) {
            System.out.println("No se han agregado laboratorios. Por favor, agregue laboratorios primero.");
            return;
        }

        String nombreAsignatura = menu.pedirNombreAsignatura();
        String horarioAsignatura = menu.pedirHorarioAsignatura();

        Laboratorio laboratorioAsignado = seleccionarLaboratorio();

        if (laboratorioAsignado == null) {
            System.out.println("No se ha seleccionado ningún laboratorio. Asignatura no asignada.");
            return;
        }

        Asignatura asignatura = new Asignatura(nombreAsignatura, horarioAsignatura, laboratorioAsignado);
        asignaturas.add(asignatura);

        System.out.println("Asignatura asignada exitosamente.");
    }

    private static Laboratorio seleccionarLaboratorio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un laboratorio:");

        for (int i = 0; i < laboratorios.size(); i++) {
            Laboratorio laboratorio = laboratorios.get(i);
            System.out.println((i + 1) + ". " + laboratorio.getNombre());
        }

        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > laboratorios.size()) {
            System.out.println("Opción inválida. No se ha seleccionado ningún laboratorio.");
            return null;
        }

        return laboratorios.get(opcion - 1);
    }

    private static void mostrarInformacionLaboratorios() {
        if (laboratorios.isEmpty()) {
            System.out.println("No se han agregado laboratorios.");
            return;
        }

        System.out.println("Información de los laboratorios:");

        for (Laboratorio laboratorio : laboratorios) {
            System.out.println("Nombre: " + laboratorio.getNombre());
            System.out.println("Capacidad: " + laboratorio.getCapacidad());

            if (laboratorio instanceof Laboratorio1) {
                Laboratorio1 lab1 = (Laboratorio1) laboratorio;
                System.out.println("Ubicación: " + lab1.getUbicacion());
            } else if (laboratorio instanceof Laboratorio2) {
                Laboratorio2 lab2 = (Laboratorio2) laboratorio;
                System.out.println("Tipo: " + lab2.getTipo());
            }

            List<String> equipos = laboratorio.getEquipos();
            System.out.println("Equipos: " + equipos.toString());

            System.out.println();
        }
    }
    
}
