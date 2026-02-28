package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class produtoEletronico05 extends produto05{
    public produtoEletronico05(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.7;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        return calcularPrecoFinal() - desconto;
    }
}
