package poo_p2_pract12_cuentamoney;
import java.util.*;
/**
 *
 * @author erick
 */
public class POO_P2_PRACT12_CUENTAMONEY {
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1 = new Cuenta("Felipao", "Gonzales");
        c1.showSaldo();
        c1.newRecarga(10200.55);
        c1.newTransfer(1200);
        c1.setLimitTransfer(700);
        c1.newTransfer(6000);
        c1.newTransfer(400);
        c1.showAccount();
    }
}
