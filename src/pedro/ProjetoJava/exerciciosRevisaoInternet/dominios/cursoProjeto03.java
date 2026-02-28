package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public abstract class cursoProjeto03 {
    private String nomeCurso;
    private String professor;
    private int cargaHoraria;
    private String[] alunos;
    public static int totalCursos;

    public cursoProjeto03(String nomeCurso, String professor, int cargaHoraria, String[] alunos) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }

    public abstract void  gerarCertificado();
    public abstract void calcularNotaFinal(double[] notaFinal);

    public abstract void adicionarAluno(String... alunos);



    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String nome) {
        if (nome == null) {
            return;
        }
        this.nomeCurso = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public static int getTotalCursos() {
        return totalCursos;
    }
}
