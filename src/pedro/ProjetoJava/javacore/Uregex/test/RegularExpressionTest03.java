package pedro.ProjetoJava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest03 {
    public static void main(String[] args) {
        //d = retorna todos os digitos
        //D = retorna TUDO que nao for digito
        //s = retorna TODOS os espaços em branco
        //S = retorna TUDO que nao for espaço em branco
        //w = retorna toda as letras, digitos (0,9) e _
        //W = retorna TUDO que o //w nao faz.
        // [] = especifica os caracteres dentro do regex que eu quero que retorne as posições

        String regex = "[a-zA-C]";
        String texto2 = "cafeBEBEa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }



    }
}
