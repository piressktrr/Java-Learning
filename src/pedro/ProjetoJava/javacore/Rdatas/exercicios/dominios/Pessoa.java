package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private String dataDeNascimento;

    public void calculReturn (String dataDeNascimento) {
        LocalDate dataDeNascimentoLocal = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period period = Period.between(dataDeNascimentoLocal, LocalDate.now());
        System.out.println(period.getYears() + " anos, " + period.getMonths() + " meses e " + period.getDays() +
                " dias");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
