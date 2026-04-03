package pedro.ProjetoJava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorio = "pasta/pedro";
        String arquivo = "../../arquivo1.txt";
        Path path = Paths.get(diretorio, arquivo);
        System.out.println(path);
    }
}
