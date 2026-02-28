package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo;

public class Van extends Veiculo{
    private boolean climatizado;

    public Van(String modelo, double capacidadeKg, boolean climatizado) {
        super(modelo, capacidadeKg);
        this.climatizado = climatizado;
    }

    @Override
    public double calcularFrete(double distanciaKm) {
        if (climatizado) {
            return distanciaKm * 0.20;
        }
        return distanciaKm * 0.5;
    }

    @Override
    public String exibirTipo() {
        return "Van";
    }

    public boolean isClimatizado() {
        return climatizado;
    }

    public void setClimatizado(boolean climatizado) {
        this.climatizado = climatizado;
    }
}
