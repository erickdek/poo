/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_taller_gestion_horario;

/**
 *
 * @author erick
 */
class Laboratorio2 extends Laboratorio {
    private String tipo;

    public Laboratorio2(String nombre, int capacidad, String tipo) {
        super(nombre, capacidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
