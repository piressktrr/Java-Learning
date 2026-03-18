package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class Cronometro {
    private Instant horaEntrada;
    private Instant horaSaida;

    public Cronometro(Instant horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void parar(){
        this.horaSaida = Instant.now().plus(Duration.ofHours(5));
    }

    public void getTempoMs() {
        Duration duracao = Duration.between(horaEntrada, horaSaida);
        System.out.println("Duração em milissegundos do cronometro: " +Duration.ofMillis(duracao.toMillis()));
    }

    public void getTempoNs() {
        Duration duracao = Duration.between(horaEntrada, horaSaida);
        System.out.println("Duração em nanos segundos do cronometro: " +Duration.ofNanos(duracao.toMillis()));
    }

    public Instant getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Instant horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Instant getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Instant horaSaida) {
        this.horaSaida = horaSaida;
    }
}
