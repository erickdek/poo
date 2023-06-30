/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_pract_10;

/**
 *
 * @author erick
 */
public class Persona {
    private String nombre;
    private int edad;
    private long cedula;
    
     public Persona(String nombre){
        this.nombre = nombre;
    }
     
     public Persona(String nombre, int edad, long cedula){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
     
     public void jugar(){
         System.out.println("Mi nombre es: " + nombre + ", voy a jugar");
     }
     
     public void jugar(String juego){
         System.out.println("Mi nombre es: " + nombre + ", voy a jugar: " + juego);
     }
}
