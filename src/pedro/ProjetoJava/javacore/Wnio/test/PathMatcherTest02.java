package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listFilesDetermined extends SimpleFileVisitor<Path> {


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java") || file.getFileName().toString().endsWith(".class")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path allArchives = Paths.get(".");

        System.out.println("todos acima são java ou class");
        String glob = "glob:*[test]";
        acharTestName(allArchives, glob);
    }

    public static void acharTestName(Path path, String glob) throws IOException  {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}");
        if (matcher.matches(path)) {
            System.out.println(path.getFileName());
        }


    }
}
