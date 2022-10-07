package se.yrgo.oop.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Card {
    public static final int ELECTRIC = 0;
    public static final int GRASS = 1;
    public static final int WATER = 2;

    private String name;
    private int[] cost;
    private int type;
    private int hp;
    private List<Move> moves;

    public Card(String name, int type, int electric, int grass, int water, int hp, List<Move> moves) {
        this.name = name;
    
        this.cost = new int[3];

        this.cost[Card.ELECTRIC] = electric;
        this.cost[Card.GRASS] = grass;
        this.cost[Card.WATER] = water;

        this.type = type;
        this.hp = hp;
        this.moves = new ArrayList<>(moves);
    }

    
}
