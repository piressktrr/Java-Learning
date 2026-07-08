package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios10;

import java.time.LocalDate;


public class TarefaNot implements Comparable<TarefaNot>{
    private String nomeTarefa;
    private String descrição;
    private LocalDate dataTarefa;




    public TarefaNot(String nomeTarefa, String descrição, LocalDate dataTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.descrição = descrição;
        this.dataTarefa = dataTarefa;

    }

    @Override
    public String toString() {
        return "TarefaNot{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", descrição='" + descrição + '\'' +
                ", dataTarefa=" + dataTarefa +
                '}';
    }

    @Override
    public int compareTo(TarefaNot o) {
        return  this.dataTarefa.compareTo(o.dataTarefa);
    }
}
