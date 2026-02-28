package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class pessoa020 {
    private String nome;
    private int idade;



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
        if (idade < 0){
            return;
        }
        this.idade = idade;
    }
}
