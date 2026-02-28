package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3;

public class Leao extends Mamifero {

    public Leao(String nome, int idade, String habitat, double pesoKg) {
        super(nome, idade, habitat, pesoKg);
    }

    @Override
    public void emitirSom() {
        System.out.println("RWAAAAAAAAAAR!!");
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando o animal..");
    }
}
