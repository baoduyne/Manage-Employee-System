package com.mycompany.app.Week3.Code2.Task1.Excersice17;

public class Cycle {
    public static void main(String[] args){
    //Upcast
         Cycle[] c = {
            new Cycle(),
            new Bicycle(),
            new Unicycle(),
            new Tricycle()
        };

       /*c[1].balance();
        c[2].balance();
        c[3].balance();*/ //Error!


    //Dowcast
        Cycle Cy1  = new Bicycle();

            Bicycle Bi = (Bicycle) Cy1;
        
                Bi.balance();
        
        Cycle Cy2 = new Unicycle();

            Unicycle Uni = (Unicycle) Cy2;

                Uni.balance();

        System.out.println("Compiler complete!");
    }
}
