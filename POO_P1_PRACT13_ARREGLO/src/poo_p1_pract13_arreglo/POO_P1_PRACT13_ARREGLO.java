//Convertir en clase, number, people, En numeros mostrar los numeros PAR
package poo_p1_pract13_arreglo;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class POO_P1_PRACT13_ARREGLO {
    public static void main(String[] args) {
        Gestor gs = new Gestor();
        Scanner req = new Scanner(System.in);
        
        int op = 0, age, data = 0; double value; String name, lastname, country;
        do {
            
            System.out.println(
                "Bienvenido, escoge una opcion; \n" +
                "1. Ingresar un numero a la lista \n" +
                "2. Ingresar una persona a la lista \n" +
                "3. Calcular la suma de la lista de numeros \n" +
                "4. Calcular la media de la lista de numeros \n" +
                "5. Mostrar la cantidad de numeros \n" +
                "6. Mostrar la cantidad de personas \n" +
                "7. Check array posicion 1 es par? \n" +
                "9. Salir \n"
            );
                    
            op = req.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Opcion 1: Ingresar un numero a la lista");
                    System.out.println("Ingrese un numero");
                    value = req.nextDouble();
                    gs.addNumber(value);
                    System.out.println("Se agrego el valor");
                    break;
                case 2:
                    System.out.println("Opcion 2: Ingresar una persona a la lista");
                    req.nextLine(); // Consumir el carácter de nueva línea adicional
                    System.out.println("Ingrese el nombre");
                    name = req.nextLine();
                    System.out.println("Ingrese el apellido");
                    lastname = req.nextLine();
                    System.out.println("Ingrese el Pais");
                    country = req.nextLine();
                    System.out.println("Ingrese la edad");
                    age = req.nextInt();
                    gs.addPeople(name, lastname, country, age);
                    System.out.println("Se agrego el valor");
                    break;
                case 3:
                    System.out.println("Opcion 3: Calcular la suma de la lista de numeros");
                    value = gs.calcNumber(0);
                    System.out.println("La suma de la lista de numeros es: " + value);
                    break;
                case 4:
                    System.out.println("Opcion 4: Calcular la media de la lista de numeros");
                    value = gs.calcNumber(1);
                    System.out.println("La media de los datos agregados es: " + value);
                    break;
                case 5:
                    System.out.println("Opcion 5: Mostrar la cantidad de numeros");
                    data = gs.showAmount(0);
                    System.out.println("Hay " + data + " numeros guardados en la lista");
                    break;
                case 6:
                    System.out.println("Opcion 6: Mostrar la cantidad de personas");
                    data = gs.showAmount(1);
                    System.out.println("Hay " + data + " personas guardadas en la lista");
                    break;
                case 7:
                    System.out.println("Opcion 7: Check array posicion 1 es par?");
                    if (gs.checkPar(1)){
                        System.out.println("El valor en la ubicacion 1, si es Par");
                    }
                    System.out.println("Hay " + data + " personas guardadas en la lista");
                    break;
                default:
                    System.out.println("Opcion escogida desconocida...");
                    break;
                case 9:
                    System.out.println("Gracias por usar... Saliendo...");
                    break;
            }
            
        } while (op != 9);
        
    }
}
