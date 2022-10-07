package se.yrgo.oop.pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // we need to have a list of moves to be able to send
        // it to the constructor for Card
        List<Move> pikachuMoves = List.of(
            new Move(1, 0, 0, "Meal Time do stuff"),
            new Move(2, 0, 0, "Gnaw ...")
        );

        Card pikachu = new Card("Pikachu", Card.ELECTRIC, 1, 0, 0, 60, pikachuMoves);

        List<Move> sniveyMoves = List.of(
            new Move(0, 1, 0, "Mesa sig"),
            new Move(0, 2, 0, "?????")
        );

        Card snivey = new Card("Snivey", Card.GRASS, 0, 1, 0, 60, sniveyMoves);
        
        // we use arraylist since we might want to add more cards to our deck later
        List<Card> deck = new ArrayList<>();
        deck.add(pikachu);
        deck.add(snivey);

        Collections.shuffle(deck);

        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
