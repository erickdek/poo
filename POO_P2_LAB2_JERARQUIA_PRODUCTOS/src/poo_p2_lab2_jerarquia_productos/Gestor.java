package poo_p2_lab2_jerarquia_productos;

import java.util.*;
/**
 *
 * @author erick
 */
public class Gestor {
    List<Product> Productos;
    List<Order> Pedidos;
    public Gestor(){
        Productos = new ArrayList();
        Pedidos = new ArrayList();
    }
    public double ObtenerPrecioPedido(){
        return 0.0;
    }
    
    //Mostrar el total de los pedidos
    public void showTotal(){
        try {
            double result = 0.0;
            double off = 0.0;
            double total = 0.0;
            
            for( Order pedido : Pedidos){
                Product product = Productos.get(pedido.ProductID - 1 );
                result += product.getPrecio() * pedido.CountProduct;
                if (product.getDays() == 1){
                    off += product.getPrecio() * 0.2;
                } else if (product.getDays() == 2 || product.getDays() == 3){
                    off += product.getPrecio() * 0.15;
                }  else if (product.getDays() > 3 ){
                    off += product.getPrecio() * 0.10;
                }
            }
            total = result - off;
            System.out.println(
                "==============================" +
                "\nSUBTOTAL: $USD" + result +
                "\nDESCUENTO: $USD" + off +
                "\nTOTAL: $USD" + total
            );
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
    
    //Mostrar los pedidos del array
    public void showOrder(){
        try {
            int i = 1;
            System.out.println("Pedidos: ");
            for( Order pedido : Pedidos){
                Product product = Productos.get(pedido.ProductID - 1);
                
                System.out.println(
                        "==============================" +
                        "\nID:" + i +
                        "\nProducto: " + product.getNombre() +
                        "\nPrecio: $USD" + product.getPrecio()
                );
                i++;
            }
            this.showTotal();
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
    
    //Agregar un pedido
    public void addOrder(Scanner sc){
        try {
            sc.nextLine();
            long idProduct, stock;
            System.out.println("---REGISTRO DE PEDIDO---");
            this.showProducts();
            System.out.println("Ingrese el ID del producto: ");
            idProduct = sc.nextLong();
            
            System.out.println("Ingrese la cantidad del pedido: ");
            stock = sc.nextLong();
            
            System.out.println("Se guardo el pedido.");
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
    
    //Mostrar los productos
    public void showProducts(){
        try {
            int i = 1;
            for( Product product : Productos){
                System.out.println("Productos: ");
                System.out.println(
                        "==============================" +
                        "\nID:" + i +
                        "\nNombre: " + product.getNombre() +
                        "\nPrecio: $USD" + product.getPrecio() +
                        "\nSeccion: " + product.getSeccion() +
                        "\nDias de Oferta: " + product.getDays()
                );
                i++;
            }
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
    
    //Agregar un producto
    public void addProduct(Scanner sc){
        try {
            sc.nextLine();
            String name, sec = null;double precio;long days = 0;int type;
            System.out.println("---REGISTRO DE PRODUCTO---");
            System.out.println("Ingrese el nombre del producto");
            name = sc.nextLine();

            System.out.println("Ingrese el precio del producto");
            precio = sc.nextDouble();

            System.out.println("Ingrese el tipo del producto");
            System.out.println(
                    "1. Standard \n" +
                    "2. Con Oferta"
            );
            type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Ingrese la seccion del producto");
                    sec = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese los dias de oferta del producto");
                    days = sc.nextLong();
                    break;
            }
            //Se agrega un producto al array
            Productos.add(new Product(name,precio,sec,days));
            
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
}
