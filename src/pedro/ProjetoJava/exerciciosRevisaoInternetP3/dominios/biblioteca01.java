package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class biblioteca01 {
    private livro01[] livros = new livro01[5];
    private int contarLivros;

    public void adicionarLivro(livro01 livro, int posicao) {
        if (posicao < 0 || posicao >= livros.length) {
            System.out.println("Erro, posicao "+posicao+" invalida, livro não foi adicionado");
            return;
        } else if (livros[posicao] != null) {
            System.out.println("Erro, a posição "+ posicao +" já está ocupada");
            return;
        }
        livros[posicao] = livro;
    }



    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis (boolean == true): ");
        for (livro01 livro : livros) {
            if (livro != null && livro.isDisponivel()) {
                System.out.println(livro.getTitulo().toUpperCase());
            }
        }
    }

    public void contarLivrosDisponiveis() {
        for (livro01 livro : livros) {
            if (livro != null && livro.isDisponivel()) {
                contarLivros++;
            }
        }
    }


    public int getContarLivros() {
        return contarLivros;
    }
}
