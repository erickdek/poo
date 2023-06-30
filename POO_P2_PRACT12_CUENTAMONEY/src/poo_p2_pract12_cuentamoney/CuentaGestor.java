package poo_p2_pract12_cuentamoney;
import java.util.*;
/**
 *
 * @author erick
 */
public class CuentaGestor {
    private double limitMoney = 0;
    
    public CuentaGestor(){
        this.limitMoney = 0.0;
    }
    
    public void setLimitTransfer(double limit){
        this.limitMoney = limit;
        System.out.println("El limite para transferencias es de: US$" + this.getLimitTransfer());
    }
    
    public double getLimitTransfer(){
        return this.limitMoney;
    }
    
    public boolean checkTransfer(double tempMoney, double MoneyTransfer){
        if ((MoneyTransfer < tempMoney) && (MoneyTransfer <= this.limitMoney)){
            return true;
        }
        return false;
    }
}
