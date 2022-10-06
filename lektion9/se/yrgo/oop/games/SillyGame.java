package se.yrgo.oop.games;

public class SillyGame implements Game {

    private int points = 0;

    public String getName() {
        return "silly game";
    }

    public int play() {
        points++;
        return points;
    }
    
}
