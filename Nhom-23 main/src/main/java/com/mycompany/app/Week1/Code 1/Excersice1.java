package com.mycompany.app.week1;

public class assignment1 {
    int i;
    public static void main(String[] args) {
        assignment1 n1 = new assignment1();
        assignment1 n2 = new assignment1();
        n1.i = 2;
        n2.i = 5;
        n1.i = n2.i;
        n2.i = 10;
        System.out.println("O");
    }
}

