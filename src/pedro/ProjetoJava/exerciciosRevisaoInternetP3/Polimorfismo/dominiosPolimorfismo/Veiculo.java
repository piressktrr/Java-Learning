package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo;

public abstract class Veiculo {
    private String modelo;
    private double capacidadeKg;

    public Veiculo(String modelo, double capacidadeKg) {
        this.modelo = modelo;
        this.capacidadeKg = capacidadeKg;
    }

    public abstract double calcularFrete(double distanciaKm);
    public abstract String exibirTipo();


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank())
            return;
        this.modelo = modelo;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(double capacidadeKg) {
        if (capacidadeKg < 0)
            return;
        this.capacidadeKg = capacidadeKg;
    }
}
