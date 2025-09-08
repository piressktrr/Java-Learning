package pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios;

public abstract class ProdutoOnline {
    private String nome;
    private double preco;


    public abstract double calcularDesconto();

    public abstract String pegarNome();

    public abstract double pegarPreco();
}
