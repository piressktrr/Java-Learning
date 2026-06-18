package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.D;

import java.util.Objects;

public class Avaliacao {
    private String disciplina;
    private double nota;

    public Avaliacao(String disciplina, double nota) {
        this.disciplina = disciplina;
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida!");
        }
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setNota(double nota) {
        if (nota > 0){
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("Nota inválida!");
        }
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Avaliacao avaliacao = (Avaliacao) o;
        return Objects.equals(disciplina, avaliacao.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(disciplina);
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "disciplina='" + disciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}
