package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Pessoa;

import java.time.LocalDate;

public class ex001 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        LocalDate dataDeNascimento = LocalDate.of(2008, 5, 15);
        p1.setNome("Pedro");
        p1.setDataDeNascimento(dataDeNascimento);

        System.out.println(p1.calcularIdade());
    }
}
