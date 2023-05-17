package poo_p1_pract8_operaciones;

public class Calculadora {
   public int sumar(int num1, int num2){ //Metodo que recibe y devuelve la suma.
        int suma = num1+num2;
        System.out.println(num1 + " + " + num2);
        return suma;
    }
    public int restar(int num1, int num2){ //Metodo que recibe y devuelve la resta.
        int resta = num1-num2;
        System.out.println(num1 + " - " + num2);
        return resta;
    }
    public int multiplicar(int num1, int num2){ //Metodo que recibe y devuelve la multiplicacion.
        int multiplicacion = num1*num2;
        System.out.println(num1 + " * " + num2);
        return multiplicacion;
    }
    public int dividir(int num1, int num2){ //Metodo que recibe y devuelve la division.
        int division = num1/num2;
        System.out.println(num1 + " / " + num2);
        return division;
    }
    
    public void resultados(int num){ //Método de tipo void que recibe datos enteros y muestra la suma.
        System.out.println("El resultado de la operacion es: " + num);
    }
}
