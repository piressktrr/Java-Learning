package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces;

public abstract class Transacao implements Pagavel{
    private double valor;
    private String descricao;

    public Transacao(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public void exibirResumo() {
        System.out.println("Resumo: " + this.descricao);
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Taxa: R$" + this.calcularTaxa());
        confirmarPagamento();
        System.out.println("=-=-=-=-=-=-=-=-=--=-=-=-=-");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0){
            System.out.println("Valor invalido");
            return;
        }
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.equals("")){
            System.out.println("Descricao invalido");
            return;
        }
        this.descricao = descricao;
    }
}
