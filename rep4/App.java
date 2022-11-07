import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        Artist rickAstley = new Artist("Rick Astley");

        Song nggyu = new Song("Never gonna give you up");
        Song wyns = new Song("Whenever You Need Somebody");

        Album rickWhenever = new Album("Whenever You Need Somebody", Genre.POP, LocalDate.of(1987, 1, 1),
                List.of(nggyu, wyns), List.of(rickAstley));



        List<Album> albums = new ArrayList<>();
        albums.add(rickWhenever);
        for (int i = 0; i < 10; i++) {
            albums.add(randomAlbum());
        }


        System.out.println(albums);
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
        LocalDate date = LocalDate.now();

        return new Album(title, genre, date, songs, artists);
    }

    private static String randomTitle() {
        String wordList = "Never gonna give you up Whenever You Need Somebody Might Need Somebodey Strangelove and a on it you";
        String[] words = wordList.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(" ");
            sb.append(words[ThreadLocalRandom.current().nextInt(words.length)]);
        }

        return sb.toString().trim();
    }
}
