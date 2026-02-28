package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class contaBancaria024 {
    private String numeroConta;
    private double saldo;
    private String titular;
    public static double taxaJuros;

    public contaBancaria024(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double depositar (double valor) {
        return this.saldo += valor;
    }

    public void depositar (double valor, String referencia) {
        this.saldo += valor;
        this.titular = referencia;
    }

    public double sacar (double valor) {
        return this.saldo -= valor;
    }

    public static double getTaxaJuros() {
        return taxaJuros / 100;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0)
            saldo = 0;
        else
            this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
