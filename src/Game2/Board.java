/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener{
 
    private Timer timer;
    private int x,y = 10;
    
    public Board(){
        timer = new Timer(100, this);
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        this.x +=5;
        this.y +=5;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(this.x,this.y,20,20);
    }
}
