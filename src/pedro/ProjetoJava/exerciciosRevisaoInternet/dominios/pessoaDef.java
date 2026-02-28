package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class pessoaDef {
    private String nome;
    private int idade;
    public static int quantidadeDePessoas;

    public pessoaDef(String nome, int idade) {
        quantidadeDePessoas++;
        this.nome = nome;
        this.idade = idade;
    }

    static void reset(){
        quantidadeDePessoas = 0;
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

    public static int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }
}
