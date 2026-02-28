package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo;

public class Moto extends Veiculo{
    private boolean bau;

    public Moto(String modelo, double capacidadeKg, boolean bau) {
        super(modelo, capacidadeKg);
        this.bau = bau;
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        if (bau){
            return distanciaKm * 0.65;
        }
        return distanciaKm * 0.5;
    }

    @Override
    public String exibirTipo() {
        return "Moto";
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }
}
