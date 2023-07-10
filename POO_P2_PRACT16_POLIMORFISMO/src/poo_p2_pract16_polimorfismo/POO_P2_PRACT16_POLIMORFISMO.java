package poo_p2_pract16_polimorfismo;
import java.util.*;
/**
 *
 * @author erick
 */
public class POO_P2_PRACT16_POLIMORFISMO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0; String color; double b,h,r;
        do {
            System.out.println(
                "\nIngrese una opcion" +
                "\n1. Circulo" +
                "\n2. Cuadrado" +
                "\n3. Rectangulo" +
                "\n4. Triangulo"
            );
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.println("Circulo");
                    color = setColor(sc);
                    r = setRadio(sc);
                    showDataFigura(new Circulo(color, r));
                    break;
                case 2:
                    System.out.println("Cuadrado");
                    color = setColor(sc);
                    b = setBase(sc);
                    showDataFigura(new Rectangulo(color, b,b));
                    break;
                case 3:
                    System.out.println("Rectangulo");
                    color = setColor(sc);
                    b = setBase(sc);
                    h = setAltura(sc);
                    showDataFigura(new Rectangulo(color, b,h));
                    break;
                case 4:
                    System.out.println("Triangulo");
                    color = setColor(sc);
                    b = setBase(sc);
                    h = setAltura(sc);
                    showDataFigura(new Triangulo(color, b,b));
                    break;
                case 8:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 8);
    }
    //Mostrar los datos de los objetos: Color, Superficie
    private static void showDataFigura(Figura f){
        System.out.println("Color:" + f.getColor());
        System.out.println("Superficie: " + f.superficie());
    }
    
    private static double setBase(Scanner sc){
        System.out.print(
            "Ingrese la Base: "
        );
        double base = sc.nextDouble();
        return base;
    }
    
    private static double setAltura(Scanner sc){
        System.out.print(
            "Ingrese la Altura: "
        );
        double altura = sc.nextDouble();
        return altura;
    }
    
    private static double setRadio(Scanner sc){
        System.out.print(
            "Ingrese el Radio: "
        );
        double radio = sc.nextDouble();
        return radio;
    }
    
    private static String setColor(Scanner sc){
        System.out.print(
            "El color de la figura: "
        );
        String color = sc.nextLine();
        return color;
    }
}
