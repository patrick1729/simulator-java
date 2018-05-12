/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.components;

/**
 * @author Prateek Mishra
 */

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class MainClass extends JPanel {

 /* public void paint(Graphics g) {
    g.drawArc(50,50,240,240,0,360);
    g.drawArc(70, 70, 200, 200, 0, 360);
    g.drawArc(90, 90, 160, 160, 0, 360);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MainClass());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,400);
    frame.setVisible(true);
  }*/


    public static void main(String[] args) {
        Timer timer = new Timer(1000, new MyTimerActionListener());
        timer.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
        timer.stop();
    }

}

class MyTimerActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        System.out.println("asdf");

    }
}