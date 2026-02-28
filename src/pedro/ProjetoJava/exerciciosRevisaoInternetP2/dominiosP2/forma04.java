package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public abstract class   forma04 {
    private String cor;
    protected static int quantidadeFormas;

    public forma04(String cor) {
        this.cor = cor;
    }

    abstract double  calcularArea();
    abstract double  calcularPerimetro();

    public String getCor() {
        return cor;
    }
}
