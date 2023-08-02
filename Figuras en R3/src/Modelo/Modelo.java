/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author erick
 */
public class Modelo {
    private int r1;
    private int r2;
    private int h;
    private double vol;
    
    public Modelo(){
        
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
    
    public void calc(){
        double r1_2 = Math.pow(this.r1, 2);
        double r2_2 = Math.pow(this.r2, 2);
        this.vol = ( this.h * 3.1415 )/3 * (r1_2 + r2_2 + (this.r1 * this.r2));
    }
}
