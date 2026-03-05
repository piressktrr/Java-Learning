package pedro.ProjetoJava.javacore.Oexception.dominios4;

import java.io.PrintStream;
import java.nio.charset.Charset;

public class ProcessadorDeDados {
    public void receberArray (String[] array, String question) {
        int[] converter = new int[array.length];

            try {
                if (question.equalsIgnoreCase("number")) {
                    converter[0] = Integer.parseInt(array[0]);
                } else if (question.equalsIgnoreCase("indexoutofbounds")) {
                    int testeErro = converter[array.length + 1];
                } else if (question.equalsIgnoreCase("null")) {
                    array[0] = null;
                    System.out.println(array[0].contains("a"));
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
                System.out.println("Erro!! o tipo do erro é: " + e.getClass().getName());
                e.printStackTrace();
                throw e;
            }
    }


}
