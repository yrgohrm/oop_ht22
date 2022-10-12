import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThisShouldBePunishedByDeath {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("apa.txt");
        } 
        catch (FileNotFoundException ex) {
            // this will not happen
        }

        //
    }
}
