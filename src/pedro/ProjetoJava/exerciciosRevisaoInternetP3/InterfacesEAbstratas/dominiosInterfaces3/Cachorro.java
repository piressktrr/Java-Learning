package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3;

public class Cachorro extends Mamifero implements Adestravel {
    public Cachorro(String nome, int idade, String habitat, double pesoKg) {
        super(nome, idade, habitat, pesoKg);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU!!");
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando o animal..");

    }

    @Override
    public boolean podeSerAdestravel() {
        return true;
    }

    @Override
    public void realizarTruque() {
        System.out.println("O "+ getNome() +" da uma pirueta no ar!!");
    }
}
