package poo_p1_pract12_arreglo.notas;
import java.util.Scanner;
//import java.;
/**
 *
 * @author erick
 */
public class POO_P1_PRACT12_ARREGLONOTAS {
    public static void main(String[] args) {
        GestorNota gnota = new GestorNota();
        int op = 0; double nota = 0;
        Scanner sc = new Scanner(System.in);
        do {
            nota = 0;
            System.out.println("1. Añadir Nota");
            System.out.println("2. Ver Media");
            System.out.println("3. Ver Aprobados");
            System.out.println("4. Salir");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Ingrese nota");
                    nota = sc.nextDouble();
                    gnota.guardarNota(nota);
                    break;
                case 2:
                    System.out.println("La media es: " + gnota.media());
                    break;
                case 3:
                    System.out.println("Aprobados : "+ gnota.aprobados());
                    break;
                case 4:
                    System.out.println("Gracias por usar.");
                    break;
            }
        } while (op != 4);
        
    }
    
}
