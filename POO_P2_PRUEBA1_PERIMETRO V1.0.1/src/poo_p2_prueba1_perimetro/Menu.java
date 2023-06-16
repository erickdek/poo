package poo_p2_prueba1_perimetro;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class Menu {
    Calculadora clc = new Calculadora();
    
    public void MenuPrincipal(Scanner scanner){
        int op;
        do {
            System.out.print(
                "\n Bienvenido, selecciona la opcion" +
                "\n 1. Calcular." +
                "\n 9. Salir." +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            
            switch (op){
                case 1:
                    this.MenuFiguras(scanner);
                    break;
                case 9:
                    //Opcion Salir
                    System.out.println("Gracias por usar");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 9);
    }
    
    //Menu para calcular distintas figuras
    public void MenuFiguras(Scanner scanner) {
        int op;
        do {
            System.out.print(
                "\n Selecciona la figura para calcular el: \n Area y perimetro" +
                "\n 1. Cuadrado." +
                "\n 2. Rectangulo." +
                "\n 3. Triangulo." +
                "\n 4. Poligono." +
                "\n 9. <- Atras." +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            
            switch(op){
                case 1:
                    //Menu de Cuadrados
                    this.MenuCuadrado(scanner);
                    break;
                case 2:
                    //Menu de Rectangulo
                    this.MenuRectangulo(scanner);
                    break;
                case 3:
                    //Menu de Rectangulo
                    this.MenuTriangulo(scanner);
                    break;
                case 4:
                    //Menu de Poligono
                    this.MenuPoligono(scanner);
                    break;
                case 9:
                    //Opcion Salir
                    System.out.println("Volviendo...");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 9);
    }
    
    //Menu para Calcular Cuadrados
    public void MenuCuadrado(Scanner scanner){
        int op;
        do {
            System.out.print(
                "\n Calcular Cuadrados" +
                "\n 1. Agregar un Cuadrado." + 
                "\n 2. Mostrar los Cuadrados." +
                "\n 3. Calcular el area de los Cuadrados." +
                "\n 4. Calcular el perimetro de los Cuadrados." +
                "\n 0. Borrar todas estas figuras." + 
                "\n 5. <- Atras" +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            switch(op){
                case 0:
                    //Opcion - Eliminar los datos
                    clc.clearCuadrados();
                    break;
                case 1:
                    //Opcion - Agregar un cuadrado
                    clc.addCuadrado();
                    break;
                case 2:
                    //Opcion - Mostrar los cuadrados
                    clc.showCuadrados(1); //Mostrar los lados
                    break;
                case 3:
                    //Opcion - Calcular el area
                    clc.showCuadrados(2); //Mostrar el area
                    break;
                case 4:
                    //Opcion - Calcular el perimetro
                    clc.showCuadrados(3); //Mostrar el perimetro
                    break;
                case 5:
                    //Opcion Salir
                    System.out.println("Volviendo...");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 5);
    }
    
    //Menu para Calcular Rectangulos
    public void MenuRectangulo(Scanner scanner){
        int op;
        do {
            System.out.print(
                "\n Calcular Rectangulos" +
                "\n 1. Agregar un Rectangulo." + 
                "\n 2. Mostrar los Rectangulos." +
                "\n 3. Calcular el area de los Rectangulos." +
                "\n 4. Calcular el perimetro de los Rectangulos." +
                "\n 0. Borrar todas estas figuras." + 
                "\n 5. <- Atras" +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            switch(op){
                case 0:
                    //Opcion - Eliminar los datos
                    clc.clearRectangulos();
                    break;
                case 1:
                    //Opcion - Agregar un Rectangulo
                    clc.addRectangulo();
                    break;
                case 2:
                    //Opcion - Mostrar los Rectangulos
                    clc.showRectangulos(1); //Mostrar los lados
                    break;
                case 3:
                    //Opcion - Calcular el area
                    clc.showRectangulos(2); //Mostrar el area
                    break;
                case 4:
                    //Opcion - Calcular el perimetro
                    clc.showRectangulos(3); //Mostrar el perimetro
                    break;
                case 5:
                    //Opcion Salir
                    System.out.println("Volviendo...");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 5);
    }
    
    //Menu para Calcular Triangulos
    public void MenuTriangulo(Scanner scanner){
        int op;
        do {
            System.out.print(
                "\n Calcular Triangulos" +
                "\n 1. Agregar un Triangulo." + 
                "\n 2. Mostrar los Triangulos." +
                "\n 3. Calcular el area de los Triangulos." +
                "\n 4. Calcular el perimetro de los Triangulos." +
                "\n 0. Borrar todas estas figuras." + 
                "\n 5. <- Atras" +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            switch(op){
                case 0:
                    //Opcion - Eliminar los datos
                    clc.clearTriangulos();
                    break;
                case 1:
                    //Opcion - Agregar un Triangulo
                    clc.addTriangulo();
                    break;
                case 2:
                    //Opcion - Mostrar los Triangulos
                    clc.showTriangulos(1); //Mostrar los lados
                    break;
                case 3:
                    //Opcion - Calcular el area
                    clc.showTriangulos(2); //Mostrar el area
                    break;
                case 4:
                    //Opcion - Calcular el perimetro
                    clc.showTriangulos(3); //Mostrar el perimetro
                    break;
                case 5:
                    //Opcion Salir
                    System.out.println("Volviendo...");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 5);
    }
    
    //Menu para Calcular Poligonos
    public void MenuPoligono(Scanner scanner){
        int op;
        do {
            System.out.print(
                "\n Calcular Poligonos" +
                "\n 1. Agregar un Poligono." + 
                "\n 2. Mostrar los Poligonos." +
                "\n 3. Calcular el area de los Poligonos." +
                "\n 4. Calcular el perimetro de los Poligonos." +
                "\n 0. Borrar todas estas figuras." + 
                "\n 5. <- Atras" +
                "\n Opcion: "
            );
            op = scanner.nextInt();
            switch(op){
                case 0:
                    //Opcion - Eliminar los datos
                    clc.clearPoligonos();
                    break;
                case 1:
                    //Opcion - Agregar un Triangulo
                    clc.addPoligono();
                    break;
                case 2:
                    //Opcion - Mostrar los Triangulos
                    clc.showPoligonos(1); //Mostrar los lados
                    break;
                case 3:
                    //Opcion - Calcular el area
                    clc.showPoligonos(2); //Mostrar el area
                    break;
                case 4:
                    //Opcion - Calcular el perimetro
                    clc.showPoligonos(3); //Mostrar el perimetro
                    break;
                case 5:
                    //Opcion Salir
                    System.out.println("Volviendo...");
                    break;
                default:
                    //Opcion Invalida
                    System.out.println("Seleccionaste una opcion no valida...");
                    break;
            }
        } while (op != 5);
    }
}