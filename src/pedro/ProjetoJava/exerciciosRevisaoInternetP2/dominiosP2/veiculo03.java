package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class veiculo03 {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    public static double velocidadeMaxima = 300;

    public veiculo03(String marca) {
        this.marca = marca;
    }

    public veiculo03(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public veiculo03(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public veiculo03(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public void acelerar(double velocidade){
    }

    public static double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
