package pedro.ProjetoJava.javacore.VIO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) {
        // file
        // fileWriter
        // bufferedWriter
         // bufferedReader

        File file = new File("fileBuffered.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World");
            bw.newLine();
            bw.flush();
            bw.close(); // obrigatorio fazer esses dois, se nao fode todo o codigo e recursos do S.O
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
