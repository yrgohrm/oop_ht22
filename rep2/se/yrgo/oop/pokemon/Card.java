package se.yrgo.oop.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {
    // to make indexing into our cost arrays define
    // some constants. This is "ok" but there are better
    // and more safe ways to do it (but requires more code)
    public static final int ELECTRIC = 0;
    public static final int GRASS = 1;
    public static final int WATER = 2;

    private String name;
    private int[] cost;
    private int type;
    private int hp;
    private List<Move> moves;

    public Card(String name, int type, int electric, int grass, int water, int hp,
            List<Move> moves) {
        this.name = name;

        // arrays are reference objects and we must create
        // them with new, otherwise this.cost would be null
        this.cost = new int[3];

        this.cost[Card.ELECTRIC] = electric;
        this.cost[Card.GRASS] = grass;
        this.cost[Card.WATER] = water;

        this.type = type;
        this.hp = hp;
        this.moves = new ArrayList<>(moves);
    }

    public String getName() {
        return name;
    }

    public int getCost(int type) {
        return cost[type];
    }

    public int getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public List<Move> getMoves() {
        return Collections.unmodifiableList(moves);
    }

    @Override
    public String toString() {
        return "Card [name=" + name + ", cost=" + Arrays.toString(cost) + ", type=" + typeToString(type) + ", hp="
                + hp + ", moves=" + moves + "]";
    }

    public static String typeToString(int type) {
        switch (type) {
            case ELECTRIC:
                return "electric";
            case GRASS:
                return "grass";
            case WATER:
                return "water";
            default:
                return "unknown";
        }
    }
}
