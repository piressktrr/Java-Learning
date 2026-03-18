package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.*;

public class RegistroDePonto {
    private String nomeFuncionario;
    private int horaEntrada;
    private int horaSaida;


    public RegistroDePonto(String nomeFuncionario, int horaEntrada, int horaSaida) {
        this.nomeFuncionario = nomeFuncionario;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public Duration returnHoursWorked() {
        if (this.horaEntrada < 0 || this.horaSaida < 0)
            return Duration.ZERO;
       Duration duracao = Duration.between(LocalTime.of(horaEntrada, 0), LocalTime.of(horaSaida, 0));
       return duracao;

    }

    public void journey8HoursWorked() {
        if (returnHoursWorked() == null)
            return;
        int hours = returnHoursWorked().toHoursPart();
        if (hours < 8) {
            System.out.println("O funcionário não cumpriu as 8 horas diárias!");
        } else {
            System.out.println("O funcionário CUMPRIU as 8 horas!");
        }
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        if (nomeFuncionario == null || nomeFuncionario.isBlank()) {
            return;
        }
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        if (horaEntrada < 0)
            return;
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        if (horaSaida < 0) {
            return;
        }
        this.horaSaida = horaSaida;
    }

}
