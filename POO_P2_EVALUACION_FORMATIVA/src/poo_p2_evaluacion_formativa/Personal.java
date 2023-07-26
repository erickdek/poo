/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_evaluacion_formativa;

/**
 *
 * @author erick
 */
public class Personal {
    private String nombre;
    private String codeU;
    private long CI;
    private int edad;
    
    public Personal(String nombre, String codeU) {
        this.nombre = nombre;
    }
    public Personal(String nombre, String codeU, long CI) {
        this.nombre = nombre;
        this.CI = CI;
    }
    public Personal(String nombre, String codeU, long CI, int edad) {
        this.nombre = nombre;
        this.CI = CI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getCI() {
        return CI;
    }

    public String getCodeU() {
        return codeU;
    }

    public void setCodeU(String codeU) {
        this.codeU = codeU;
    }
    
    
}
