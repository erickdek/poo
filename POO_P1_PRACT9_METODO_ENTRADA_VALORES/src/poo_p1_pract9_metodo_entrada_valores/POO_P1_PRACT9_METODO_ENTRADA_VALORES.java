package poo_p1_pract9_metodo_entrada_valores;
public class POO_P1_PRACT9_METODO_ENTRADA_VALORES {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        Calc.set_nums();
        Calc.show_result(Calc.sum());
        Calc.show_result(Calc.rest());
        Calc.show_result(Calc.multi());
        Calc.show_result(Calc.divi());
    }
    
}
