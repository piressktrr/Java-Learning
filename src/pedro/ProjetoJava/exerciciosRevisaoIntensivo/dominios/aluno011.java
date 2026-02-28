package pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios;

public class aluno011 {
    private String nome;
    private int idade;
    private seminario011 seminario;

    public aluno011(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public seminario011 getSeminario() {
        return seminario;
    }

    public void setSeminario(seminario011 seminario) {
        this.seminario = seminario;
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
