package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C.AgendaEventos;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C.Evento;

import java.time.LocalDate;

public class reforcoC {
    public static void main(String[] args) {
        Evento evento = new Evento("evento 1", LocalDate.now());
        Evento evento1 = new Evento("evento 2", LocalDate.of(2026, 5, 30));
        Evento eventoA = new Evento("evento A", LocalDate.of(2026, 5, 28));
        Evento evento2 = new Evento("evento 3", LocalDate.of(2026, 4, 25));
        Evento eventoB = new Evento("evento B", LocalDate.of(2026, 5, 4));

        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(evento);
        agenda.adicionarEvento(evento1);
        agenda.adicionarEvento(evento2);
        agenda.adicionarEvento(eventoA);
        agenda.adicionarEvento(eventoB);

        System.out.println(agenda.proximoEvento());
        System.out.println();
        System.out.println(agenda.eventoAnterior());
        System.out.println();
        System.out.println(agenda.eventosDesseMes());
        System.out.println();
        System.out.println(agenda.eventosAPartirDe(LocalDate.now()));
    }
}
