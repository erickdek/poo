package poo_p1_pract9_metodo_entrada_valores;
import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
    float num1;
    float num2;
    
    //Establece los numeros
    public void set_nums(){
        System.out.print("Ingresa el numero1 : ");
        this.num1 = sc.nextFloat();
        System.out.print("Ingresa el numero2 : ");
        this.num2 = sc.nextFloat();
    }
    
    //Muestra un numero
    public void show_result(float result){
        System.out.println(" : " + result);
    }
    //Funcion suma
    public float sum (){
        float result = this.num1 + this.num2;
        System.out.print(this.num1 + " + " + this.num2);
        return result;
    }
    //Funcion resta
    public float rest (){
        float result = this.num1 - this.num2;
        System.out.print(this.num1 + " - " + this.num2);
        return result;
    }
    //Funcion multiplicacion
    public float multi (){
        float result = this.num1 * this.num2;
        System.out.print(this.num1 + " * " + this.num2);
        return result;
    }
    //Funcion division
    public float divi (){
        float result = this.num1 / this.num2;
        if (this.num2 == 0){
            System.out.print("No se puede dividir para CERO");
            return 0;
        }
        System.out.print(this.num1 + " / " + this.num2);
        return result;
    }
}
