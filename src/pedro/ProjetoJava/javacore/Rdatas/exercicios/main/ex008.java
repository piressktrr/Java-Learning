package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Cronometro;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;

public class ex008 {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro(Instant.now());
        System.out.println("Tempo de entrada: "+cronometro.getHoraEntrada().atZone(ZoneId.systemDefault()));
        int cont = 0;
        while (cont < 10) {
            if (cont == 9) {
                cronometro.parar();
            }
            cont += 1;
        }

        System.out.println("Tempo de saida: " +cronometro.getHoraSaida().atZone(ZoneId.systemDefault()));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        cronometro.getTempoMs();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        cronometro.getTempoNs();
    }
}
