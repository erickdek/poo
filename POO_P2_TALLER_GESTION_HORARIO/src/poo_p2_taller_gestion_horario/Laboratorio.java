/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_taller_gestion_horario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erick
 */
class Laboratorio {
    protected String nombre;
    protected int capacidad;
    protected List<String> equipos;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<String> getEquipos() {
        return equipos;
    }

    public void agregarEquipo(String equipo) {
        equipos.add(equipo);
    }

    public boolean verificarDisponibilidad(String horario) {
        // Implementa aquí la lógica para verificar la disponibilidad de un horario específico
        // Puedes adaptarla según tus necesidades
        return true;
    }
}
