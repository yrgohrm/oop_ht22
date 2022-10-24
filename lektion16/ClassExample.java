import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClassExample {
    public static List<String> addRandom(List<String> data) {

        // genom Class-objektet kan vi få fram data 
        // vilket kan vara värdefullt vid debug

        System.out.println(data.getClass().getName());
        System.out.println(Arrays.toString(data.getClass().getInterfaces()));
        
        data.add("apapa");
        return data;
    }

    public static void main(String[] args) {
        addRandom(new ArrayList<>());
        addRandom(new LinkedList<>());
    }


}
