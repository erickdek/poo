/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_evaluacion_formativa;

/**
 *
 * @author erick
 */
public class Laboratorio {
    private String nombre;
    private String lugar;
    private int capacidadEstudiantes;
    private Personal encargado;
    private Horario horario;

    public Laboratorio(String nombre, String lugar, int capacidadEstudiantes, Personal encargado) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.capacidadEstudiantes = capacidadEstudiantes;
        this.encargado = encargado;
        this.horario = new Horario();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public int getCapacidadEstudiantes() {
        return capacidadEstudiantes;
    }

    public Personal getEncargado() {
        return encargado;
    }

    public void setEncargado(Personal encargado) {
        this.encargado = encargado;
    }
    
    public boolean setHora(int dia, int hora, String asignatura){
        horario.asignarHorario(dia, hora, asignatura, this.nombre);
        return true;
    }
    
    public void showHorario(){
        horario.mostrarHorario();
    }
}
