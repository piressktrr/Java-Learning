package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class produtoAlimenticio05 extends produto05{

    public produtoAlimenticio05(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    public double calcularPrecoFinal(){
        return getPreco() * 0.5;
    }

    public double aplicarDesconto(double desconto){
        return calcularPrecoFinal() - desconto;
    }
}
