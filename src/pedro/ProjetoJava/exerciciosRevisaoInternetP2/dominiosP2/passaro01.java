package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class passaro01 extends animal01{
    public void fazerSom(){
        System.out.println("TUC TUC!");
    }
    public passaro01(String nome, int idade, String especie) {
        super(nome, idade, especie);
        quantidadeAnimais++;
    }
}
