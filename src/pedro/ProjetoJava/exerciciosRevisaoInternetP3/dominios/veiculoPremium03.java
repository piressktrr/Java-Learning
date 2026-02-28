package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class veiculoPremium03 extends veiculo03{
    private double valorDiaria;
    public veiculoPremium03(String placa, String modelo, tipoVeiculo03 tipoVeiculo, statusVeiculo03 statusVeiculo) {
        super(placa, modelo, tipoVeiculo, statusVeiculo);
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria <= 0) {
            System.out.println("Valor da diaria negativo ou igual a zero, erro");
            this.valorDiaria = 0;
            return;
        }
        this.valorDiaria = valorDiaria;
    }
}
