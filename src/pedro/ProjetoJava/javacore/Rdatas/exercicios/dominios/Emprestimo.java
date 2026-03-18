package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Emprestimo {
    private Livro livro;
    private String usuario;
    private LocalDateTime dataDoEmprestimo;

    public Emprestimo(Livro livro, String usuario, LocalDateTime emprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataDoEmprestimo = emprestimo;
    }

    private void calculReturnOfTheBook() {
        if (this.dataDoEmprestimo == null ) {
            return;
        }
        LocalDateTime now = LocalDateTime.now();
        long hoursBetweenNowAndEmprestimo = ChronoUnit.HOURS.between(now, this.dataDoEmprestimo);
        long days = TimeUnit.HOURS.toDays(hoursBetweenNowAndEmprestimo);
        long hoursRemainingFromTheEmprestimo = hoursBetweenNowAndEmprestimo % 24;
        if (hoursRemainingFromTheEmprestimo > 0 && days > 0) {
            System.out.println("De hoje até a data final do empréstimo você tem: " + days
                    + " Dias e " + hoursRemainingFromTheEmprestimo + " Horas!");
        } else {
            calculIfIsDelayed();
        }
    }

    private void calculIfIsDelayed () {
        LocalDateTime now = LocalDateTime.now();
        if (TimeUnit.HOURS.toDays(ChronoUnit.HOURS.between(now, this.dataDoEmprestimo)) < 0)  {

            long hoursDelayed = ChronoUnit.HOURS.between(now, this.dataDoEmprestimo);
            long daysDelayed = Math.abs(TimeUnit.HOURS.toDays(hoursDelayed));
            long hoursRemainingFromTheDelayed = Math.abs(hoursDelayed % 24);

            System.out.println("O Livro está com o emprestimo atrasado há: "
                    + daysDelayed + " Dias e " +  hoursRemainingFromTheDelayed + " Horas");
        }
    }

    public void resumeOfEmprestimo () {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Titulo do livro: " + this.livro.getTitulo());
        System.out.println("Autor: " + this.livro.getAutor());
        System.out.println("Data do do emprestimo: " + this.dataDoEmprestimo);
        System.out.println("Usuário que comprou: " + this.usuario);
        calculReturnOfTheBook();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

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
