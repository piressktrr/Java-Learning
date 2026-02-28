package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo3;

public abstract class ContaBancaria {
    private String titular;
    private String numeroConta;
    protected double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract double sacar(double valor);
    public abstract double depositar(double valor);

    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero Conta: " + getNumeroConta());
        System.out.println("Saldo: R$" + getSaldo());

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank())
            return;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.isBlank())
            return;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0)
            return;
        this.saldo = saldo;
    }
}
