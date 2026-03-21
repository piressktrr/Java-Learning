package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Biblioteca;
import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Emprestimo;
import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Livro;

import java.time.LocalDateTime;

public class ex012 {
    public static void main(String[] args) {
        Livro javaLivro = new Livro("Titulo Java", "Autor do Java");
        Emprestimo emprestimoJava = new Emprestimo(javaLivro, "Pedrinho",
                LocalDateTime.of(2026, 03, 28, 10, 30), 10);

        Livro pythonLivro = new Livro("Python iniciantes", "Autor do Python");
        Emprestimo emprestimoPython = new Emprestimo(pythonLivro, "Joaozinho",
                LocalDateTime.of(2026, 02, 20, 15, 20), 10);
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addEmprestimo(emprestimoPython);
        biblioteca.addEmprestimo(emprestimoJava);

        System.out.println(emprestimoJava.resumeOfEmprestimo());
        System.out.println(emprestimoPython.resumeOfEmprestimo());

        biblioteca.listaEmprestimos();
    }
}
