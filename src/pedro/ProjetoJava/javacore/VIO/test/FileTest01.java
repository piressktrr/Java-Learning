package pedro.ProjetoJava.javacore.VIO.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            System.out.println("created: "+file.createNewFile());
            if(file.exists()){
                System.out.println("file exists");
                System.out.println("file deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
