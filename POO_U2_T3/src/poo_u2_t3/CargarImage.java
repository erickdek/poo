package poo_u2_t3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class CargarImage extends JPanel{
    //Atributos de la clase Image
    BufferedImage image;
    Image escala;
     
    //Metodo que carga la imagen
    public void load(String ubicacion, int w, int h){
        try{
            image = ImageIO.read(new File(ubicacion));
            escala = image.getScaledInstance(w,h, Image.SCALE_DEFAULT);
        }catch(IOException e){
            System.out.println(e);
        }        
    }
    
    //Sobreescritura del metodo para poder imprimir en pantalla las imagenes   
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        g.drawImage(escala, image.getWidth(this), 0, this);
    }
}
