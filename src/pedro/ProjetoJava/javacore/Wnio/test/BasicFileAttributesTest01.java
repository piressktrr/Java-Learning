package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        // basicfileattributes, dosfileattributes, posixfileattributes
        LocalDateTime now = LocalDateTime.now();
        File file = new File("pasta/arquivo.txt");
        file.setLastModified(now.toInstant(ZoneOffset.UTC).toEpochMilli()); // nao eh confiavel

        Path path = Paths.get("pasta/arquivo.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(now.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path) );
    }
}
