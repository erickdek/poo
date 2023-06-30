/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_taller_gestion_horario;

/**
 *
 * @author erick
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clases hijas Laboratorio1, Laboratorio2, etc.
class Laboratorio1 extends Laboratorio {
    private String ubicacion;

    public Laboratorio1(String nombre, int capacidad, String ubicacion) {
        super(nombre, capacidad);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
