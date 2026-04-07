package pedro.ProjetoJava.javacore.Wnio.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutPutStreamTest  {
    public static void main(String[] args) throws IOException {
        Path arquivoZip = Paths.get("pasta/renamed_archived.zip");
        Path arquivosParaZipar = Paths.get("pasta/pedro");
        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) throws IOException {
        try(ZipOutputStream out = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()))) {
            DirectoryStream<Path> stream = Files.newDirectoryStream(arquivosParaZipar);
            for (Path path : stream) {
                ZipEntry entry = new ZipEntry(path.getFileName().toString());
                out.putNextEntry(entry);
                Files.copy(path, out);
                out.closeEntry();
            }
            System.out.println("a");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
