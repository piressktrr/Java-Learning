package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E;

public class Chamado implements Comparable<Chamado>{
    private int id;
    private String descricao;
    private Nivel nivel;

    public Chamado(int id, String descricao, Nivel nivel) {
        this.id = id;
        this.descricao = descricao;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Nivel getNivel() {
        return nivel;
    }

    @Override
    public int compareTo(Chamado o) {
        return this.nivel.compareTo(o.nivel);
    }

    @Override
    public String toString() {
        return "Chamado{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
