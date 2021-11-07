/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fire;

import javax.swing.*;

/**
 *
 * @author usuario
 */
public class Task extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Task frame = new Task();
        frame.add(new View());
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
