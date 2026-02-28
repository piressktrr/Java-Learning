package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces.*;

public class exerciciosP404 {
    public static void main(String[] args) {

        Boleto boleto = new Boleto(1000, "Pre treino");
        CartaoCredito cartaoCredito = new CartaoCredito(500, "Parcela");
        Pix pix = new Pix(2400, "Celular");
        Transacao[] transacoes = new Transacao[]{boleto, cartaoCredito, pix};

        for (Transacao transacoe1 : transacoes) {
            transacoe1.exibirResumo();

        }

        Pagavel a = new Boleto(10, "a");
        a.calcularTaxa();
        a.confirmarPagamento();
    }
}
