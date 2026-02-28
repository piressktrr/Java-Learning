package pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios;

public class professor011 {
    private String nome;
    private String especialidade;
    private seminario011[] seminarios;

    public professor011(String nome) {
        this.nome = nome;
    }

    public professor011(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public professor011(String nome, String especialidade, seminario011[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public seminario011[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(seminario011[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
