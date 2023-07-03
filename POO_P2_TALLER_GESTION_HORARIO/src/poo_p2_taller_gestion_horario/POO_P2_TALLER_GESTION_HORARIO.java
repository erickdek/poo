/* RELAGLAS DEL NEGOCIO
Una institución educativa JUNTOS POR LA EDUCACIÓN TECNOLÓGICA SUPERIOR, necesita un sistema para gestionar los horarios de sus laboratorios.
Cada laboratorio tiene un nombre, una capacidad máxima de estudiantes y un conjunto de equipos disponibles. Responsable dl laboratorio,
director de todos los laboratorios.
La institución necesita un sistema orientado a objetos en el cual debe permitir asignar horarios a diferentes asignaturas y controlar 
la disponibilidad de los laboratorios.

Los requisitos del sistema son:

•	Crear el uml, caso de uso, diagrama de secuencia, diagrama de clases.
•	Crea una clase padre o base llamada Laboratorio que tenga los atributos comunes a todos los laboratorios: nombre, capacidad y equipos. (USTED OUEDE PONER SUS ATRIBUTOS)
•	Crea clases hija o derivada para cada tipo de laboratorio, como Laboratorio1, Laboratorio2, etc., que hereden de la clase padre 
        Laboratorio.
•	Cada clase hija debe tener atributos y métodos específicos según el tipo, espacio, lugar y con lo que cuenta cada laboratorio.
•	Implementa constructores en cada clase para inicializar los atributos correspondientes.
•	Crea una clase Asignatura que tenga atributos como nombre y horario. (tú puedes poner tus atributos)
•	La clase Asignatura debe tener un atributo de tipo Laboratorio que representa el laboratorio asignado.
•	Implementa un método en la clase Laboratorio para verificar la disponibilidad de un horario específico.
•	Crea una clase principal que permita agregar laboratorios, asignar horarios a asignaturas y mostrar la información de los 
        laboratorios. (debe pedirme cuantos laboratorios se va ingresar y llenar lo que contiene cada laboratorio, todo debe pedir por
        consola, igual cuantas asignaturas e ingresar las asignaturas)

Utiliza UML, la herencia, las clases, los objetos, los constructores y los atributos adecuadamente para resolver el problema
*/
package poo_p2_taller_gestion_horario;
import  java.util.*;
/**
 *
 * @author erick
 */
public class POO_P2_TALLER_GESTION_HORARIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Laboratorio> laboratorios = new ArrayList<>();
        List<Asignatura> asignaturas = new ArrayList<>();
        List<Persona> empleados = new ArrayList<>();
        Menu mn = new Menu();
        Horario horario = new Horario();
        Persona director = null;
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
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
                        }
                        int encargadoIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        Persona encargadoLab = empleados.get(encargadoIndex - 1);

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
                        laboratorios.add(laboratorio);
                    } catch(Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese el nombre de la asignatura:");
                        String nombreAsignatura = scanner.nextLine();
                        Asignatura asignatura = new Asignatura(nombreAsignatura);
                        asignaturas.add(asignatura);
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Seleccione el laboratorio:");
                        //Visualizar los laboratorios
                        for (int i = 0; i < laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". " + laboratorios.get(i).getNombre());
                        }
                        laboratorioIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea
                        System.out.println("Seleccione la asignatura:");
                        //Visualizar las asignaturas
                        for (int i = 0; i < asignaturas.size(); i++) {
                            System.out.println((i + 1) + ". " + asignaturas.get(i).getNombre());
                        }
                        int asignaturaIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        mn.mostrarDias();
                        int dia = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        mn.mostrarHoras();
                        int hora = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        String asignaturaNombre = asignaturas.get(asignaturaIndex - 1).getNombre();
                        String laboratorioNombre = laboratorios.get(laboratorioIndex - 1).getNombre();
                        boolean exito = laboratorios.get(laboratorioIndex - 1).setHora(dia - 1, hora - 1, asignaturaNombre);
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
                        for (int i = 0; i < laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". HORARIO - " + laboratorios.get(i).getNombre());
                            laboratorios.get(i).showHorario();
                        }
                    } catch(Exception e){
                        System.out.println("Hubo un error al mostrar los horarios...");
                    }
                    
                    break;
                case 5:
                    try {
                        System.out.println("Seleccione el laboratorio:");
                        for (int i = 0; i < laboratorios.size(); i++) {
                            System.out.println((i + 1) + ". " + laboratorios.get(i).getNombre());
                        }
                        laboratorioIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        Laboratorio labSeleccionado = laboratorios.get(laboratorioIndex - 1);
                        Persona encargadoSeleccionado = labSeleccionado.getEncargado();
                        Persona directorSeleccionado = director;

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
                case 6:
                    try {
                        System.out.println("Ingrese los datos del empleado:");
                        System.out.print("Nombre: ");
                        String nombreEmpleado = scanner.nextLine();
                        Persona empleado = new Persona(nombreEmpleado);
                        empleados.add(empleado);
                    } catch (Exception e){
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 7:
                    try {
                        System.out.println("Seleccione el nuevo director:");
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
                        }
                        int nuevoDirectorIndex = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea

                        director = empleados.get(nuevoDirectorIndex - 1);
                    } catch (Exception e) {
                        System.out.println("Hubo un error...");
                    }
                    
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }
}
