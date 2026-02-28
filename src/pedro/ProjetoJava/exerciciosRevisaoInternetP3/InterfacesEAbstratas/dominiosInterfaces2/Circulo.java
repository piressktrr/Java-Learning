package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces2;

public class Circulo extends Forma {
    private double raio;
    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;

    }

    @Override
    public void desenhar() {
        System.out.println("   *****   \n" +
                "  *******  \n" +
                " ********* \n" +
                " ********* \n" +
                " ********* \n" +
                "  *******  \n" +
                "   *****   ");
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0 ){
            System.out.println("raio invalido");
            return;
        }
        this.raio = raio;
    }
}
