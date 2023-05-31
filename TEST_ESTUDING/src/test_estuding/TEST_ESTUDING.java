package test_estuding;
import java.util.Scanner;
//UN PROGRAMA TIPO REGISTRO DE NOTAS PARA UN PROFESOR
//1* Agregar notas.
//2* Ver los 10 estudiantes con notas mas altas
//3* Obtener la PROMEDIO de notas.
//4* Imprimir los reprobados - 0 - 7 maxima 10.
//5. Buscar nota por estudiante por numero de cedula, mostrar la posicion en el array y mostrar los datos.

/**
 *
 * @author erick
 */
public class TEST_ESTUDING {
    public static void main(String[] args) {
        int op = 0, value, cedula; 
        double notas;
        String name;
        
        Scanner req = new Scanner(System.in);
        Administracion admin = new Administracion();
        
        do {
            System.out.println(
                    "Bievenidos.. \n" +
                    "1. Agregar una nota \n" +
                    "2. Ver los 10 mejores estudiantes \n" +
                    "3. Promedio de notas \n" +
                    "4. Imprimir los reprobados \n" +
                    "5. Buscar nota por cedula \n" +
                    "9. Salir"
            );
            op = req.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println( "1. Opcion");
                    req.nextLine(); //Capturar los valores de entrada
                    System.out.println( "Ingresar la nota");
                    notas = req.nextDouble();
                    System.out.println( "Ingresar el nombre");
                    req.nextLine(); //Capturar los valores de entrada
                    name = req.nextLine();
                    System.out.println( "Ingresar la cedula");
                    cedula = req.nextInt();
                    System.out.println( "Se estan guardando los datos...");
                    admin.addNotas(notas, name, cedula);
                    System.out.println( "Se guardaron los datos");
                    break;
                case 2:
                    System.out.println( "2. Opcion");
                    admin.showBestStudents(5); //Se mostraran los 10 mejores estudiantes
                    break;
                case 3:
                    System.out.println( "3. Opcion");
                    System.out.println( "El promedio de las notas es de : " + admin.promNotas());
                    break;
                case 4:
                    System.out.println( "4. Opcion");
                    System.out.println( "Los reprobados son:");
                    admin.showReprobados();
                    break;
                case 5:
                    System.out.println( "5. Opcion");
                    cedula = 0;
                    System.out.println( "Ingresa la cedula a buscar:");
                    cedula = req.nextInt();
                    admin.searchCedula(cedula);
                    break;
                case 9:
                    System.out.println( "Gracias por usar");
                    break;
                default:
                    System.out.println( "Ingresaste una opcion invalida...");
                    break;
            }
        } while (op != 9);
    }
}
