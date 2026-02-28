package pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios;

public class seminario011 {
    private String titulo;
    private aluno011[] alunos;
    private local011 local;

    public seminario011(String titulo) {
        this.titulo = titulo;
    }

    public seminario011(String titulo, local011 local) {
        this.titulo = titulo;
        this.local = local;
    }



    public aluno011[] getAlunos() {
        return alunos;
    }

    public void setAlunos(aluno011[] alunos) {
        this.alunos = alunos;
    }

    public local011 getLocal() {
        return local;
    }

    public void setLocal(local011 local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
