import java.io.*;
import java.nio.file.*;

public class AoC1 {
    // hur många kalorier bär alven som bär flest kalorier?
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(args[0]))) {
            int highestTotal = 0;
            int highestElf = 0;

            int totalCalories = 0;
            int elf = 1;

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    // nästa rad är en ny alv

                    if (highestTotal < totalCalories) {
                        highestTotal = totalCalories;
                        highestElf = elf;
                    }

                    totalCalories = 0;
                    elf++;
                }
                else {
                    // någonstans i en och samma alv
                    totalCalories += Integer.parseInt(line);
                }
            }

            if (highestTotal < totalCalories) {
                highestTotal = totalCalories;
                highestElf = elf;
            }

            System.out.printf("Alv %d har %d kalorier.%n", highestElf, highestTotal);
        }
    }
}
