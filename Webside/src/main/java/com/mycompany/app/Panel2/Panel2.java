package com.mycompany.app.Panel2;
import java.awt.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Panel2 extends JPanel {
    public Panel2(){
        setLayout(null);
        setBounds(80,0,1000-50,700);
        setVisible(false);
    }
    
@Override
public void paintComponent(Graphics g){
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;
g2d.setColor(new Color(237, 232, 245));
g2d.fillRect(0, 0, 1000-50, 700);
}
}
