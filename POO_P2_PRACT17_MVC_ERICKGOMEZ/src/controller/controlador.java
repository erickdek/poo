package controller;
import java.awt.event.*;
import view.vista;
import model.modelo;

public class controlador implements ActionListener {
    private vista vista;
    private modelo modelo;
    
    public controlador(vista vista, modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnResta.addActionListener(this);
        this.vista.btnMulti.addActionListener(this);
        this.vista.btnDivi.addActionListener(this);
        
    }
        
    public void iniciar_vista(){
        vista.setTitle("Demo MVC - Erick");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("ACCION PREVENIDA");
        modelo.setValo1(Integer.parseInt(vista.num1.getText()));
        modelo.setValor2(Integer.parseInt(vista.num2.getText()));
        if (e.getSource() == vista.btnSumar){
            modelo.sumar();
            System.out.print("SUMA :" + modelo.getTota());
        }
        if (e.getSource() == vista.btnResta){
            modelo.restar();
            System.out.print("RESTA :" + modelo.getTota());
        }
        if (e.getSource() == vista.btnMulti){
            modelo.multi();
            System.out.print("MULTI :" + modelo.getTota());
        }
        if (e.getSource() == vista.btnDivi){
            modelo.divi();
            System.out.print("DIVI :" + modelo.getTota());
        }
        vista.sumtotal.setText(String.valueOf(modelo.getTota()));
        System.out.print("CAMBIO DE TEXTO");
    }
}
