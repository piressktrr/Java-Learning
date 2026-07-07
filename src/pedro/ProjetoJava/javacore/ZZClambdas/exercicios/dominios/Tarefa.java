package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

public class Tarefa implements Identificavel<Long>{
    private String nomeTarefa;
    private String tipoTarefa;
    private Long ID;

    public Tarefa(String nomeTarefa, String tipoTarefa, Long ID ) {
        this.nomeTarefa = nomeTarefa;
        this.tipoTarefa = tipoTarefa;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", tipoTarefa='" + tipoTarefa + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }


    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public Long getId() {
        return this.ID;
    }
}
