package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.Duration;
import java.time.Instant;

public class Cronometro {
    private Instant horaEntrada;
    private Instant horaSaida;

    public Cronometro() {
        this.horaEntrada = Instant.now();
    }

    public void parar(){
        this.horaSaida = Instant.now();
    }

    public long getTempoMs() {
        Duration duracao = Duration.between(horaEntrada, horaSaida);
        return duracao.toMillis();
    }

    public long getTempoNs() {
        Duration duracao = Duration.between(horaEntrada, horaSaida);
        return duracao.toNanos();
    }

    public Instant getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Instant horaEntrada) {
        if (horaEntrada == null) {
            return;
        }
        this.horaEntrada = horaEntrada;
    }

    public Instant getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Instant horaSaida) {
        if (horaSaida == null) {
            return;
        }
        this.horaSaida = horaSaida;
    }
}
