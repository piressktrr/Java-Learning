package pedro.ProjetoJava.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path path = Paths.get("src/pedro/ProjetoJava/javacore");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            stream.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
