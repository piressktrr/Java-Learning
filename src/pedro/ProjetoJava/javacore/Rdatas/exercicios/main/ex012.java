package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Emprestimo;
import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Livro;

import java.time.LocalDateTime;
import java.time.Month;

public class ex012 {
    public static void main(String[] args) {
        Livro java = new Livro("Titulo Java", "Autor do Java");
        Emprestimo emprestimo = new Emprestimo(java, "Pedrinho",
                LocalDateTime.of(2026, 03, 28, 10, 30));

        emprestimo.resumeOfEmprestimo();
    }
}
