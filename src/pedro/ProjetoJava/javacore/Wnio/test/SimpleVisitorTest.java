package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return  FileVisitResult.CONTINUE; // continua listando até o fim da execuçao
        // lista os diretorios e clases
    }
}

public class SimpleVisitorTest {
    public static void main(String[] args) throws IOException {
        Path root = Paths .get(".");
        Files.walkFileTree(root, new listAllFiles());
    }
}
