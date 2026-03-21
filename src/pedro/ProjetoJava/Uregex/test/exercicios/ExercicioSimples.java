package pedro.ProjetoJava.Uregex.test.exercicios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExercicioSimples {
    public static void main(String[] args) {
        String regexUm = "0[xX]([0-9a-fA-F])+(\\s|$)";

        String texto = "0xBA87 12 0x 0X 0x10G 0X10XZ";
        Pattern pattern = Pattern.compile(regexUm);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
