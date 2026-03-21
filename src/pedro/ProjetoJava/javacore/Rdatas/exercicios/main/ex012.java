package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Biblioteca;
import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Emprestimo;
import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Livro;

import java.time.LocalDateTime;

public class ex012 {
    public static void main(String[] args) {
        Livro JavaLivro = new Livro("Titulo Java", "Autor do Java");
        Emprestimo EmprestimoJava = new Emprestimo(JavaLivro, "Pedrinho",
                LocalDateTime.of(2026, 03, 28, 10, 30));

        Livro PythonLivro = new Livro("Python iniciantes", "Autor do Python");
        Emprestimo EmprestimoPython = new Emprestimo(PythonLivro, "Joaozinho",
                LocalDateTime.of(2026, 02, 20, 15, 20));



        Biblioteca biblioteca = new Biblioteca();


        biblioteca.addEmprestimo(EmprestimoPython);
        biblioteca.addEmprestimo(EmprestimoJava);

        EmprestimoJava.resumeOfEmprestimo();
        EmprestimoPython.resumeOfEmprestimo();

        biblioteca.listaEmprestimos();
    }
}
