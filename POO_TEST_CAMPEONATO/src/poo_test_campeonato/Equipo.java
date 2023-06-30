/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_test_campeonato;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class Equipo {
    
	private Scanner sc = new Scanner(System.in);
	private String equipos[] = new String[8];
	private String jugadoresEq[][] = new String[4][8]; //cambios aqui

	public void addNombreEquipos() {
		for(int i=0; i<equipos.length; i++) {
			System.out.print("Ingrese el nombre del equipo "+(i+1)+": ");
			equipos[i] = sc.nextLine();
		}
	}
	public void getNombreEquipos() {
		for(int i=0; i<equipos.length; i++) {
			System.out.println("El nombre del equipo " + (i+1) + " es: " + equipos[i]);
		}
	}
	public void addNombreJugadores() {
		for(int i=0; i<8; i++) {
			System.out.print("\nJugadores del equipo "+ equipos[i]);
			for(int j=0; j<4; j++) { //cambios
				if(j==0) {
					System.out.print("\nIngrese el nombre del jugador " + (j+1) + ": ");
					jugadoresEq[j][i] = sc.nextLine();
				} else {
					System.out.print("Ingrese el nombre del jugador " + (j+1) + ": ");
					jugadoresEq[j][i] = sc.nextLine();
				}
			}
		}
	}
	public void getNombreJugadores() {
		for(int i=0; i<8; i++) {
			System.out.print("\n\nEquipo - " + equipos[i]);
			for(int j=0; j<4; j++) { //cambios aqui
				System.out.print("\nEl nombre del jugador " + (j+1) + " es: " + jugadoresEq[j][i]);	
			}
		}
	}
	public void ejecutarCampeonato() {
		int eqs[] = new int[8], emp=0, ctrl = 0, aux = 0, aux1 = 7;
		int eqsR2[] = new int[4];
		int eqsR3[] = new int[2];
		String psc[] = new String[8];
		String empt[] = new String[20];
		String wnrR1[] = new String[4];
		String wnrR2[] = new String[2];
		String wnrF ="";
		System.out.println(
				"\n====================================\n" +
				"          Campeonato          " +
				"\n====================================\n" +
				equipos[0] + " vs " + equipos[1] + "\n" +
				equipos[2] + " vs " + equipos[3] + "\n" +
				equipos[4] + " vs " + equipos[5] + "\n" +
				equipos[6] + " vs " + equipos[7] +
				"\n====================================\n");
		
		for(int i=0; i<equipos.length; i++) {
			eqs[i] = (int)(Math.random()*10)+1;
		}
		
		System.out.println(
				"\n====================================\n" +
				"	Ejecutando Ronda 1" +
				"\n====================================\n");
		for(int i=0; i < 7; i+=2) {
			if(eqs[i]==eqs[i+1]) {
				emp += 1;
				empt[aux] = equipos[i] + " vs " + equipos[i+1];
				aux++;
				System.out.println(equipos[i] + " vs " + equipos[i+1] + " pasan a penales debido a un empate...");
				do {
					eqs[i] = (int)(Math.random()*10)+1;
					eqs[i+1] = (int)(Math.random()*10)+1;
				} while(eqs[i]==eqs[i+1]);
				i-=2;
			} else if(eqs[i] > eqs[i+1]) {
				wnrR1[ctrl] = equipos[i]; 
				ctrl++;
				psc[aux1] = equipos[i+1]; 
				aux1--;
			} else if(eqs[i] < eqs[i+1]) {
				wnrR1[ctrl] = equipos[i+1]; ctrl++;
				psc[aux1] = equipos[i]; aux1--;
			}
		}
		System.out.println(
				"\n====================================\n" +
				"	Resultados de Ronda 1" +
				"\n====================================\n" +
				equipos[0] + " vs " + equipos[1] + " = " + wnrR1[0] + "\n" +
				equipos[2] + " vs " + equipos[3] + " = " + wnrR1[1] + "\n" +
				equipos[4] + " vs " + equipos[5] + " = " + wnrR1[2] + "\n" +
				equipos[6] + " vs " + equipos[7] + " = " + wnrR1[3] +
				"\n====================================\n");
		
		System.out.println(
				"\n====================================\n" +
				"	Ejecutando Ronda 2" +
				"\n====================================\n");
		
		for(int i=0; i<eqsR2.length; i++) {
			eqsR2[i] = (int)(Math.random()*10)+1;
		}
		ctrl = 0;
		System.out.println(
				"\n====================================\n" +
				"	Ronda 2" +
				"\n====================================\n" +
				wnrR1[0] + " vs " + wnrR1[1] + "\n" +
				wnrR1[2] + " vs " + wnrR1[3] +
				"\n====================================\n");
		
		for(int i=0; i<3; i+=2) {
			if(eqsR2[i]==eqsR2[i+1]) {
				emp += 1;
				empt[aux] = wnrR1[i] + " vs " + wnrR1[i+1];
				aux++;
				System.out.println(wnrR1[i] + " vs " + wnrR1[i+1] + " pasan a penales debido a un empate...");
				do {
					eqsR2[i] = (int)(Math.random()*10)+1;
					eqsR2[i+1] = (int)(Math.random()*10)+1;
				} while(eqsR2[i]==eqsR2[i+1]);
				i-=2;
			} else if(eqsR2[i] > eqsR2[i+1]) {
				wnrR2[ctrl] = wnrR1[i]; ctrl++;
				psc[aux1] = wnrR1[i+1]; aux1--;
			} else if(eqsR2[i] < eqsR2[i+1]) {
				wnrR2[ctrl] = wnrR1[i+1]; ctrl++;
				psc[aux1] = wnrR1[i]; aux1--;
			}
		}
		
		System.out.println(
				"\n====================================\n" +
				"	Resultados de Ronda 2" +
				"\n====================================\n" +
				wnrR1[0] + " vs " + wnrR1[1] + " = " + wnrR2[0] + "\n" +
				wnrR1[2] + " vs " + wnrR1[3] + " = " + wnrR2[1] +
				"\n====================================\n");
		
		System.out.println(
				"\n====================================\n" +
				"	Ejecutando Ronda Final " +
				"\n====================================\n");
		
		System.out.println(
				"\n====================================\n" +
				"	Ronda Final" +
				"\n====================================\n" +
				wnrR2[0] + " vs " + wnrR2[1] + 
				"\n====================================\n");
		do {
			eqsR3[0] = (int)(Math.random()*10)+1;
			eqsR3[1] = (int)(Math.random()*10)+1;
			
			if(eqsR3[0] > eqsR3[1]) {
				wnrF = wnrR2[0]; ctrl++;
				psc[aux1] = wnrR2[1]; aux1--;
			} else if(eqsR3[0] < eqsR3[1]) {
				wnrF = wnrR2[1]; ctrl++;
				psc[aux1] = wnrR2[0]; aux1--;
			} else if(eqsR3[0] == eqsR3[1]) {
				System.out.println(wnrR2[0] + " vs " + wnrR1[1] + " pasan a penales debido a un empate...");
			}
		} while(eqsR3[0] == eqsR3[1]);
		
		System.out.println(
				"\n====================================\n" +
				"      	GANADOR        		" +
				"\n====================================\n" +
				"	" + wnrF  +
				"\n====================================\n");
		psc[aux1] = wnrF;
		System.out.println(
				"\n====================================\n" +
				"	Tabla de posiciones" +
				"\n====================================\n");
		for(int i=0; i<8; i++) {
			System.out.print(
					(i+1) + ". " + psc[i] + "\n");
		}
		System.out.println(
				"\n====================================\n");
		
		System.out.println(
				"\n====================================\n" +
				"	El total de empates es: " + emp +
				"\n====================================\n");
	}
}
