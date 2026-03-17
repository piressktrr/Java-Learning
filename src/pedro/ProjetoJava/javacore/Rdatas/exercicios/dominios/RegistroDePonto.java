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
       Duration duracao = Duration.between(LocalTime.of(horaEntrada, 0), LocalTime.of(horaSaida, 0));
       return duracao;

    }

    public void journey8HoursWorked() {
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
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

}
