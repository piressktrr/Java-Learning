package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class cachorro01 extends animal01{

    public void fazerSom(){
        System.out.println("AU AU!");
    }

    public cachorro01(String nome, int idade, String especie) {

        super(nome, idade, especie);
        quantidadeAnimais++;
    }
}
