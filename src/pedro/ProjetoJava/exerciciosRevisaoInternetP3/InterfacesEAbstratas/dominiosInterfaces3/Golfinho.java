package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces3;

public class Golfinho extends Mamifero implements Adestravel{
    public Golfinho(String nome, int idade, String habitat, double pesoKg) {
        super(nome, idade, habitat, pesoKg);
    }


    @Override
    public void emitirSom() {
        System.out.println("UUUUUUUU!!");
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando o animal..");

    }

    @Override
    public boolean podeSerAdestravel() {
        return false;
    }

    @Override
    public void realizarTruque() {
        System.out.println("O "+ getNome() +" mergulha de cabeça para baixo!!");
    }
}
