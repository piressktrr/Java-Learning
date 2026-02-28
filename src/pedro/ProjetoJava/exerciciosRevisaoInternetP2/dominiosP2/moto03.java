package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class moto03 extends  veiculo03{
    final int numeroInfracoes;

    public moto03(String marca, String modelo, int ano, double velocidade, int numeroInfracoes) {
        super(marca, modelo, ano, velocidade);
        this.numeroInfracoes = numeroInfracoes;
    }

    public void acelerar(double velocidade) {
        if (velocidade <= 15){
            setVelocidade(getVelocidade() + velocidade);
        } else  {
            System.out.println("velocidade maior que 15km/h");
        }
    }

    public int getNumeroInfracoes() {
        return numeroInfracoes;
    }
}
