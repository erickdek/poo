package poo_p1_pract8_operaciones;
import javax.swing.JOptionPane; //Importar

public class POO_P1_PRACT8_OPERACIONES {
    public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        Calculadora Calc = new Calculadora();
        Calc.resultados(Calc.sumar(n1, n2));
        Calc.resultados(Calc.restar(n1, n2));
        Calc.resultados(Calc.multiplicar(n1, n2));
        Calc.resultados(Calc.dividir(n1, n2));
    }
}
