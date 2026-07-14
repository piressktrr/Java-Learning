package pedro.ProjetoJava.javacore.ZZEstreams.dominios;

import java.time.LocalDate;

public class Tarefa {
    private Long id;
    private String titulo;
    private Categoria categoria;      // "Backend", "Frontend", "Banco de Dados", "DevOps", "Mobile"
    private String responsavel;
    private int prioridade;        // 1 (alta) até 5 (baixa)
    private double horasEstimadas;
    private LocalDate prazo;
    private boolean concluida;

    public Tarefa(Long id, String titulo, Categoria categoria, String responsavel, int prioridade,
                  double horasEstimadas, LocalDate prazo, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.horasEstimadas = horasEstimadas;
        this.prazo = prazo;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", categoria=" + categoria +
                ", responsavel='" + responsavel + '\'' +
                ", prioridade=" + prioridade +
                ", horasEstimadas=" + horasEstimadas +
                ", prazo=" + prazo +
                ", concluida=" + concluida +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
