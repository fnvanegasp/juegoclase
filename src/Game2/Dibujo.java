/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;

import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class Dibujo extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(10, 10, 20, 20);
        
    }
}
