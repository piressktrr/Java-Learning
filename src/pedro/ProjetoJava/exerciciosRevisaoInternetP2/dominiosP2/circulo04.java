package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class circulo04 extends forma04{

    private int diametro;
    private int raio;

    public circulo04(String cor, int diametro) {
        super(cor);

        this.diametro = diametro;
        raio = this.diametro/2;
        quantidadeFormas++;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
