package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class pessoa022 {
    private String nome;
    private int idade;

    public pessoa022(){

    }

    public  pessoa022(String nome){
        this.nome = nome;
    }

    public  pessoa022(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
