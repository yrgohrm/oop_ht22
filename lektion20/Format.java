import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Format {
    public static void main(String[] args) {
        String someDateText = "2019-10-03T12:22:00";
        
        LocalDateTime ldt = LocalDateTime.parse(someDateText, DateTimeFormatter.ISO_DATE_TIME);
        
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("hh:mm dd/MM -yy");
        
        String output = ldt.format(outputFormat);
        System.out.println(output);

        DateTimeFormatter niceFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(ldt.format(niceFormat));
    }
}
