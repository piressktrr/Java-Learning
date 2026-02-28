package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3;

public abstract class Mamifero extends Animal{
    private double pesoKg;

    public Mamifero(String nome, int idade, String habitat, double pesoKg) {
        super(nome, idade, habitat);
        this.pesoKg = pesoKg;
    }

    public abstract void amamentar();

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0 ) {
            System.out.println("Erro, peso negativo ou 0");
            return;
        }
        this.pesoKg = pesoKg;
    }
}
