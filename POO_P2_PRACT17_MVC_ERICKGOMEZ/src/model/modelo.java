package model;
public class modelo {
    private int valo1 = 0;
    private int valor2 = 0;
    private int tota = 0;
    
    public modelo(){}

    public int getValo1() {
        return valo1;
    }

    public void setValo1(int valo1) {
        this.valo1 = valo1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getTota() {
        return tota;
    }

    public void setTota(int tota) {
        this.tota = tota;
    }

    public void sumar() {
        this.tota = this.valo1 + this.valor2;
    }
    public void restar() {
        this.tota = this.valo1 - this.valor2;
    }
    public void multi() {
        this.tota = this.valo1 * this.valor2;
    }
    public void divi() {
        this.tota = this.valo1 / this.valor2;
    }
    
    
}
