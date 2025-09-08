package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.ProdutoOnline;

public class Roupa extends ProdutoOnline {
    private String nome;
    private double preco;

    public Roupa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularDesconto() {
        double desconto = preco * 0.20;
        return preco - desconto;
    }

    @Override
    public String pegarNome() {
        return nome;
    }

    @Override
    public double pegarPreco() {
        return preco;
    }
}
