/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_pract14_interfaces;

/**
 *
 * @author erick
 */
public class Rectangulo implements Figura, Dibujar {
    double lado, altura;
    
    public Rectangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        double result = lado * altura;
        return result;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Usted va a dibujar un rectangulo");
    }
}
