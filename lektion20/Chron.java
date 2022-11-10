import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.HijrahChronology;

public class Chron {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        ChronoLocalDate hd = HijrahChronology.INSTANCE.date(now);
        System.out.println(hd);
    }
}
