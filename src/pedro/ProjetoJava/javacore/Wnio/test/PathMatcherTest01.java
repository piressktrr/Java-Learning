package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class PathMatcherTest01 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("pasta/arquivo.txt");
        matches(path1, "glob:**.txt");
    }

    public static void matches(Path path, String glob) throws IOException {
        PathMatcher pattern = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob +":"+ pattern.matches(path));
    }
}
