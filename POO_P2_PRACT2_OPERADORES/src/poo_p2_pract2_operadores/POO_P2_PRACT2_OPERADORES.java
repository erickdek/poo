package poo_p2_pract2_operadores;
public class POO_P2_PRACT2_OPERADORES {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int suma = b + a;
        int resta = a - b;
        int multi = a * b;
        float divi = a / b;
        int resi = a % b;
        
        System.out.print("Primer numero: ");
        System.out.println(a);
        System.out.print("Primer numero +1: ");
        System.out.println(++a );
        System.out.print("Segundo numero: ");
        System.out.println(b);
        System.out.print("Segundo numero +1: ");
        System.out.println(++b);
        System.out.println ("==========================");
        System.out.print("Suma de los numeros es: ");
        System.out.println( suma );
        System.out.println ("==========================");
        System.out.print("Resta de los numeros es: ");
        System.out.println( resta);
        System.out.println ("==========================");
        System.out.print("Multi de los numeros es: ");
        System.out.println( multi );
        System.out.println ("==========================");
        System.out.print("Divi de los numeros es: ");
        System.out.println( divi );
        System.out.println ("==========================");
        System.out.print("Residuo de los numeros es: ");
        System.out.println( resi );
    }
    
}
