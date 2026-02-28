package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String modelo, double capacidadeKg, int eixos) {
        super(modelo, capacidadeKg);
        this.eixos = eixos;
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm * 0.8 * this.eixos;
    }

    @Override
    public String exibirTipo() {
        return "Caminhao";
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos < 0 )
            return;
        this.eixos = eixos;
    }
}
