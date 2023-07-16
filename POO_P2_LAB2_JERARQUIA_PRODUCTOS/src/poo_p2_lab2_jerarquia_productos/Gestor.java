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
    
    //Mostrar el total de los pedidos
    public void ObtenerPrecioPedido(){
        try {
            double result = 0.0;
            double off = 0.0;
            double total = 0.0;
            
            for( Order pedido : Pedidos){
                Product product = Productos.get(pedido.ProductID - 1 );
                result += product.getPrecio() * pedido.CountProduct;
                //Si el producto es un standard y hay en el pedido 5 o mas, dar un 10% de descuento.
                if (product.offDays == 0 && pedido.CountProduct >= 5) off += product.getPrecio() * 0.1 * pedido.CountProduct;
                
                //Condiciones para los productos ofertados
                if (product.getDays() == 1){
                    off += product.getPrecio() * 0.2 * pedido.CountProduct;
                } else if (product.getDays() == 2 || product.getDays() == 3){
                    off += product.getPrecio() * 0.15 * pedido.CountProduct;
                }  else if (product.getDays() > 3 ){
                    off += product.getPrecio() * 0.10 * pedido.CountProduct;
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
            System.out.println("Pedidos: " + Pedidos.size() );
            for( Order pedido : Pedidos){
                Product product = Productos.get(pedido.ProductID - 1);
                
                System.out.println(
                        "==============================" +
                        "\nID:" + i +
                        "\nProducto: " + product.getNombre() +
                        "\nPrecio: $USD" + product.getPrecio() +
                        "\nCantidad: " + pedido.CountProduct
                );
                i++;
            }
            this.ObtenerPrecioPedido();
        } catch (Exception e){
            System.out.println("Se produjo un error... se cancelo el proceso...");
        }
    }
    
    //Agregar un pedido
    public void addOrder(Scanner sc){
        try {
            sc.nextLine();
            int idProduct, stock;
            System.out.println("---REGISTRO DE PEDIDO---");
            this.showProducts();
            System.out.println("Ingrese el ID del producto: ");
            idProduct = sc.nextInt();
            
            System.out.println("Ingrese la cantidad del pedido: ");
            stock = sc.nextInt();
            
            //Se agrega un pedido al array
            Pedidos.add(new Order(idProduct, stock));
            
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
            String name, sec = "";double precio;long days = 0;int type;
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
            sc.nextLine();
            
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
