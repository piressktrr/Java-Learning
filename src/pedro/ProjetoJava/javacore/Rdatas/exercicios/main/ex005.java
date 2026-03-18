package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

public class ex005 {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.of(2026, 1, 5), LocalDate.now());
        Duration duration = Duration.ofDays(period.getDays());
        System.out.println(period);
        System.out.println(duration.toMinutes());


        try {
            Duration durationError = Duration.between(LocalDate.of(2026, 1, 5), LocalDate.now());
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Erro na data de duration, pede o tempo em minutos, horas, nanos e segundos, " +
                    "teria que usar o ofDays para funcionar. " +
                    e.getMessage());

            // pelo o que eu entendi, a duration pede o tempo em MINUTOS, NANOS e SEGUNDOS
            // quando se usa between, caso eu quisesse os dias eu teria que usar ofDays, que nem eu fiz acima.
            // por isso o erro.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
