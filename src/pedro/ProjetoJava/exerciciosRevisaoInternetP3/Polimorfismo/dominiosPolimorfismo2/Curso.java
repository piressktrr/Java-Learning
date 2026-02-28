package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2;

public abstract class Curso implements Avaliavel, Certificavel{
    private String titulo;
    private int cargaHoraria;
    private String aluno;

    public Curso(String titulo, int cargaHoraria, String aluno) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.aluno = aluno;
    }

    public abstract double calcularProgresso();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && titulo.isBlank()) {
            return;
        }
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria < 0){
            return;
        }
        this.cargaHoraria = cargaHoraria;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        if (aluno != null && aluno.isBlank()) {
            return;
        }
        this.aluno = aluno;
    }
}
