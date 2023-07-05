package poo_p2_pract14_interfaces;
import java.util.*;
/**
 *
 * @author erick
 */
public class POO_P2_PRACT14_INTERFACES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado, radio, altura;
        System.out.println("Ingrese el lado del cuadrado: ");
        lado = sc.nextDouble();
        Cuadrado box1 = new Cuadrado(lado);
        box1.dibujar();
        System.out.println("El area del cuadrado es de: " + box1.calcArea() );
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        Circulo circ1 = new Circulo(radio);
        circ1.dibujar();
        circ1.rotar();
        System.out.println("El area del circulo es de: " + circ1.calcArea() );
        
        System.out.println("Ingrese el lado del Rectangulo: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese la altura del Rectangulo: ");
        altura = sc.nextDouble();
        Rectangulo rec1 = new Rectangulo(lado, altura);
        rec1.dibujar();
        System.out.println("El area del rectangulo es de: " + rec1.calcArea() );
    }
}
