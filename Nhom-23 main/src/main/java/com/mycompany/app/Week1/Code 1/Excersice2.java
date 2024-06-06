package com.mycompany.app.week1;

public class assignment2 {
    int i;
    public static void main(String[] args) {
        assignment2 n1 = new assignment2();
        assignment2 n2 = new assignment2();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        n2.i = 10;
        n1.i = 20;
        System.out.println("O");

    }
}
