package poo_p1_pract13_arreglo;
import java.util.ArrayList;
/**
 *
 * @author erick
 */
public class Gestor {
    public ArrayList<People> arrPeople;
    public ArrayList<Number> arrNumber;
    
    public Gestor(){
        arrPeople = new ArrayList<>();
        arrNumber = new ArrayList<>();
    }
    
    //Agregar un objeto al array
    public void addPeople(String name, String lastname, String country, int age) {
        People person = new People(name, lastname, country, age);
        arrPeople.add(person);
    }
    public void addNumber(double num) {
        Number number = new Number(num);
        arrNumber.add(number);
    }
    
    //Metodo - Calcular la Media
    public double calcNumber(int option) {
        double suma = 0.0; //Suma de las notas
        System.out.println("Suma de los siguientes numeros: ");
        for (Number num1 : arrNumber) { //El objeto es Nota, Recorremos el array y establecemos como nota cada datos guardado.
            System.out.print(", " + num1.num);
            suma += num1.num; //Sumamos la nota del objeto
        }
        if (option == 1) { //Devolver la media
            return suma / arrNumber.size(); //Devolvemos la nota, dividido para el tamano del array
        }
        return suma; //Devolver la suma
    }
    
    //Metodo - Mostrar la cantidad de datos
    public int showAmount(int type) {
        //type 0: Numbers; 1: People
        if (type == 1){
            return arrPeople.size(); //Devolvemos el tamano del array de Personas
        }
        
        return arrNumber.size(); //Devolvemos el tamano del array de numeros por defecto
    }
    
    //Metodo - Check Par
    public boolean checkPar(int position) {
        Number valueN = this.arrNumber.get(position);
        double intValueN = valueN.num;
        System.out.println("El numero es: " + intValueN);
        if (intValueN % 2 == 0) {
            return true; // Si el número en la posición especificada es par, devolvemos 1
        } else {
            return false; // Si el número en la posición especificada es impar, devolvemos 0
        }
    }
}
