package com.mycompany.app.week3.code1;
import java.util.Random;

public class DisruptLecture {
    public static void main(String[] args) {
        String[] disruptions = {
            "Screaming loudly!",
            "Playing loud music!",
            "Throwing confetti everywhere!",
            "Releasing balloons!",
            "Dancing wildly!",
            "Blowing air horns!",
            "Shining bright lights!"
        };

        Random random = new Random();

        System.out.println("Starting the lecture disruption...");
        for (int i = 0; i < disruptions.length; i++) {

            int randomIndex = random.nextInt(disruptions.length);
            String disruption = disruptions[randomIndex];

            System.out.println("Disruption " + (i+1) + ": " + disruption);

            try {
                Thread.sleep(random.nextInt(3000) + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Lecture disruption complete!");
    }
}

