package poo_p1_evaluacion_1;
import java.util.Scanner;

/**
 *
 * @author erick
 * Evaluación 1
 * Enunciado
 * Realizar un programa para la gestión de notas que al iniciarse muestre el siguiente menú:
 * I- Agregar nota
 * 2.- Ver nota media
 * 3.- Ver aprobados
 * 4.- Salir
 * A elegir la opción se solicitará la introducción de una nota y se guardará, volviendo a mostrar de nuevo el menú.
 * Con las opciones 2 y 3 se mostrará, respectivamente, la nota media registrada hasta el momento y el número de 
 * aprobados. A elegir 4 se abandonará el programa
 */
public class POO_P1_EVALUACION_1 {
    public static void main(String[] args) {
        int option = 0, err = 0; String name; Double nota = 0.0;
        RegistroNota registro = new RegistroNota(); //Esta objeto internamente creara objetos Nota y se encargara de otras funciones
        Scanner req = new Scanner(System.in);
        
        do {
            option = 0;
            System.out.println(
                "Bienvenido al sistema de notas." + "\n"
                + "Selecciona una opcion" + "\n"
                + "1. Ingresar notas" + "\n"
                + "2. Ver nota media" + "\n"
                + "3. Ver aprobados" + "\n"
                + "4. Ver todas las Notas" + "\n"
                + "9. Salir" + "\n"
            );
            option = req.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Opcion 1");
                    //Solicitar datos
                    System.out.println("Ingresa el Nombre del estudiante");
                    req.nextLine(); // Consumir el carácter de nueva línea adicional
                    name = req.nextLine();
                    System.out.println("Ingresa la nota del estudiante " + name);
                    nota = req.nextDouble();
                    //Guardar datos
                    registro.addNota(name, nota);
                    //Formateo de variables
                    nota = 0.0;name = "";
                    System.out.println("La nota fue cargada");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    System.out.println("La nota media es: " + registro.calcMedia());
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    registro.showNotas(true);
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    registro.showNotas(false);
                    break;
                case 9:
                    System.out.println("Gracias por usar");
                    break;
            }
        } while (option != 9);
    }
}
