package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo4;

public abstract class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public abstract double calcularFrete();
    public void exibirProduto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: R$" + getPreco());
        System.out.println("Estoque: " + getEstoque());
        System.out.println("Frete: R$" + calcularFrete());
        System.out.println("=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            System.out.println("Erro no nome!!");
            return;
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro no preco!!");
            return;
        }
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            System.out.println("Erro no estoque!!");
            return;
        }
        this.estoque = estoque;
    }
}
