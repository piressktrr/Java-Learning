package pedro.ProjetoJava.javacore.Oexception.exceptionn.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class tryWithResources {
    public static void main(String[] args) {
        leitor();
    }

    public static void leitor() {
        try (Leitor1 leitor = new Leitor1();
        Leitor2 leitor2 = new Leitor2()){

        } catch (IOException e) {

        }
    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("./arquivo.txt"))) {

        } catch (IOException e){

        }
    }
}
