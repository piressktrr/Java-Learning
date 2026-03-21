package pedro.ProjetoJava.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest01 {
    public static void main(String[] args) {
        String regex = "@gmail.com";
        String texto = "pedropires@gmail.com";
        String texto2 = "mariapires@outlook.com";
        String[] textos = new String[] {texto, texto2};
        Pattern pattern = Pattern.compile(regex);

        for (String s : textos) {
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.print(matcher.end() + " " + matcher.group() + "\n");
                // retorna as posições onde encontra a começa a primeira palavra P
                // ele nao conta as palavras q ele ja deu matcher ou ja iterou anteriormente
                // ele smp procura a posiçao onde começa com apalavra q vc definiu
            }
        }

    }
}
