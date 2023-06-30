/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_test_imageterminal;
import asciiPanel.AsciiPanel;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author erick
 */
public class POO_TEST_IMAGETERMINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una ventana de terminal
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // Cargar la imagen desde un archivo
        ImageIcon imageIcon = new ImageIcon("ruta_de_la_imagen.jpg");
        Image image = imageIcon.getImage();

        // Crear un componente AsciiPanel y establecer la imagen como su fondo
        AsciiPanel asciiPanel = new AsciiPanel(image);
        frame.getContentPane().add(asciiPanel, BorderLayout.CENTER);

        // Ajustar el tamaño de la ventana según la imagen
        frame.pack();
        frame.setVisible(true);
    }
    
}
