package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class caminhao03 extends veiculo03{
    final String nomeDoChofer;

    public caminhao03(String marca, String modelo, int ano, double velocidade, String nomeDoChofer) {
        super(marca, modelo, ano, velocidade);
        this.nomeDoChofer = nomeDoChofer;
    }

    public void acelerar(double velocidade) {
        if (velocidade <= 20){
            setVelocidade(getVelocidade() + velocidade);
        } else  {
            System.out.println("velocidade maior que 15km/h");
        }
    }

    public String getNomeDoChofer() {
        return nomeDoChofer;
    }
}
