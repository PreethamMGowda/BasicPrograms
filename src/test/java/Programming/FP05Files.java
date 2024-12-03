package Programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get("file.txt");
        Files.lines(path).forEach(System.out::println);

        Files.lines(path)
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
        //to print directory
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
