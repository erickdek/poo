/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_test_campeonato;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class POO_TEST_CAMPEONATO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flag = 1, option;
		Equipo e1 = new Equipo();
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print(
					"\n=================================\n" +
					"               Menu              \n" +
					"=================================\n" +
					"1. Ingrese los equipos\n" +
					"2. Muestre los equipos\n" +
					"3. Ejecutar campeonato\n" + 
					"4. Salir\n\n" +
					"Ingresa una opcion: ");
			option = teclado.nextInt();
			System.out.print("=================================\n");
			switch(option) {
			case 1:
				e1.addNombreEquipos();
				e1.addNombreJugadores();
				break;
			case 2:
				e1.getNombreJugadores();
				break;
			case 3:
				e1.ejecutarCampeonato();
				break;
			case 4:
				System.out.println("Gracias por usar :D");
				flag = 0;
				break;
			default:
				System.out.println("Ingresa una opcion valida...");
				break;
			}
		} while(flag != 0);
    }
    
}
