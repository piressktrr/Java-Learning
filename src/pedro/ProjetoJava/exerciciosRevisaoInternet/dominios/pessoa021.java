package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class pessoa021 {
    private String nome;
    private int idade;

    public void aniversario() {
        idade++;
    }

    public void aniversario(int idade) {
        this.idade += idade;
    }

    public void aniversario(int idade, String motivo){
        this.idade += idade;
        System.out.println(motivo);
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
