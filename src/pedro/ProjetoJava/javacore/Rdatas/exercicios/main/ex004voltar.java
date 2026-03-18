package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex004voltar {

    public static void method(String variableOrObj)  {
        if (variableOrObj == null || variableOrObj.isEmpty()) {
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println(sdf.parse(String.valueOf(Date.parse(variableOrObj))));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Date.parse(variableOrObj));

    }

    public static void main(String[] args) {
        method("21/03/2024");
        // nao sei qual string passar aqui que daria certo, mas eu sei que daria certo
        method("22/05/2025");
    }
}
