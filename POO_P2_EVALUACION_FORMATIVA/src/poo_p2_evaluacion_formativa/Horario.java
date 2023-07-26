/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_evaluacion_formativa;

/**
 *
 * @author erick
 */
public class Horario {
    private String[][] horario;

    public Horario() {
        horario = new String[7][4];
        // Inicializar el horario con espacios en blanco
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                horario[i][j] = " ";
            }
        }
    }

    public boolean asignarHorario(int dia, int hora, String asignatura, String laboratorio) {
        if (horario[dia][hora].equals(" ")) {
            horario[dia][hora] = asignatura + " (" + laboratorio + ")";
            return true;
        }
        return false;
    }

    public void mostrarHorario() {
        String horaAsignatura = "";
        System.out.println("Horario:");
        String[] horas = {"7:00-9:00", "9:00-11:00", "11:00-13:00", "13:30-15:30"};
        System.out.println("\t--- HORA ---\t| \t  LUNES \t | \t  MARTES  \t | \t MIERCOLES \t | \t JUEVES \t | \t VIERNES \t | \t SABADO \t | \t DOMINGO \t");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t----------\t|\t----------\t|\t----------\t|\t----------\t|\t----------\t|\t----------\t|\t----------\t|\t----------\t");
            System.out.print("\t" + horas[i] + "\t");
            for (int j = 0; j < 7; j++) {
                horaAsignatura = "     .     ";
                if (horario[j][i] != " " && horario[j][i] != "" && horario[j][i] != null){
                    horaAsignatura = horario[j][i];
                }
                System.out.print("|\t" + horaAsignatura + "\t");
            }
            System.out.print("\n");
        }
    }
}
