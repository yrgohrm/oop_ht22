import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Artist rickAstley = new Artist("Rick Astley");

        Song nggyu = new Song("Never gonna give you up");
        Song wyns = new Song("Whenever You Need Somebody");

        Album rickWhenever = new Album("Whenever You Need Somebody", Genre.POP,
                LocalDate.of(1987, 1, 1), List.of(nggyu, wyns), List.of(rickAstley));

        List<Album> albums = new ArrayList<>();
        albums.add(rickWhenever);
        for (int i = 0; i < 30; i++) {
            albums.add(randomAlbum());
        }

        // var dateComp = Comparator.comparing(Album::getReleaseDate).reversed();
        // var popAlbums = albums.stream().filter(a -> a.getGenre() ==
        // Genre.POP).sorted(dateComp).collect(Collectors.toList());

        var comp = askForSortMethod();
        var popAlbums = albums.stream().filter(a -> a.getGenre() == Genre.POP).sorted(comp)
                .collect(Collectors.toList());

        // for (Album a : popAlbums) {
        // System.out.printf("%s - %s (%s)%n", a.getName(), a.getReleaseDate(), a.getGenre());
        // }

        // System.out.println("------");

        // var nameComp = Comparator.comparing((Album a) -> a.getName().toLowerCase());
        // Collections.sort(popAlbums, nameComp);

        for (Album a : popAlbums) {
            System.out.printf("%s - %s (%s)%n", a.getName(), a.getReleaseDate(), a.getGenre());
        }
    }

    private static Comparator<Album> askForSortMethod() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("How do you want to sort the albums? [date/name/count]");
            String answer = input.nextLine();

            switch (answer.trim()) {
                case "name":
                    return Comparator.comparing(a -> a.getName().toLowerCase());
                case "count":
                    return Comparator.comparingInt(a -> a.getSongs().size());
                default:
                    return Comparator.comparing(Album::getReleaseDate);
            }
        }
    }

    private static Artist randomArtist() {
        List<String> firstNames = List.of("Nisse", "Lena", "6pac", "Bengt", "Prince", "Jamie");
        List<String> lastNames = List.of("Eriksson", "The Artist", "Smith", "Love");

        String firstName = firstNames.get(ThreadLocalRandom.current().nextInt(firstNames.size()));
        String lastName = lastNames.get(ThreadLocalRandom.current().nextInt(lastNames.size()));

        return new Artist(firstName + " " + lastName);
    }

    private static Song randomSong() {


        return new Song(randomTitle());
    }

    private static Album randomAlbum() {
        String title = randomTitle();
        Genre genre = Genre.values()[ThreadLocalRandom.current().nextInt(Genre.values().length)];
        List<Artist> artists = List.of(randomArtist());
        List<Song> songs = List.of(randomSong(), randomSong(), randomSong());
        int year = ThreadLocalRandom.current().nextInt(80) + 1940;
        int month = ThreadLocalRandom.current().nextInt(12) + 1;
        LocalDate date = LocalDate.of(year, month, 1);

        return new Album(title, genre, date, songs, artists);
    }

    private static String randomTitle() {
        String wordList =
                "Never gonna give you up Whenever You Need Somebody Might Need Somebodey Strangelove and a on it you";
        String[] words = wordList.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(" ");
            sb.append(words[ThreadLocalRandom.current().nextInt(words.length)]);
        }

        return sb.toString().trim();
    }
}
