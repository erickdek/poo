package poo_p2_evaluacion_formativa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POO_P2_EVALUACION_FORMATIVA {
    //Poder usarlos con los metodos estaticos
    static List<Laboratorio> Laboratorios = new ArrayList<>();
    static List<Asignatura> Asignaturas = new ArrayList<>();
    static List<Encargado> Encargados = new ArrayList<>();
    static List<Profesor> Profesores = new ArrayList<>();
    static List<Estudiante> Estudiantes = new ArrayList<>();
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu mn = new Menu();
        Horario horario = new Horario();
        Personal director = null;
        int laboratorioIndex;

        int opcion;
        do {
            mn.mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    try {
                        //SOLICITAR LOS DATOS
                        System.out.println("Ingrese los datos del laboratorio:");
                        System.out.print("Nombre: ");
                        String nombreLab = scanner.nextLine();
                        System.out.print("Lugar: ");
                        String lugarLab = scanner.nextLine();
                        System.out.print("Capacidad de estudiantes: ");
                        int capacidadEstudiantes = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea
                        
                        //MOSTRAR LOS TIPOS DE LABORATORIOS
                        mn.mostrarTipoLaboratory();
                        int tipoLab = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        //SELECCIONAR AL ENCARGADO
                        System.out.println("Seleccione el encargado del laboratorio:");
                        for (int i = 0; i < Encargados.size(); i++) {
                            System.out.println((i + 1) + ". " + Encargados.get(i).getNombre());
                        }
                        int encargadoIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        Personal encargadoLab = Encargados.get(encargadoIndex - 1);

                        Laboratorio laboratorio;
                        switch (tipoLab) {
                            case 1:
                                laboratorio = new Laboratorio(nombreLab, lugarLab, capacidadEstudiantes, encargadoLab);
                                break;
                            case 2:
                                laboratorio = new LabTech(nombreLab, lugarLab, capacidadEstudiantes, encargadoLab);
                                break;
                            case 3:
                                laboratorio = new LabChem(nombreLab, lugarLab, capacidadEstudiantes, encargadoLab);
                                break;
                            default:
                                System.out.println("Tipo de laboratorio inválido");
                                continue;
                        }
                        Laboratorios.add(laboratorio);
                    } catch(Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 2:
                    try {
                        if (checkProfes()){
                            System.out.println("Ingrese el nombre de la asignatura:");
                            String nombreAsignatura = scanner.nextLine();
                            showProfesores();
                            System.out.println("Ingrese el ID del profesor:");
                            int profeID = scanner.nextInt();
                            
                            
                            Asignatura asignatura = new Asignatura(nombreAsignatura, profeID);
                            Asignaturas.add(asignatura);
                        }
                        
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    break;
                    
                case 3:
                    try {
                        System.out.println("Seleccione el laboratorio:");
                        //Visualizar los laboratorios
                        for (int i = 0; i < Laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". " + Laboratorios.get(i).getNombre());
                        }
                        laboratorioIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea
                        System.out.println("Seleccione la asignatura:");
                        //Visualizar las asignaturas
                        for (int i = 0; i < Asignaturas.size(); i++) {
                            System.out.println((i + 1) + ". " + Asignaturas.get(i).getNombre());
                        }
                        int asignaturaIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        mn.mostrarDias();
                        int dia = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        mn.mostrarHoras();
                        int hora = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        String asignaturaNombre = Asignaturas.get(asignaturaIndex - 1).getNombre();
                        String laboratorioNombre = Laboratorios.get(laboratorioIndex - 1).getNombre();
                        boolean exito = Laboratorios.get(laboratorioIndex - 1).setHora(dia - 1, hora - 1, asignaturaNombre);
                        if (exito) {
                            System.out.println("Asignatura programada exitosamente en el horario.");
                        } else {
                            System.out.println("No se pudo programar la asignatura en el horario. La hora ya está ocupada.");
                        }
                    } catch(Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                    
                    
                case 4:
                    //Visualizar los laboratorios
                    try {
                        for (int i = 0; i < Laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". HORARIO - " + Laboratorios.get(i).getNombre());
                            Laboratorios.get(i).showHorario();
                        }
                    } catch(Exception e){
                        System.out.println("Hubo un error al mostrar los horarios...");
                    }
                    
                    break;
                    
                    
                case 5:
                    try {
                        System.out.println("Seleccione el laboratorio:");
                        for (int i = 0; i < Laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". " + Laboratorios.get(i).getNombre());
                        }
                        laboratorioIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        Laboratorio labSeleccionado = Laboratorios.get(laboratorioIndex - 1);
                        Personal encargadoSeleccionado = labSeleccionado.getEncargado();
                        Personal directorSeleccionado = director;

                        System.out.println("Datos del laboratorio:");
                        System.out.println("Nombre: " + labSeleccionado.getNombre());
                        System.out.println("Lugar: " + labSeleccionado.getLugar());
                        System.out.println("Capacidad de estudiantes: " + labSeleccionado.getCapacidadEstudiantes());
                        System.out.println("Encargado: " + encargadoSeleccionado.getNombre());
                        System.out.println("Director: " + directorSeleccionado.getNombre());
                        //Mostramos el horario del laboratorio
                        labSeleccionado.showHorario();
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    break;
                    
                    
                case 7:
                    try {
                        System.out.println("Ingrese los datos del encargado:");
                        System.out.print("Nombre: ");
                        String nombreEmpleado = scanner.nextLine();
                        
                        System.out.print("Codigo Institucion: ");
                        String codeU = scanner.nextLine();
                        
                        System.out.print("Cedula: ");
                        Long CI = scanner.nextLong();
                        
                        System.out.print("Edad: ");
                        int Edad  = scanner.nextInt();
                        
                        Encargado empleado = new Encargado(nombreEmpleado, codeU, CI, Edad);
                        Encargados.add(empleado);
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                    
                case 8:
                    try {
                        showLaboratorios();
                        System.out.println("Ingrese el ID laboratorio:");
                        int labID = scanner.nextInt();
                        
                        
                        
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 9:
                    try {
                        System.out.println("Seleccione el nuevo director:");
                        for (int i = 0; i < Encargados.size(); i++) {
                            System.out.println((i + 1) + ". " + Encargados.get(i).getNombre());
                        }
                        int nuevoDirectorIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        director = Encargados.get(nuevoDirectorIndex - 1);
                    } catch (Exception e) {
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
    
    public static boolean checkProfes(){
        if (Profesores.size() == 0){
            System.out.println("No hay profesores");
            return false;
        }
        return true;
    }
    
    public static boolean checkEstudiantes(){
        if (Estudiantes.size() == 0){
            System.out.println("No hay estudiantes");
            return false;
        }
        return true;
    }
    
    public static boolean checkLaboratorio(){
        if (Laboratorios.size() == 0){
            System.out.println("No hay laboratorios");
            return false;
        }
        return true;
    }
    
    public static boolean checkEncargados(){
        if (Encargados.size() == 0){
            System.out.println("No hay encargados");
            return false;
        }
        return true;
    }
    
    public static void showProfesores(){
        int i = 1;
        try {
            if (Profesores.size() == 0){
                System.out.println("No hay profesores");
                return;
            }
            
            for (Profesor user : Profesores){
                System.out.println(i + " "+user.getNombre());
                i++;
            }
        } catch(Exception e){
            System.out.println("Hubo un error");
        }
    }
    
    public static void showProfesores(int ID){
        try {
            if (Profesores.size() == 0){
                System.out.println("No hay profesores");
                return;
            }
            Profesor user = Profesores.get(ID - 1);
            System.out.println(user.getNombre());
                
        } catch(Exception e){
            System.out.println("Hubo un error");
        }
    }
    
    public static void showEncargados(){
        int i = 1;
        try {
            if (Encargados.size() == 0){
                System.out.println("No hay encargados");
                return;
            }
            
            for (Encargado user : Encargados){
                System.out.println(i + " "+user.getNombre());
                i++;
            }
        } catch(Exception e){
            System.out.println("Hubo un error");
        }
    }
    
    public static void showLaboratorios(){
        int i = 1;
        try {
            if (Laboratorios.size() == 0){
                System.out.println("No hay laboratorios");
                return;
            }
            
            for (Laboratorio user : Laboratorios){
                System.out.println(i + " "+user.getNombre());
                i++;
            }
        } catch(Exception e){
            System.out.println("Hubo un error");
        }
    }
}
