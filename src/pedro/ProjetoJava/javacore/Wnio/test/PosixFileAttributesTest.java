package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.Set;

public class PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/arquivo.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());

        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        fileAttributeView.setPermissions(permissions);
        System.out.println(fileAttributeView.readAttributes().permissions());
        //nao funciona em windows
    }
}
