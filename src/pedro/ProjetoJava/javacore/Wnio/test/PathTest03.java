package pedro.ProjetoJava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("pasta/pedro");
        Path file = Paths.get("pedro/arquivo.txt");
        Path resolucao = dir.resolve("arquivo.txt");
        System.out.println(resolucao);

         Path absoluto = Paths.get("/pasta/pedro");
         Path relativo = Paths.get("dev");
         Path file2 = Paths.get("arquivo.txt");

        System.out.println(absoluto);
        System.out.println(relativo);
    }
}
