import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BadLogExample {
    static final Logger logger = LoggerFactory.getLogger(BadLogExample.class);

    public static void main(String[] args) {
        try {
            int sum = sum(null);
            System.out.println(sum);
        }
        catch (IllegalArgumentException ex) {
            logger.error("ojojoj", ex);
        }
    }

    public static int sum(int[] data) {
        try {
            if (data == null) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex) {
            // never just log and rethrow!
            logger.error("ajajajaj", ex);
            throw ex;
        }

        int sum = 0;
        for (int v : data) {
            sum += v;
        }
        return sum;
    }
}
