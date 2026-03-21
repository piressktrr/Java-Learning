package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.Duration;

import java.time.LocalTime;


public class RegistroDePonto {
    private String nomeFuncionario;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;


    public RegistroDePonto(String nomeFuncionario, LocalTime horaEntrada, LocalTime horaSaida) {
        this.nomeFuncionario = nomeFuncionario;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public long returnHoursWorked() {
        if (horaEntrada == null || horaSaida == null) {
            return Duration.ZERO.toHours();
        }
       long duracao = Duration.between(horaEntrada, horaSaida).toHours();
       return duracao;

    }

    public void journey8HoursWorked() {
        long hours = returnHoursWorked();
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

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        if (horaEntrada  == null)
            return;
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        if (horaSaida == null) {
            return;
        }
        this.horaSaida = horaSaida;
    }

}
