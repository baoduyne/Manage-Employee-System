package com.mycompany.app.Panel1;
import java.awt.*;
import java.util.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class Panel1 extends JPanel {
JTextArea Text;
JScrollPane scroll;

    public Panel1(){
        setLayout(null);
        setBounds(80,0,1000-50,700);
        setVisible(false);
        Text = new JTextArea("Sản Phẩm Liên Quan\r\n" + //
                        "1.Quần ống rộng xếp eo nhún mùa Đông\r\n" + //
                        "₫151.000\r\n" + //
                        "2.Quần Kẻ Suông Dralball a10 Ống Rộng Thoải Mái, Quần Dài Nữ Đũi Thô Lưng Cao Cho Nàng Diện Hè Thời Trang Hàn Quốc 2024\r\n" + //
                        "₫60.000\r\n" + //
                        "3.Quần Ống Rộng 2 Khuy Cap Cao 7cm Tôn Dáng Lên From Xinh MA16\r\n" + //
                        "₫69.000\r\n" + //
                        "4.Quần lụa họa tiết freesize\r\n" + //
                        "₫72.000\r\n" + //
                        "5.[Mã FAHOLIDAY giảm đến 50k đơn từ 99k] Quần đũi suông dáng lửng dài siêu mát nhẹ\r\n" + //
                        "₫69.000\r\n" + //
                        "6.Nữ Chân Thẳng Cao Cấp Quần Cắt Chống Nắng Quần Thể Thao Ràng Buộc Chân Mỏng Phong Cách Thường Ngày Giải Trí Quần\r\n" + //
                        "₫95.880\r\n" + //
                        "7.Quần Đũi Nữ Cạp Chun, Quần Baggy Đũi Lưng Thun Chất Đũi Nhẹ Mát Bigsize BGD\r\n" + //
                        "₫79.000\r\n" + //
                        "8.Quần Loe Cạp Cao Đứng Form Wanes Bootcut Flared Trousers In Black\r\n" + //
                        "₫389.000\r\n" + //
                        "9.[QTL4] Quần Tây Ống Suông Form Dài Chuẩn LIN - BST23, quần tây công sở cao cấp\r\n" + //
                        "₫336.000\r\n" + //
                        "10.Quần KaKi Nữ Dây Rút Bo Gấu Ống Rộng Phong Cách Retro Cho Nữ MA403\r\n" + //
                        "₫35.000\r\n" + //
                        "11.Quần kẻ suông nhiều màu phong cách ulzzang HARIQUEEN\r\n" + //
                        "₫35.000\r\n" + //
                        "12.Quần Dài Ống Suông Kẻ Caro Phối Cạp Trắng Mẫu HOT V58D\r\n" + //
                        "₫83.000\r\n" + //
                        "13.Quần Ống Rộng Jogger Nữ Trơn BOM HOUSE 3 Màu Ulzzang Unisex\r\n" + //
                        "₫99.000\r\n" + //
                        "14.Quần Baggy 2 Cúc Lệch Đẹp_mã 168\r\n" + //
                        "₫80.500\r\n" + //
                        "15.Quần ống rộng dập ly lưng chun hàng đẹp, quần mặc nhà nữ mát nhẹ thoải mái\r\n" + //
                        "₫69.000");
        Text.setFont(new Font(null,Font.BOLD, 12)); 
        scroll = new JScrollPane(Text);
        scroll.setEnabled(false);
        scroll.setBounds(35,270,800,500);
        //add(scroll);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Toolkit t = getToolkit();
        Image img = t.getImage("heard1.png");

        g2d.setColor(new Color(237, 232, 245));
        g2d.fillRect(0, 0, 1000-50, 700);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.BOLD, 25));   
        g2d.drawString("DashBoard", 30, 60);


        g2d.setColor(new Color(112, 145, 230));
        g2d.fillRoundRect(30, 100, 200, 130, 30, 30);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.BOLD, 23));   
        g2d.drawString("13K", 55, 160);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.ITALIC, 16));   
        g2d.drawString("Visitors", 55, 185);
        g2d.drawImage(img,150,140,45,45, this);
        

        g2d.setColor(new Color(112, 145, 230));
        g2d.fillRoundRect(30+200+100 , 100, 200, 130, 30, 30);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.BOLD, 23));   
        g2d.drawString("1512", 55 + 200 + 100, 160);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.ITALIC, 16));   
        g2d.drawString("Employee", 55 + 200 + 100, 185);   
        img = t .getImage("center.png");
        g2d.drawImage(img,55 + 30 + 25 + 200 + 100 + 50,140,50,50, this);



        g2d.setColor(new Color(112, 145, 230));
        g2d.fillRoundRect(30+200+100+200+100 , 100, 200, 130, 30, 30);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.BOLD, 23));   
        g2d.drawString("1", 55 + 200 + 100 + 55 + 200 + 50 , 160);
        g2d.setColor(Color.BLACK);g2d.setFont(new Font(null,Font.ITALIC, 16));   
        g2d.drawString("Missing", 55 + 200 + 100 + 55 + 200 + 50, 185);   
        img = t .getImage("add.png");
        g2d.drawImage(img,55 + 30 + 25 + 200 + 100 + 50 + 150 + 135 ,140,50,50, this);

       // img = t.getImage("line-chart.png");
       // g2d.drawImage(img, 30 , 300 ,300,300, this);
      
    }
}
