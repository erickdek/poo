package poo_p1_pract8_operaciones;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
    
    
    //Solicitar numeros
    public float req_num (){
        float num = sc.nextFloat();
        return num;
    }
    //Mostrar resultados
    public void show_result (float result){
        System.out.print(result);
    }
    
    //Funcion suma
    public void suma (){
        float numero1, numero2;
        numero1 = this.req_num();
        System.out.print("+");
        numero2 = this.req_num();
        float result = numero1 + numero2;
        System.out.print(" = ");
        this.show_result(result);
    }
    
    //Funcon resta
    public void resta (){
        float numero1, numero2;
        numero1 = this.req_num();
        System.out.print("-");
        numero2 = this.req_num();
        float result = numero1 - numero2;
        System.out.print(" = ");
        this.show_result(result);
    }
    
    //Funcion multiplicacion
    public void multi (){
        float numero1, numero2;
        numero1 = this.req_num();
        System.out.print("*");
        numero2 = this.req_num();
        float result = numero1 * numero2;
        System.out.print(" = ");
        this.show_result(result);
    }
    
    //Funcion division
    public void divi (){
        float numero1, numero2;
        numero1 = this.req_num();
        System.out.print("/");
        numero2 = this.req_num();
        float result = numero1 / numero2;
        System.out.print(" = ");
        this.show_result(result);
    }
}
