package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces;

public class CartaoCredito extends Transacao{
    public CartaoCredito(double valor, String descricao) {
        super(valor, descricao);
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.025;
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Cartão passou em tempo real!");
    }
}
