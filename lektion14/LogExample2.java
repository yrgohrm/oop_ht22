import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample2 {
    static final Logger logger = LoggerFactory.getLogger(LogExample2.class);

    public static void main(String[] args) {
        try {
            int[] data = new int[1];
            data[33] = 2;
        }
        catch (RuntimeException ex) {
            logger.error("Saker sket sig", ex);
        }
    }
}
