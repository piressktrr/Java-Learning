package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class gato01 extends animal01 {

    public void fazerSom(){
        System.out.println("MIAUUU");
    }
    public gato01(String nome, int idade, String especie) {
        super(nome, idade, especie);
        quantidadeAnimais++;
    }
}
