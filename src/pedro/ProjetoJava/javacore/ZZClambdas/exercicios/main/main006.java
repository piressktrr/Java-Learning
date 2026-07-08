package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;


import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios6.RegraValidacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class main006 {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("a", "TIPO TAREFA", 4L,LocalDateTime.now());
        Tarefa tarefa1 = new Tarefa("a", "tipo tarefa 2", 4L, LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("a", "b", 0L,LocalDateTime.now());


        List<RegraValidacao<Tarefa>> regras = new ArrayList<>();

        RegraValidacao<Tarefa> regraTitulo = t -> t.getNomeTarefa() != null && !t.getNomeTarefa().isEmpty();
        RegraValidacao<Tarefa> regraTipo = t -> t.getTipoTarefa() != null && !t.getTipoTarefa().isEmpty();
        RegraValidacao<Tarefa> regraId = t -> t.getId() > 0;


        regras.add(regraTitulo);
        regras.add(regraTipo);
        regras.add(regraId);

        validarTodas(tarefa, regras);
        validarTodas(tarefa1, regras);
        validarTodas(tarefa2, regras);
    }

    private static void validarTodas(Tarefa tarefa, List<RegraValidacao<Tarefa>> regras) {
        System.out.println(regras.stream().allMatch(regra -> regra.validar(tarefa)));
    }
}
