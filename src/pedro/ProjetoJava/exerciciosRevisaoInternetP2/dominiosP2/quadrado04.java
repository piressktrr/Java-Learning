package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class quadrado04 extends forma04{
    private int lado;

    public quadrado04(String cor, int lado) {
        super(cor);
        this.lado = lado;
        quantidadeFormas++;
    }

    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return (lado + lado) * 2;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
