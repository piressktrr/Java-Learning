package pedro.ProjetoJava.Uregex.test.exercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExercicioSimples2 {
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
        // ^ match para encontrar exatamente o que eu quero no começo da linha (ou o qual eu nao quero depois dela usando[])

        String regexEmail = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";


        String emails = "pedropinto@gmail.com, #@pedropenis@bol.com, gabrielpinto@mail.com";
        // aqui so esta encontrando o padrao, nao delimitando e nem validando
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(emails);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
