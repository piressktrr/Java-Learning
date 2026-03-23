package pedro.ProjetoJava.javacore.VIO.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("fileReader.text");
        try (FileReader fr = new FileReader(file)) {
            int c;
            while ((c=fr.read()) != -1){
                System.out.println((char)c);
            }
            int size = fr.read();
            // vai lendo posiçao por posiçao e transformando os int' de read em character e basicamente traduzir
            // o arquivo
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
