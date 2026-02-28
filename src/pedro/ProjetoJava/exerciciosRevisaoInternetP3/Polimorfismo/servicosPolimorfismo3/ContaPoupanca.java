package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    public double rendimentoMensal(double taxa) {
        return taxa += this.saldo;
    }

    @Override
    public double sacar(double valor) {
        if (valor <= 0){
            System.out.println("Valor para saque da conta Poupança negativo!!");
            return this.saldo;
        }
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }


}
