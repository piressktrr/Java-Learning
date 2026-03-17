package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex004voltar {

    public static void method(String variableOrObj) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(sdf.parse(String.valueOf(Date.parse(variableOrObj))));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        method("21/03/2024");
    }
}
