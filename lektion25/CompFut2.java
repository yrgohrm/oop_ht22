import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CompFut2 {
    public static void main(String[] args) {
        readAllWords("file.txt", StandardCharsets.UTF_8)
            .thenAccept(System.out::println)
            .thenRun(() -> System.out.println("Nu är det slut"));

        for (int i = 0; i < 10; i++) {
            System.out.println("hahaha");
        }

        ForkJoinPool.commonPool().awaitQuiescence(2, TimeUnit.MINUTES);
    }

    public static CompletableFuture<List<String>> readAllWords(String filename, Charset charset) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return Files.lines(Path.of(filename), charset)
                            .map(s -> s.split("\\s+"))
                            .flatMap(chars -> Arrays.stream(chars))
                            .map(str -> str.replaceAll("[.,?!]", ""))
                            .collect(Collectors.toList());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
