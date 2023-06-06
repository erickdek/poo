import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestor {
    private List<Equipo> equipos;
    private Scanner scanner;
    private MenuHelper menuHelper;

    public Gestor() {
        this.equipos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.menuHelper = new MenuHelper();
    }

    public void crearEquipo() {
        menuHelper.mostrarMenuCrearEquipo();
        int opcion = menuHelper.leerOpcion();
        menuHelper.limpiarBuffer();

        switch (opcion) {
            case 1:
                crearEquipoFutbolMasculino();
                break;
            case 2:
                crearEquipoFutbolFemenino();
                break;
            case 3:
                crearEquipoBasquetMasculino();
                break;
            case 4:
                crearEquipoBasquetFemenino();
                break;
            case 5:
                crearEquipoVoleyMasculino();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }

    private void crearEquipoFutbolMasculino() {
        if (equipos.size() < 8) {
            Equipo equipo = new Equipo("Futbol Masculino");
            equipos.add(equipo);
            System.out.println("Equipo de Futbol Masculino creado correctamente.");
        } else {
            System.out.println("No se pueden crear más equipos de Futbol Masculino.");
        }
    }

    private void crearEquipoFutbolFemenino() {
        if (equipos.size() < 12) {
            Equipo equipo = new Equipo("Futbol Femenino");
            equipos.add(equipo);
            System.out.println("Equipo de Futbol Femenino creado correctamente.");
        } else {
            System.out.println("No se pueden crear más equipos de Futbol Femenino.");
        }
    }

    private void crearEquipoBasquetMasculino() {
        if (equipos.size() < 16) {
            Equipo equipo = new Equipo("Basquet Masculino");
            equipos.add(equipo);
            System.out.println("Equipo de Basquet Masculino creado correctamente.");
        } else {
            System.out.println("No se pueden crear más equipos de Basquet Masculino.");
        }
    }

    private void crearEquipoBasquetFemenino() {
        if (equipos.size() < 20) {
            Equipo equipo = new Equipo("Basquet Femenino");
            equipos.add(equipo);
            System.out.println("Equipo de Basquet Femenino creado correctamente.");
        } else {
            System.out.println("No se pueden crear más equipos de Basquet Femenino.");
        }
    }

    private void crearEquipoVoleyMasculino() {
        if (equipos.size() < 24) {
            Equipo equipo = new Equipo("Voley Masculino");
            equipos.add(equipo);
            System.out.println("Equipo de Voley Masculino creado correctamente.");
        } else {
            System.out.println("No se pueden crear más equipos de Voley Masculino.");
        }
    }

    public void agregarEstudiante() {
        System.out.print("Ingrese el número del equipo al que desea agregar el estudiante: ");
        int idEquipo = scanner.nextInt();
        menuHelper.limpiarBuffer();

        Equipo equipo = buscarEquipoPorId(idEquipo);
        if (equipo != null) {
            if (equipo.getIntegrantes().size() < equipo.getMaxIntegrantes()) {
                System.out.println("Ingrese los datos del estudiante:");
                System.out.print("Número: ");
                int numero = scanner.nextInt();
                menuHelper.limpiarBuffer();
                System.out.print("ID del estudiante: ");
                String idEstudiante = scanner.nextLine();
                System.out.print("Cédula: ");
                String cedula = scanner.nextLine();
                System.out.print("Nombres: ");
                String nombres = scanner.nextLine();
                System.out.print("Apellidos: ");
                String apellidos = scanner.nextLine();
                System.out.print("Semestre: ");
                int semestre = scanner.nextInt();
                menuHelper.limpiarBuffer();

                Estudiante estudiante = new Estudiante(numero, idEstudiante, cedula, nombres, apellidos, semestre);
                equipo.agregarEstudiante(estudiante);
                System.out.println("Estudiante agregado correctamente al equipo.");
            } else {
                System.out.println("No se pueden agregar más estudiantes al equipo.");
            }
        } else {
            System.out.println("No se encontró un equipo con el ID especificado.");
        }
    }

    public void mostrarEstudiantes() {
        for (Equipo equipo : equipos) {
            System.out.println("Equipo: " + equipo.getNombre());
            equipo.mostrarIntegrantes();
            System.out.println("--------------------");
        }
    }

    public void mostrarEquipos() {
        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    public void buscarEquipo() {
        menuHelper.mostrarMenuBuscarEquipo();
        int opcion = menuHelper.leerOpcion();
        menuHelper.limpiarBuffer();

        switch (opcion) {
            case 1:
                buscarEquipoPorId();
                break;
            case 2:
                buscarEquipoPorNombre();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }

    private void buscarEquipoPorId() {
        System.out.print("Ingrese el ID del equipo: ");
        int idEquipo = scanner.nextInt();
        menuHelper.limpiarBuffer();

        Equipo equipo = buscarEquipoPorId(idEquipo);
        if (equipo != null) {
            System.out.println("Equipo encontrado:");
            System.out.println(equipo);
            System.out.println("--------------------");
        } else {
            System.out.println("No se encontró un equipo con el ID especificado.");
        }
    }

    private void buscarEquipoPorNombre() {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();

        List<Equipo> equiposEncontrados = buscarEquiposPorNombre(nombreEquipo);
        if (!equiposEncontrados.isEmpty()) {
            System.out.println("Equipos encontrados:");
            for (Equipo equipo : equiposEncontrados) {
                System.out.println(equipo);
            }
            System.out.println("--------------------");
        } else {
            System.out.println("No se encontraron equipos con el nombre especificado.");
        }
    }

    public void buscarEstudiante() {
        menuHelper.mostrarMenuBuscarEstudiante();
        int opcion = menuHelper.leerOpcion();
        menuHelper.limpiarBuffer();

        switch (opcion) {
            case 1:
                buscarEstudiantePorId();
                break;
            case 2:
                buscarEstudiantePorNumero();
                break;
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
        }
    }

    private void buscarEstudiantePorId() {
        System.out.print("Ingrese el ID del estudiante: ");
        String idEstudiante = scanner.nextLine();

        Estudiante estudiante = buscarEstudiantePorId(idEstudiante);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudiante);
            System.out.println("--------------------");
        } else {
            System.out.println("No se encontró un estudiante con el ID especificado.");
        }
    }

    private void buscarEstudiantePorNumero() {
        System.out.print("Ingrese el número del estudiante: ");
        int numeroEstudiante = scanner.nextInt();
        menuHelper.limpiarBuffer();

        Estudiante estudiante = buscarEstudiantePorNumero(numeroEstudiante);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudiante);
            System.out.println("--------------------");
        } else {
            System.out.println("No se encontró un estudiante con el número especificado.");
        }
    }

    private Equipo buscarEquipoPorId(int idEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getIdEquipo() == idEquipo) {
                return equipo;
            }
        }
        return null;
    }

    private List<Equipo> buscarEquiposPorNombre(String nombreEquipo) {
        List<Equipo> equiposEncontrados = new ArrayList<>();
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                equiposEncontrados.add(equipo);
            }
        }
        return equiposEncontrados;
    }

    private Estudiante buscarEstudiantePorId(String idEstudiante) {
        for (Equipo equipo : equipos) {
            for (Estudiante estudiante : equipo.getIntegrantes()) {
                if (estudiante.getIdEstudiante().equalsIgnoreCase(idEstudiante)) { //¿Why?
                    return estudiante;
                }
            }
        }
        return null;
    }

    private Estudiante buscarEstudiantePorNumero(int numeroEstudiante) {
        for (Equipo equipo : equipos) {
            for (Estudiante estudiante : equipo.getIntegrantes()) {
                if (estudiante.getNumero() == numeroEstudiante) {
                    return estudiante;
                }
            }
        }
        return null;
    }
}