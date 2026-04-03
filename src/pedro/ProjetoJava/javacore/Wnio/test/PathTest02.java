package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        if (Files.notExists(path)) {
            Path pastaDirectory = Files.createDirectories(path);
        } // nao lança exceçao, qnd se tem 1 diretorio

        Path subPasta = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPasta);
        Path filePath = Paths.get(subPasta.toString(), "subpasta.txt");
        if (Files.notExists(filePath)) {

            Path fileCreated = Files.createFile(filePath);
         }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "subpasta.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
