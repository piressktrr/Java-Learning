package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios.Tarefa;

import java.time.LocalDateTime;

public class main009 {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Tarefa 1", "teste tarefa", 40L,  LocalDateTime.now());
        Tarefa tarefa2 = new Tarefa("Tarefa 2", "teste tarefa2 ", 42L,  LocalDateTime.now());

        tarefa1.registrarAlteracao("NomeTarefa",  "fodase", "valor novo");
        tarefa2.registrarAlteracao("TipoTarefa", "fodase", "valor novo");
        tarefa1.checkAlteracao();
        tarefa2.checkAlteracao();
    }
}
