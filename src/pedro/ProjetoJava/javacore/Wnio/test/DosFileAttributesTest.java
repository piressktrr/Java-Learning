package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;

public class DosFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/arquivo.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        DosFileAttributeView dosFileAttributes = Files.getFileAttributeView(path, DosFileAttributeView.class);

        dosFileAttributes.setHidden(true);
        System.out.println(dosFileAttributes.readAttributes().isHidden());

    }
}
