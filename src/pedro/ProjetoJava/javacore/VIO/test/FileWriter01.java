package pedro.ProjetoJava.javacore.VIO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        // file
        // fileWriter
        // bufferedWriter
         // bufferedReader

        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file);
            // fw.close(); // trabalhando com sistema operacional, por isso que tem que fechar sempre q "abrir" ou chamar
            // a classe.
            fw.write("Hello World");
            fw.flush();
            System.out.println(fw.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
