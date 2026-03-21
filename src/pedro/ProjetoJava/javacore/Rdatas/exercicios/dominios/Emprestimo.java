package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Emprestimo {
    private Livro livro;
    private String usuario;
    private LocalDateTime dataDoEmprestimo;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private int prazoEmDias;


    public Emprestimo(Livro livro, String usuario, LocalDateTime emprestimo, int prazoEmDias) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataDoEmprestimo = emprestimo;
        this.prazoEmDias = prazoEmDias;
    }

    public LocalDate getDataDevolucao() {
        return dataDoEmprestimo.toLocalDate().plusDays(prazoEmDias);
    }

    public boolean isAtrasado() {
        return LocalDate.now().isAfter(getDataDevolucao());
    }

    private String calculReturnOfTheBook() {
        if (this.dataDoEmprestimo == null ) {
            return "";
        }

        long dias = ChronoUnit.DAYS.between(LocalDate.now(), getDataDevolucao());
        long horas = ChronoUnit.HOURS.between(LocalDate.now(), getDataDevolucao());


        if (dias > 0) {
            return "De hoje até a data final do empréstimo você tem: " + dias
                    + " Dias e " + horas + " Horas!";
        } else {
            return calculIfIsDelayed();

        }
    }

    private String calculIfIsDelayed () {
        LocalDateTime now = LocalDateTime.now();
        if (TimeUnit.HOURS.toDays(ChronoUnit.HOURS.between(now, this.dataDoEmprestimo)) < 0)  {
            long daysDelayed = Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), getDataDevolucao()));
            long hoursDelayed = Math.abs(ChronoUnit.HOURS.between(LocalDate.now(), getDataDevolucao()));

            return "O Livro está com o emprestimo atrasado há: " + daysDelayed + " Dias e " + hoursDelayed + " Horas";
        }
        return "";
    }

    public String resumeOfEmprestimo () {

        return "Titulo: " + this.livro.getTitulo() + "\nAutor: " + this.livro.getAutor() +
                "\nData de validade do emprestimo: " + this.dataDoEmprestimo.format(formatter) +
                "\nUsuário que comprou: " + this.usuario + calculReturnOfTheBook();

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        if (livro == null) {
            return;
        }
        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario == null || usuario.isEmpty()) {return;}
        this.usuario = usuario;
    }

    public LocalDateTime getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(LocalDateTime dataDoEmprestimo) {
        if (dataDoEmprestimo == null) {return;}
        this.dataDoEmprestimo = dataDoEmprestimo;
    }


}
