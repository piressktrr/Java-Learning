package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces2;

public abstract class Forma implements Calculavel, Desenhavel{
    private String cor;
    private static int totalFormas;

    public Forma(String cor) {
        this.cor = cor;
        totalFormas++;
    }

    public void exibirInfo(){
        System.out.println("Cor: " + cor);
        System.out.println("Area total: " + calcularArea());
        System.out.println("Perimetro Total: " + calcularPerimetro());
        System.out.println("Desenho da forma: ");
        desenhar();
        System.out.println("=-=-=-=-=-=-=--=-=-=-=-=-");
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isBlank()){
            System.out.println("cor nula ou em branco");
            return;
        }
        this.cor = cor;
    }


    public static int getTotalFormas() {
        return totalFormas;
    }
}
