import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Plus {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate later = today.plusDays(5);

        System.out.println(today);
        System.out.println(later);

        LocalDate muchLater = today.plusMonths(1);
        System.out.println(muchLater);

        System.out.println(today.isBefore(later));

        LocalDateTime tomorrow = LocalDateTime.now().plusDays(1).truncatedTo(ChronoUnit.HOURS);
        System.out.println(tomorrow);
    }
}
