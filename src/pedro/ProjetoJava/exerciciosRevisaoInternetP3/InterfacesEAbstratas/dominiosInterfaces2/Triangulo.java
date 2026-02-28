package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces2;

public class Triangulo extends Forma {
    private double base;
    private double altura;
    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("     *     \n" +
                "    ***    \n" +
                "   *****   \n" +
                "  *******  \n" +
                " ********* \n" +
                "***********");
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("base invalida");
            this.base = 0;
            return;
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("altura invalida");
            this.altura = 0;
            return;
        }
        this.altura = altura;
    }
}
