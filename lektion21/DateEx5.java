import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

public class DateEx5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Birth date (yyyy-mm-dd):");
            String dateString = input.nextLine();

            DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;
            LocalDate date = LocalDate.parse(dateString, fmt);

            long days = ChronoUnit.DAYS.between(date, LocalDate.now());
            System.out.println(days);
        }
    }
}
