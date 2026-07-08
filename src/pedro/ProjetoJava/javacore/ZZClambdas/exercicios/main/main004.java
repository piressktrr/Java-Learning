package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios4.Prioridade;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios4.TarefaRefactored;


public class main004 {
    public static void main(String[] args) {
        TarefaRefactored tarefaRefactored1  = new TarefaRefactored.Builder()
                .definirNome("teste1")
                .definirPrioridade(Prioridade.ALTA)
                .definirDescricao("Descrição1")
                .build();


        TarefaRefactored tarefaRefactored2  = new TarefaRefactored.Builder()
                .definirNome("teste2")
                .definirPrioridade(Prioridade.MEDIA)
                .definirDescricao("Descrição2")
                .build();


        TarefaRefactored tarefaRefactored3  = new TarefaRefactored.Builder()
                .definirNome("teste3")
                .definirPrioridade(Prioridade.BAIXA)
                .definirDescricao("Descrição3")
                .build();


        System.out.println(tarefaRefactored1);
        System.out.println(tarefaRefactored2);
        System.out.println(tarefaRefactored3);
    }
}
