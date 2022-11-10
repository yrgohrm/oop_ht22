import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantZone {
    public static void main(String[] args) {
        Instant today = Instant.now();

        ZonedDateTime alsoToday = today.atZone(ZoneId.systemDefault());

        System.out.println(today);
        System.out.println(alsoToday);
    }
}
