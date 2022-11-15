import java.time.*;

public class DateEx2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2022, 1, 31);
        LocalDate inAMonth = today.plusMonths(1);
        LocalDate maybeInAMonth = today.plusDays(30);
        System.out.println(inAMonth);
        System.out.println(maybeInAMonth);
    }
}
