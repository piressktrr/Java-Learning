package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class carro027 {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    public static double velocidadeMaximaPermitida = 300;

    public carro027(String marca) {
        this.marca = marca;
    }

    public carro027(String marca, String modelo) {
        this(marca);
        this.marca = marca;
        this.modelo = modelo;
    }

    public carro027(String marca, String modelo, int ano, double velocidade) {
        this(marca, modelo);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public static void alterarVelocidadeMaxima(double velocidade) {
        velocidadeMaximaPermitida = velocidade;
    }

    public void acelerar(){
        this.velocidade += 10;
    }

    public void acelerar(double velocidade) {
        if (velocidade == 0 || velocidade < 0){
            return;
        }
        this.velocidade += velocidade;

    }

    public void frear(){
        this.velocidade -= 10;
    }

    public void frear(double velocidade) {
        if (velocidade == 0 || velocidade < 0){
            return;
        }
        this.velocidade -= (velocidade / 100);

    }

    public void verificarVelocidade(double velocidade, String marca) {

        if (velocidade < 0){
            return;
        }

        if (velocidade > velocidadeMaximaPermitida) {
            System.out.println("O CARRO "+ marca +" ESTÁ ULTRAPASSANDO A VELOCIDADE PERMITIDA!!");
        } else {
            System.out.println("O CARRO "+ marca +" ESTÁ NOS LIMITES CERTOS!!");
        }
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
        if (ano < 1900){
            return;
        }
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade == 0 || velocidade < 0){
            return;
        }
        this.velocidade = velocidade;
    }

    public static double getVelocidadeMaximaPermitida() {
        return velocidadeMaximaPermitida;
    }
}
