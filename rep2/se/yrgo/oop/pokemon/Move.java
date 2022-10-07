package se.yrgo.oop.pokemon;

public class Move {
    private int[] cost;
    private String description;

    public Move(int electric, int grass, int water, String description) {
        this.cost = new int[3];

        this.cost[Card.ELECTRIC] = electric;
        this.cost[Card.GRASS] = grass;
        this.cost[Card.WATER] = water;

        this.description = description;
    }

    public int getCost(int type) {
        return cost[type];
    }

    public String getDescription() {
        return description;
    }
}
