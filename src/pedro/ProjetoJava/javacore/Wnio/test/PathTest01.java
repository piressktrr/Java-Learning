package pedro.ProjetoJava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path pathT = Paths.get("D:\\javateste\\javateste\\pasta\\arquivo.txt");
        System.out.println(pathT.toString());
    }
}
