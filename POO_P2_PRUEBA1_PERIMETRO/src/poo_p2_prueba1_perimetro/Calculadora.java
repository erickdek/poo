package poo_p2_prueba1_perimetro;
import java.util.*;
/**
 *
 * @author erick
 */
public class Calculadora {
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    ArrayList<FiguraCuadrado> arrCuadrados;
    ArrayList<FiguraTriangulo> arrTriangulos;
    ArrayList<FiguraPoligono> arrPoligonos;
    ArrayList<FiguraRectangulo> arrRectangulos;
    
    public Calculadora(){
        arrCuadrados = new ArrayList<>();
        arrTriangulos = new ArrayList<>();
        arrPoligonos = new ArrayList<>();
        arrRectangulos = new ArrayList<>();
    }
    
    //CUADRADOS
    //Elimina los datos del array
    public boolean clearCuadrados(){
        try {
            this.arrCuadrados.clear();
            System.out.print("\n Se eliminaron los datos...");
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    public boolean addCuadrado(){
        double lado;
        try {
            System.out.print("\n Ingresa la longitud de un lado del cuadrado 'cm': ");
            lado = sc.nextDouble();
            
            FiguraCuadrado figura = new FiguraCuadrado(lado);
            arrCuadrados.add(figura);
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Mostrar los cuadrados
    public void showCuadrados(int calc){
        int count = 0; double allArea = 0.0, allPerimetro = 0.0;
        try {
            for( FiguraCuadrado figura : this.arrCuadrados){
                //Sumar 1 al contador
                count ++;
                //Suma de todos los valores
                allArea += figura.Area();
                allPerimetro += figura.Perimetro();
                
                System.out.print(
                    "\n =================" +
                    "\n Cuadrado: " + count +
                    "\n Lado: " + figura.lado +
                    "\n Area: " + figura.Area() +
                    "\n Perimetro: " + figura.Perimetro()
                );
            }
            System.out.print(
                "\n ================="
            );
            if (calc == 1) System.out.print("\n El total de Cuadrados fue de: " + this.arrCuadrados.size() );
            if (calc == 2) System.out.print("\n El total de Areas fue de: " + allArea);
            if (calc == 3) System.out.print("\n El total de Perimetros fue de: " + allPerimetro);
            System.out.print("\n");
        } catch (Exception e){
            System.out.print("\n Hay un error: " + e + "\n");
        }
    }
    
    //RECTANGULOS
    //Elimina los datos del array
    public boolean clearRectangulos(){
        try {
            this.arrRectangulos.clear();
            System.out.print("\n Se eliminaron los datos...");
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    public boolean addRectangulo(){
        double lado, base;
        try {
            System.out.print("\n Ingresa el lado del rectagulo 'cm': ");
            lado = sc.nextDouble();
            System.out.print("\n Ingresa la base del rectagulo 'cm': ");
            base = sc.nextDouble();
            
            FiguraRectangulo figura = new FiguraRectangulo(lado, base);
            arrRectangulos.add(figura);
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Mostrar los cuadrados
    public void showRectangulos(int calc){
        int count = 0; double allArea = 0.0, allPerimetro = 0.0;
        try {
            for( FiguraRectangulo figura : this.arrRectangulos){
                //Sumar 1 al contador
                count ++;
                //Suma de todos los valores
                allArea += figura.Area();
                allPerimetro += figura.Perimetro();
                
                System.out.print(
                    "\n =================" +
                    "\n Rectangulo: " + count +
                    "\n Lado: " + figura.lado +
                    "\n Base: " + figura.base +
                    "\n Area: " + figura.Area() +
                    "\n Perimetro: " + figura.Perimetro()
                );
            }
            System.out.print(
                "\n ================="
            );
            if (calc == 1) System.out.print("\n El total de Rectangulos fue de: " + this.arrRectangulos.size() );
            if (calc == 2) System.out.print("\n El total de Areas fue de: " + allArea);
            if (calc == 3) System.out.print("\n El total de Perimetros fue de: " + allPerimetro);
            System.out.print("\n");
        } catch (Exception e){
            System.out.print("\n Hay un error: " + e + "\n");
        }
    }
    
    //TRIANGULOS
    //Elimina los datos del array
    public boolean clearTriangulos(){
        try {
            this.arrTriangulos.clear();
            System.out.print("\n Se eliminaron los datos...");
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Agregas un dato al array
    public boolean addTriangulo(){
        double lado, lado2, base, altura;
        try {
            System.out.print("\n Ingresa el lado A 'cm': ");
            lado = sc.nextDouble();
            System.out.print("\n Ingresa el lado B 'base' 'cm': ");
            base = sc.nextDouble();
            System.out.print("\n Ingresa la altura 'cm': ");
            altura = sc.nextDouble();
            
            FiguraTriangulo figura = new FiguraTriangulo(lado, base, altura);
            arrTriangulos.add(figura);
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Mostrar los cuadrados
    public void showTriangulos(int calc){
        int count = 0; double allArea = 0.0, allPerimetro = 0.0;
        try {
            for( FiguraTriangulo figura : this.arrTriangulos){
                //Sumar 1 al contador
                count ++;
                //Suma de todos los valores
                allArea += figura.Area();
                allPerimetro += figura.Perimetro();
                
                System.out.print(
                    "\n =================" +
                    "\n Triangulo: " + count +
                    "\n Lado a: " + figura.lado +
                    "\n Lado b: " + figura.base +
                    "\n Lado c: " + figura.lado2 +
                    "\n Altura: " + figura.altura +
                    "\n Area: " + figura.Area() +
                    "\n Perimetro: " + figura.Perimetro()
                );
            }
            System.out.print(
                "\n ================="
            );
            if (calc == 1) System.out.print("\n El total de Triangulos fue de: " + this.arrTriangulos.size() );
            if (calc == 2) System.out.print("\n El total de Areas fue de: " + allArea);
            if (calc == 3) System.out.print("\n El total de Perimetros fue de: " + allPerimetro);
            System.out.print("\n");
        } catch (Exception e){
            System.out.print("\n Hay un error: " + e + "\n");
        }
    }
    
    //POLIGONOS
    //Elimina los datos del array
    public boolean clearPoligonos(){
        try {
            this.arrTriangulos.clear();
            System.out.print("\n Se eliminaron los datos...");
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Agregas un dato al array
    public boolean addPoligono(){
        double base, apotem; int numLados;
        try {
            System.out.print("\n Ingresa la longitud de una cara del poligono 'cm': ");
            base = sc.nextDouble();
            System.out.print("\n Ingresa el apotema del poligono 'cm': ");
            apotem = sc.nextDouble();
            System.out.print("\n Ingresa el numero de caras del poligono 'entero': ");
            numLados = sc.nextInt();
            
            FiguraPoligono figura = new FiguraPoligono(base, apotem, numLados);
            arrPoligonos.add(figura);
            return true;
        } catch (Exception e){
            System.out.print("\n Hay un error...");
            return false;
        }
    }
    //Mostrar los cuadrados
    public void showPoligonos(int calc){
        int count = 0; double allArea = 0.0, allPerimetro = 0.0;
        try {
            for( FiguraPoligono figura : this.arrPoligonos){
                //Sumar 1 al contador
                count ++;
                //Suma de todos los valores
                allArea += figura.Area();
                allPerimetro += figura.Perimetro();
                
                System.out.print(
                    "\n =================" +
                    "\n Poligono: " + count +
                    "\n Longitud 1 cara: " + figura.base +
                    "\n Apotema: " + figura.apotema +
                    "\n Numero de caras: " + figura.numLados +
                    "\n Area: " + figura.Area() +
                    "\n Perimetro: " + figura.Perimetro()
                );
            }
            System.out.print(
                "\n ================="
            );
            if (calc == 1) System.out.print("\n El total de Poligonos fue de: " + this.arrTriangulos.size() );
            if (calc == 2) System.out.print("\n El total de Areas fue de: " + allArea);
            if (calc == 3) System.out.print("\n El total de Perimetros fue de: " + allPerimetro);
            System.out.print("\n");
        } catch (Exception e){
            System.out.print("\n Hay un error: " + e + "\n");
        }
    }
}
