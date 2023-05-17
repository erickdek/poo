package poo_p1_pract5_random_numbers;
public class POO_P1_PRACT5_RANDOM_NUMBERS {
    public static void main(String[] args) {
        int min = 10;
        int max = 60;
        double number;
        
        //Generar un número entre 10 y 60
        number = (Math.random() * (max - min))+10;
        
        //Numero aleatorio
        System.out.println(Math.random());
        //Mostrar los datos de la variable number.
        System.out.println(number);
    }
    
}
