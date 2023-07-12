package poo_p2_lab2_jerarquia_productos;
import java.util.*;

public class POO_P2_LAB2_JERARQUIA_PRODUCTOS {
    public static void main(String[] args) {
        int op = 0;
        Gestor gs = new Gestor();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(
                "Seleccione una opcion" +
                "\n1. Agregar un producto" +
                "\n2. Mostrar los productos" +
                "\n3. Agregar Pedido" +
                "\n4. Mostrar el pedido" +
                "\n9. Salir"
            );
            op = getInt(sc);
            switch (op){
                case 1:
                    gs.addProduct(sc);
                    break;
                case 2:
                    gs.showProducts();
                    break;
                case 3:
                    gs.addOrder(sc);
                    break;
                case 4:
                    gs.showOrder();
                    break; 
                default:
                    System.out.println("Una opcion invalida.");
                    break;
            }
            sc.nextLine();
        } while(op != 9);
    }
    
    //Solicitar un entero
    public static int getInt(Scanner sc){
        try{
            int data;
            data = sc.nextInt();
            return data;
        } catch (Exception e){
            System.out.println("Se produjo un error...");
            return -9999;
        }
    }
}
