package com.mycompany.app.Week2.Code2.Excersice6;


class student{
    protected String name = "Duy";

    public void display(){
        System.out.println(name);
    }
}


public class Excersice6 {

    public static void main(String[] args){
        student std = new student();
            std.display();
            System.out.println("Compiler complete!");
    }
}
