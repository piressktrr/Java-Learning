package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.Tributavel;

public class ContaInvestimento extends ContaBancaria implements Tributavel {
    private double taxaRendimento;

    public ContaInvestimento(String titular, String numeroConta, double saldo, double taxaRendimento) {
        super(titular, numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double aplicar(double valor){
        return valor * taxaRendimento;
    }

    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.15 * this.taxaRendimento;
        return this.taxaRendimento - imposto;
    }

    @Override
    public String getTipoAtributo() {
        return "Conta Investimento";
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento < 0)
            return;
        this.taxaRendimento = taxaRendimento;
    }
}
