package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces2;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("**************\n" +
                "**************\n" +
                "**************\n" +
                "**************\n" +
                "**************");
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0){
            System.out.println("largura invalida");
            this.largura = 0;
            return;
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0){
            System.out.println("altura invalida");
            this.altura = 0;
            return;
        }
        this.altura = altura;
    }
}
