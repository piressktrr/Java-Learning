package pedro.ProjetoJava.javacore.Oexception.exceptionn.test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class exceptionTest {
    public static void main(String[] args)  throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        Scanner scanner  = new Scanner(System.in);
        int[] array = new int [2];
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
