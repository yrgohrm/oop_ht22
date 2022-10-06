package se.yrgo.oop.games;

public interface Game {
    String getName();

    /**
     * Play the game, return the player's score
     * 
     * @return the score
     */
    int play();
}
