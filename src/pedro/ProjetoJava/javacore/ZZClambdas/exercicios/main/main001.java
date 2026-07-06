package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.RepositorioEmMemoria;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;

public class main001 {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("almoçar", "fome", 4242L);
        Tarefa tarefa2 = new Tarefa("correr", "exercicio", 2312L);


        RepositorioEmMemoria repoMem = new RepositorioEmMemoria();
        repoMem.salvar(tarefa1.getID());

    }
}
