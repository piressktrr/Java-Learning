package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex004voltar {

    public static Date metodoParaErro(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            return sdf.parse(string);
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return null;

        }
    }

    public static void main(String[] args) {
        // as duas aqui passam certo pois estao no formato com barra
        System.out.println(metodoParaErro("22/05/2025"));
        System.out.println(metodoParaErro("21/03/2024"));
    }
}
