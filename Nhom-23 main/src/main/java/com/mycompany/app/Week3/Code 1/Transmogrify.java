package com.mycompany.app.week3.code1;
class Actor {
    void act() {
        System.out.println("Actor acting");
    }
}

class HappyActor extends Actor {
 
    void act() {
        System.out.println("HappyActor acting");
    }
}

class SadActor extends Actor {
  
    void act() {
        System.out.println("SadActor acting");
    }
}

class Stage {
    private Actor actor = new HappyActor(); 
    void change() {
        actor = new SadActor(); 
    }

    void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage(); 
        stage.performPlay(); 
        stage.change();
        stage.performPlay(); 
    }
}
