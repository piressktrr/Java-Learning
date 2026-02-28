package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class triangulo04 extends forma04{
    private double base;
    private double altura;
    private double lado;

    public triangulo04(String cor, double altura, double base, double lado) {
        super(cor);
        this.altura = altura;
        this.base = base;
        this.lado = lado;
        quantidadeFormas++;
    }

    public double calcularArea() {
        return (base*altura) / 2;
    }
    public double calcularPerimetro() {
        return lado * 3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
