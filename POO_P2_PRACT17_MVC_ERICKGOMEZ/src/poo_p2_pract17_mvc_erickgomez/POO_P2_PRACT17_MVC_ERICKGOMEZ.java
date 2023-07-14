package poo_p2_pract17_mvc_erickgomez;
import controller.controlador;
import view.vista;
import model.modelo;

public class POO_P2_PRACT17_MVC_ERICKGOMEZ {
    public static void main(String[] args){
        
            modelo modelo = new modelo();
            vista vista = new vista();
            controlador controlador = new controlador(vista, modelo);
            controlador.iniciar_vista();
            
            vista.setVisible(true);
    }
    
}
