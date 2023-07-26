/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_evaluacion_formativa;

/**
 *
 * @author erick
 */
public class Estudiante extends Personal {
    public Estudiante(String nombre, String codeU) {
        super(nombre, codeU);
    }
    public Estudiante(String nombre, String codeU, long CI) {
        super(nombre,codeU,CI);
    }
    public Estudiante (String nombre, String codeU, long CI, int edad) {
        super(nombre,codeU,CI,edad);
    }
}
