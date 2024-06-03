
package com.mycompany.app;
import com.mycompany.app.Panel.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D; 

public class App extends JFrame {
    Panellayout panel;

    public App(){
        InIt();
        panel = new Panellayout();
        panel.set_visible(true);
        add(panel);
    }

    public void InIt(){
        setSize(1000,700);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.setVisible(true);
    }
}
