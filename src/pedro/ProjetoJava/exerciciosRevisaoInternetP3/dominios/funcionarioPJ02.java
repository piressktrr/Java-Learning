package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class funcionarioPJ02  extends funcionario02{
    private double taxaDesconto;
    public funcionarioPJ02(String nome, double salarioBase) {
        super(nome, salarioBase);

    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - (getSalarioBase() * taxaDesconto / 100);
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(double taxaDesconto) {
        if (taxaDesconto < 0){
            taxaDesconto = 0;
            System.out.println("Erro: taxa invalida");
            return;
        }
        this.taxaDesconto = taxaDesconto;
    }
}
