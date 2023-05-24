package poo_p1_lab3_metodos_get;
import java.util.Scanner;
public class POO_P1_LAB3_METODOS_GET {
    public static void main(String[] args) {
        //Objeto para entrada de datos
        Scanner req = new Scanner(System.in);
        String nombre, apellido;
        char letra;
        int edad;
        //Ingresar nombre
        System.out.println("Ingresar nombre: ");
        nombre = req.nextLine();
        //Ingresar apellido
        System.out.println("Ingresa tu apellido: ");
        apellido = req.nextLine();
        //Ingresar edad entero
        System.out.println("Ingresa tu edad: ");
        edad = req.nextInt();
        //Ingresar letra
        System.out.println("Ingresa una letra: ");
        letra = req.next().charAt(0);
        System.out.println("La letra es: " + letra);
        
        Persona p1 = new Persona();
        p1.setNombre(nombre);
        p1.setApellido(apellido);
        p1.setEdad(edad);
        
        System.out.println("¡Hola " + p1.getNombre() + " " + p1.getApellido() + ", tu edad es de " + p1.getEdad() + " años.");
    }
}
