import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BestParse {
    public static void main(String[] args) {
        var fmt = new DateTimeFormatterBuilder()
                .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("dd/MM -yy"))
                .appendOptional(DateTimeFormatter.ofPattern("d/MM -yy"))
                .appendOptional(DateTimeFormatter.ofPattern("d/M -yy"))
                .toFormatter();

        try (Scanner input = new Scanner(System.in)) {
            String dateText = input.nextLine();

            var time = LocalDate.parse(dateText, fmt);
            System.out.println(time);
        }
        catch (DateTimeParseException ex) {
            System.out.println("Not a valid date!");
        }
    }
}
