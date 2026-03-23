package pedro.ProjetoJava.javacore.Uregex.test.exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExercicioSimples {
    public static void main(String[] args) {
        // quantificadores abaixo:
        // ? = zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {hm} de n ate m
        // () agrupamento
        // | ou
        // $ fim da linha
        // . = 1.3 = 123 133 143 )caractere coringa(


        String regexUm = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String regexEmail = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String texto = "0xBA87 12 0x 0X 0x10G 0X10XZ";
        String emails = "pedropinto@gmail.com, pedropenis@bol.com, gabrielpinto@mail";
        Pattern pattern = Pattern.compile(regexUm);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
