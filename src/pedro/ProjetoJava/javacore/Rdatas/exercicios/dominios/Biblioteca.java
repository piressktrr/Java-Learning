package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    private ArrayList<Emprestimo> emprestimos =  new ArrayList<>();
    private ArrayList<Emprestimo> atrasados = new ArrayList<>();

    public void addEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
    }

    public void listaEmprestimos(){
        for (Emprestimo emp : this.emprestimos) {
            if (emp.getDataDoEmprestimo().isBefore(LocalDateTime.now())) {
                atrasados.add(emp);
                emprestimos.remove(emp);
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Lista dos livros emprestados que NÃO estão atrasados: ");
        for (Emprestimo emp : this.emprestimos) {
            System.out.println(emp.getLivro().getTitulo() + ", ");
        }

        System.out.print("Lista dos livros emprestados que ESTÃO atrasados: ");
        for (Emprestimo atr : this.atrasados) {
            System.out.println(atr.getLivro().getTitulo() + ", ");
        }
    }

}
