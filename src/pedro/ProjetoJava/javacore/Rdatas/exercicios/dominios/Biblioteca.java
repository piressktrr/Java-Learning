package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;


import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Emprestimo> emprestimos =  new ArrayList<>();
    private ArrayList<Emprestimo> atrasados = new ArrayList<>();

    public void addEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
    }

    public void listaEmprestimos(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Lista dos livros emprestados que NÃO estão atrasados: ");
        for (Emprestimo emp : this.emprestimos) {
            if (!emp.isAtrasado()) {
                System.out.println(emp.getLivro().getTitulo());
            }
        }

        System.out.print("Lista dos livros emprestados que ESTÃO atrasados: ");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isAtrasado()) {
                System.out.println(emprestimo.getLivro().getTitulo());
            }
        }
    }

}
