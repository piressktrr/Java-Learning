package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios3.Par;

public class main003 {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("teste", "somente teste", 42L);

        Par<Tarefa, Boolean> teste1 = Par.create(tarefa, true);
        Par<Tarefa, Boolean> teste2 = Par.create(tarefa, false);
        Par<String, Integer> teste3 = Par.create("Pedro", 18);


        System.out.println(teste1.getPrimeiro());
        System.out.println(teste1.getSegundo());
        System.out.println("--------------------------");

        System.out.println(teste2.getPrimeiro());
        System.out.println(teste2.getSegundo());
        System.out.println("--------------------------");

        System.out.println(teste3.getPrimeiro());
        System.out.println(teste3.getSegundo());

    }
}
