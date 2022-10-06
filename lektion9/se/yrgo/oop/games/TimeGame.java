package se.yrgo.oop.games;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TimeGame implements Game {

    private Scanner nisse;

    public TimeGame(Scanner kalle) {
        this.nisse = kalle;
    }

    public String getName() {
        return "time game";
    }

    public int play() {
        int targetSeconds = 5 + ThreadLocalRandom.current().nextInt(6);

        System.out.printf("Tryck enter om %d sekunder!", targetSeconds);
        long startTime = System.currentTimeMillis();
        nisse.nextLine();
        long endTime = System.currentTimeMillis();

        long timeSeconds = (endTime - startTime) / 1000;

        int distance = (int)Math.abs(targetSeconds - timeSeconds);

        System.out.printf("Du var %d sekunder ifrån.%n", distance);

        if (distance < 5) {
            return 6 - distance;
        }

        return 0;
    }
    
    public void sayWohoo() {
        System.out.println("wohooo!!!!");
    }
}
