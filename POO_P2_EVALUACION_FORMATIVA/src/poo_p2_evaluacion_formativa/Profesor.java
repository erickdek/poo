/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_evaluacion_formativa;

/**
 *
 * @author erick
 */
public class Profesor extends Personal {
    private String CodeU;
    
    public Profesor(String nombre, String codeU) {
        super(nombre, codeU);
    }
    public Profesor(String nombre, String codeU, long CI) {
        super(nombre,codeU,CI);
    }
    public Profesor (String nombre, String codeU, long CI, int edad) {
        super(nombre, codeU,CI,edad);
    }
}
