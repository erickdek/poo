/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.en.r3;
import Controller.*;
import Modelo.*;
/**
 *
 * @author erick
 */
public class FigurasEnR3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nuevas instancias de clase
        Modelo m1 = new Modelo();
        Page_Principal1 vis1 = new Page_Principal1();
        Controller con1 = new Controller(vis1, m1);
        
        con1.iniciar_vista();
        vis1.setVisible(true);
    }
    
}
