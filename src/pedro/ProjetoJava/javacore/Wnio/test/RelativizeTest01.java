package pedro.ProjetoJava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz); // mostra como faz pra chegar nesse diretorio de clazz, mostra
        // aonde ele esta
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        System.out.println(absoluto1.relativize(absoluto2));
    }
}
