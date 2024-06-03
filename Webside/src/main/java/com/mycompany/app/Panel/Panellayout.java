package com.mycompany.app.Panel;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
import com.mycompany.app.Panel1.Panel1;
import com.mycompany.app.Panel2.Panel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


public class Panellayout extends JPanel {
    Panel1 panel1; Panel2 panel2;
Rectangle rec,rec1,rec2,rec3; int current1 = 0; int current2 = 0 ; int current3 = 0; int current = 0; int current_Y = 0;
Image img1,img2,img3,img4;
JButton Button1,Button2,Button3;
Toolkit t;


    public Panellayout(){
        setSize(1000,700);
        setLayout(null);

        rec = new Rectangle();rec1 = new Rectangle();panel1 = new Panel1();panel2 = new Panel2();panel1.setVisible(false);panel2.setVisible(false); 
        t = Toolkit.getDefaultToolkit();
        img1 = t.getImage("home.png");
        img2 = t.getImage("user.png");
        img3 = t.getImage("edit.png");
        img4 = t.getImage("settings.png");   

        Button1 = new JButton();Button1.setBounds(0,0,80,100);
        Button1.addActionListener(new Button1action());
        Button1.setBackground(null);
        Button1.setOpaque(false);
        Button1.setLayout(null);
        Button1.setContentAreaFilled(false);
        Button1.setBorder(null);
        Button1.addMouseListener(new mouseButton1());

        Button2 = new JButton();Button2.setBounds(0,100,80,100);
        Button2.addActionListener(new Button2action());
        Button2.setBackground(null);
        Button2.setOpaque(false);
        Button2.setLayout(null);
        Button2.setContentAreaFilled(false);
        Button2.setBorder(null);
        Button2.addMouseListener(new mouseButton1());

        Button3 = new JButton();Button3.setBounds(0,200,80,100);
        Button3.addActionListener(new Button1action());
        Button3.setBackground(null);
        Button3.setOpaque(false);
        Button3.setLayout(null);
        Button3.setContentAreaFilled(false);
        Button3.setBorder(null);
        Button3.addMouseListener(new mouseButton1());

        add(Button1); add(Button2); add(Button3);
        add(panel1);add(panel2);
    }

    public void set_visible(boolean bol){
        setVisible(bol);
    }

    public class Button1action implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(current1 == 0 ){
                current1 = 1;
                t = Toolkit.getDefaultToolkit();
                panel1.setVisible(true);
                panel2.setVisible(false);
                current2=0;
                refresh_windown();
            }
           /*  else{
                current1 = 0;
                t = Toolkit.getDefaultToolkit();
                img1 = t.getImage("home.png");
                panel1.setVisible(false);
                refresh_windown();
                
            }*/
        }
    }
    public class Button2action implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(current2 == 0 ){
                current2 = 1;
                panel2.setVisible(true);
                panel1.setVisible(false);
                current1 = 0;
                refresh_windown();
            }
         /*   else{
                current2 = 0;
                panel2.setVisible(false);
                refresh_windown();
                
            }*/
        }
    }

    public class mouseButton1 implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
        }
 
        public void mousePressed(MouseEvent e) {
        }
 
        public void mouseReleased(MouseEvent e) {
        }
 
        public void mouseEntered(MouseEvent e) {
            
            int Y = e.getYOnScreen();
            if(Y<= 280){

                current = 1;
                current_Y = Button1.getY();
            }
            else if(Y>280 && Y<= 380){
                
                current = 1;
                current_Y = Button2.getY();
                
            }
            else if (Y > 380 && Y<= 480){
            
                current = 1;
                current_Y = Button3.getY();
            }
            refresh_windown();
        }
 
        public void mouseExited(MouseEvent e) {
            current = 0;

            refresh_windown();
        }
    }

    public void refresh_windown(){
        setVisible(false);
        setVisible(true);
    }

@Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(61, 82, 160));g2d.fill(rec);
        rec.setBounds(0, 0, 1000, 700); rec1.setBounds(0,current_Y,80,100);
       // System.out.println(current_Y);

         if(current == 1){
            g2d.setColor(new Color(112, 145, 230));
            g2d.fill(rec1);
        }
        else{
            g2d.setColor(new Color(61, 82, 160));
            g2d.fill(rec1);
        }

///////
        if(current1 == 0){
            img1 = t.getImage("home.png");
            g2d.drawImage(img1, 20,30,35,35 , this);
        }
        else{
            img1 = t.getImage("home1.png");
            g2d.drawImage(img1, 20,30,35,35 , this);

        }
        if(current2 == 0){
            img2 = t.getImage("user.png");
            g2d.drawImage(img2,20, 130 ,35,35  ,this);
        }
        else{
            img2 = t.getImage("user1.png");
            g2d.drawImage(img2,20, 130 ,35,35  ,this);
        }

        g2d.drawImage(img3,20, 120 + 110 ,35,35  ,this);
        g2d.drawImage(img4,15, 600,45,45  ,this);

    }
}


