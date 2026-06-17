package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class AgendaEventos {
    private TreeSet<Evento> eventos = new TreeSet<>();

    public void adicionarEvento(Evento evento) {
        if (evento == null || eventos.contains(evento)) return;
        eventos.add(evento);
    }

    public Evento proximoEvento() {
        Evento eventoTest = new Evento("", LocalDate.now());

        return eventos.higher(eventoTest);
    }

    public Evento eventoAnterior() {
        Evento eventoTest = new Evento("", LocalDate.now());

        return eventos.lower(eventoTest);
    }

    public NavigableSet<Evento> eventosDesseMes() {
        NavigableSet<Evento> eventosMes = new TreeSet<>();
        for (Evento evento : eventos) {
            if (evento.getData().getMonth() == LocalDate.now().getMonth()) {
                eventosMes.add(evento);
            }
        } // dewve ter algum jeito de nao ter que criar um navigableset so para isso


        return eventosMes.subSet(eventosMes.getFirst(), true, eventosMes.getLast(), true);
    }

    public NavigableSet<Evento> eventosAPartirDe(LocalDate data) {
        for(Evento evento : eventos){
            if (evento.getData().equals(data)) {
                return eventos.tailSet(evento, true);
            }
        }
        return null;
    }

//    public TreeSet<Evento> eventoAnterior(NavigableSet<Evento> eventos) {}
//    public TreeSet<Evento> eventosDesseMes(NavigableSet<Evento> eventos) {}
//    public TreeSet<Evento> eventosAPartirDe(NavigableSet<Evento> eventos) {}
}
