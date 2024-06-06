package com.mycompany.app.Week2.Code2.Excersice2;

import java.util.*;

public class Excersice2 {
    public static void main(String[] args){
    Student std = new Student();
        std.change_id();
 
        if(std.get() == 1){
            System.out.println("System run complete!");
        }
        else{
            System.out.println("Error value!");
        }
    }

    
}