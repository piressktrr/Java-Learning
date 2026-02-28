package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class carro03 extends veiculo03{
    final int numeroDePortas;


    public carro03(String marca, String modelo, int ano, double velocidade, int numeroDePortas) {
        super(marca, modelo, ano, velocidade);
        this.numeroDePortas = numeroDePortas;
    }

    public void acelerar(double velocidade) {
        if (velocidade <= 30){
            setVelocidade(getVelocidade() + velocidade);
        } else  {
            System.out.println("velocidade maior que 15km/h");
        }
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
}
