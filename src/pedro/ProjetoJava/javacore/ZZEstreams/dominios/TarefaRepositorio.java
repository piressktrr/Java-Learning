package pedro.ProjetoJava.javacore.ZZEstreams.dominios;

import java.time.LocalDate;
import java.util.List;

public class TarefaRepositorio {
    private static List<Tarefa> tarefas = List.of
            (new Tarefa(40L, "Lista de Pessoas", Categoria.Backend, "Pedro", 3,
                            2.0, LocalDate.of(2026, 7, 15), false),
                    new Tarefa(40L, "DIV", Categoria.Frontend, "Pedro", 1, 1.5,
                            LocalDate.now(), true),
                    new Tarefa(60L, "Banco de dados", Categoria.Banco_de_Dados, "Joao", 2,
                            4.0, LocalDate.of(2026, 7, 10), false),
                    new Tarefa(60L, "App Mobile", Categoria.Mobile, "Joao", 2,
                            6.0, LocalDate.of(2026, 7, 20), false),
                    new Tarefa(80L, "Requisiçao API", Categoria.Backend, "Maria", 1,
                            1.0, LocalDate.of(2026, 7, 15), true),
                    new Tarefa(90L, "Subir na nuvem", Categoria.DevOps, "Matheus", 1,
                            2.0, LocalDate.of(2026, 7, 14), true),
                    new Tarefa(100L, "Tabela SQL", Categoria.Banco_de_Dados, "Joaquim", 3,
                            2.5, LocalDate.of(2026, 7, 17), false),
                    new Tarefa(110L, "Refatorar Funcionalidade Java", Categoria.Backend, "Lorran", 1,
                            3.5, LocalDate.of(2026, 7, 30), true),
                    new Tarefa(25L, "Definir Design", Categoria.Frontend, "Enzo", 2, 2.25,
                            LocalDate.of(2026, 7, 15), true),
                    new Tarefa(25L, "Ajustar Android", Categoria.Mobile, "Enzo", 1, 5.0,
                            LocalDate.of(2026, 8, 12), false),
                    new Tarefa(80L, "Checar Entidades", Categoria.Backend, "Maria",  4, 0.5,
                            LocalDate.of(2026, 7, 30), false),
                    new Tarefa(125L, "Criar API Rest", Categoria.Backend, "Souza", 1, 6.0,
                            LocalDate.of(2026, 7, 19), true));

    public static List<Tarefa> getTarefas() {
        return tarefas;
    }
}
