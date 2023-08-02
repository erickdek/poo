/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import figuras.en.r3.*;
import Modelo.*;
/**
 *
 * @author erick
 */
public class Controller implements ActionListener{
    private Page_Principal1 v1;
    private Modelo m1;
    
    
    public Controller(Page_Principal1 vista, Modelo modelo){
        this.v1 = vista;
        this.m1 = modelo;
        this.v1.btn_Calc.addActionListener(this);
        this.v1.btn_Delete.addActionListener(this);
    }
    
    public void iniciar_vista(){
        v1.setTitle("CALC");
        v1.v_Volumen.setText("");
        
        v1.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int R2 = (Integer) v1.v_R2.getValue();
        int R1 = (Integer) v1.v_R1.getValue();
        int H = (Integer) v1.v_H.getValue();
        m1.setR1( R1 );
        m1.setR2(R2 );
        m1.setH(H);
        
        if(e.getSource()==v1.btn_Calc){
            m1.calc();
            v1.v_Volumen.setText(Double.toString(m1.getVol()));
        } else if(e.getSource()==v1.btn_Delete){
            v1.v_Volumen.setText("");
        }
        
    }
}
