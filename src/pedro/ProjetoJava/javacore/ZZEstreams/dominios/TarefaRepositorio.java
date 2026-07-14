package pedro.ProjetoJava.javacore.ZZEstreams.dominios;

import java.time.LocalDate;
import java.util.List;

public class TarefaRepositorio {
    public static List<Tarefa> tarefas = List.of
            (new Tarefa(40L, "Lista de Pessoas", Categoria.Backend, "Pedro", 3,
                            2.0, LocalDate.of(2026, 07, 15), false),
                    new Tarefa(50L, "DIV", Categoria.Frontend, "Pedro", 1, 1.5,
                            LocalDate.now(), true),
                    new Tarefa(60L, "Banco de dados", Categoria.Banco_de_Dados, "Joao", 2,
                            4.0, LocalDate.of(2026, 07, 10), false),
                    new Tarefa(70L, "App Mobile", Categoria.Mobile, "Joao", 2,
                            6.0, LocalDate.of(2026, 07, 20), false),
                    new Tarefa(80L, "Requisiçao API", Categoria.Backend, "Maria", 1,
                            1.0, LocalDate.of(2026, 07, 15), true),
                    
}
