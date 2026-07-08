package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios10.Notificador;
import pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios10.TarefaNot;

import java.time.LocalDate;

public class main010 {
    public static void main(String[] args) {
        Notificador<TarefaNot> notificador = new Notificador<>(texto -> System.out.println("Tarefa criada! : " +texto));
        TarefaNot t1 = new TarefaNot("Tarefa um", "Tarefa teste", LocalDate.now());
        TarefaNot t2 = new TarefaNot("Tarefa dois", "Tarefa teste dois",
                LocalDate.of(2026, 07, 07));

        // eu pensei que aqui o notificar e o maior tinham que ir dentro do tarefa not, não no main
        // tanto que ficou bem mais simples fazendo assim
        notificador.notificar(t1);
        notificador.notificar(t2);

        System.out.println("Dentre as tarefas, qual tem o prazo mais distante?: " + Notificador.maior(t1, t2));
    }
}
