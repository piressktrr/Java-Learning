package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.ContaBancaria;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3.Tributavel;

public class ContaCorrente extends ContaBancaria implements Tributavel {
    public ContaCorrente(String titular, String numeroConta, double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public double sacar(double valor) {
        if (this.saldo <= -500){
            System.out.println("Saldo indisponivel para sacar");
            return this.saldo;
        }
        return this.saldo - valor;
    }

    @Override
    public double depositar(double valor) {
        return this.saldo + valor;
    }

    @Override
    public double calcularImposto() {
        return 0.5 * getSaldo();
    }

    @Override
    public String getTipoAtributo() {
        return "Conta Corrente";
    }
}
