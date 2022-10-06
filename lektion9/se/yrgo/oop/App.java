package se.yrgo.oop;

import java.util.List;
import java.util.Scanner;
import se.yrgo.oop.games.Game;
import se.yrgo.oop.games.SillyGame;
import se.yrgo.oop.games.TimeGame;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Game> games = List.of(new SillyGame(), new TimeGame(input));
        
        
        Game game = games.get(1);

        int highscore = Integer.MIN_VALUE;

        System.out.printf("Du spelar nu: %s%n", game.getName());

        while (true) {
            int score = game.play();

            if (score > highscore) {
                highscore = score;
            }

            System.out.println("Vill du spela igen? (j/n)");
            String answer = input.nextLine();
            if ("n".equals(answer)) {
                break;
            }
        }

        System.out.printf("Highscore: %d%n", highscore);
    }
}