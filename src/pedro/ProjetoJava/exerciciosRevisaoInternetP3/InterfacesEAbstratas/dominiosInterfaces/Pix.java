package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces;

public class Pix extends Transacao implements Pagavel{
    public Pix(double valor, String descricao) {
        super(valor, descricao);
    }


    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pix enviado em tempo real!!");
    }
}
