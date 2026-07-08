package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tarefa implements Identificavel<Long>{
    private String nomeTarefa;
    private String tipoTarefa;
    private Long id;
    private LocalDateTime dataCriacao;
    private List<HistoricoAlteracao> historicoAlteracao = new ArrayList<>();

    public Tarefa(String nomeTarefa, String tipoTarefa, Long ID, LocalDateTime dataCriacao ) {
        this.nomeTarefa = nomeTarefa;
        this.tipoTarefa = tipoTarefa;
        this.id = ID;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", tipoTarefa='" + tipoTarefa + '\'' +
                ", ID=" + id +
                '}';
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }


    public String getTipoTarefa() {
        return tipoTarefa;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    public void registrarAlteracao(String campo, Object valorAntigo, Object novoValor) {
        historicoAlteracao.add(new HistoricoAlteracao(campo, valorAntigo, novoValor));
    }

    public void checkAlteracao() {
        for (HistoricoAlteracao alteracao : historicoAlteracao) {
            System.out.println("Tarefa alterada:  " + alteracao.campo + " - " + alteracao.valorAntigo + " - " + alteracao.novoValor + " - "
                    + alteracao.dataCriacaoAlt  );
            System.out.println("--------");
        }
    }

    class HistoricoAlteracao {
        String campo;
        String novoValor;
        String valorAntigo;

        LocalDateTime dataCriacaoAlt;

        public HistoricoAlteracao(String campo, Object valorAntigo, Object novoValor) {

            if (campo.equalsIgnoreCase("NomeTarefa")) {
                this.campo = nomeTarefa;
                this.novoValor = novoValor.toString();
                this.valorAntigo = valorAntigo.toString();
            } else if (campo.equalsIgnoreCase("TipoTarefa")) {
                this.campo = tipoTarefa;
                this.novoValor = novoValor.toString();
                this.valorAntigo = valorAntigo.toString();
            } else {
                throw new IllegalArgumentException("Coloque algum argumento válido!");
            }

            this.dataCriacaoAlt = LocalDateTime.now();

        }

    }
}
