package pedro.ProjetoJava.javacore.VIO.test;

import java.io.*;

public class BufferedReader01 {
    public static void main(String[] args) {
        // file
        // fileWriter
        // bufferedWriter
         // bufferedReader

        File file = new File("fileBufferedReader.txt");

        try {
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
