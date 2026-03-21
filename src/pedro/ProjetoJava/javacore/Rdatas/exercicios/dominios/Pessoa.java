package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;

    public String calcularIdade() {
        if (this.dataDeNascimento == null) {
            return "";
        }

        Period period = Period.between(this.dataDeNascimento, LocalDate.now());
        return "A idade do "+this.nome+ " em: " +period.getYears() + " anos, " + period.getMonths()
                + " meses, " + period.getDays() + " dias";

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            return;
        }
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        if (dataDeNascimento == null) {
            return;
        }
        this.dataDeNascimento = dataDeNascimento;
    }
}
