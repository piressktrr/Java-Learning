package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.time.LocalDate;

public class ex011 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2024, 1, 15);

        data = data.plusDays(90);

        System.out.println("Fim do periodo de contratação: " + data);

        LocalDate vencimento = LocalDate.of(2024, 1, 15);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Renovação "+i+": "+vencimento.plusMonths(6L*i));
        }
    }
}
