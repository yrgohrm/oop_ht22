public class Scope {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        // int j fungerar ej då j från ovan är i scope
        // detta är inte snyggt!
        j = 0;
        while (j < 100) {
            System.out.println(j);
            j++;
        }


        
    }
}
