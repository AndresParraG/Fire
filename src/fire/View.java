/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fire;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author usuario
 */
public class View extends Canvas implements Runnable{
    
    BufferedImage image;
    
//    @Override
//    public void paint(Graphics g) {
//        try {
//            image = ImageIO.read(new File("src/fire/fuego.jpeg"));
//            
//        } catch (IOException e) {
//            System.out.println("ERROR");
//            
//        }
//        g.drawImage(image, 0, 0, null);
//    }
    
    @Override
    public void paint(Graphics g) {
        Fire fire = new Fire(500, 500, 1);
        
        image = fire;
        
        g.drawImage(image, 0, 0, null);
            
        
        
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
