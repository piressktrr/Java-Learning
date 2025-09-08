package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.ProdutoOnline;

public class Eletronico extends ProdutoOnline {
    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularDesconto() {
        double desconto = preco * 0.15;
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
