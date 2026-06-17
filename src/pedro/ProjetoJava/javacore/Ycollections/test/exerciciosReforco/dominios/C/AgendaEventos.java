package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.C;


import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private NavigableSet<Evento> eventos = new TreeSet<>();

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

        return eventos.subSet(eventos.getFirst(), true, eventos.getLast(), true);
    }

    public NavigableSet<Evento> eventosAPartirDe(LocalDate data) {
        Evento  eventoTest = new Evento("", data);
        return eventos.tailSet(eventoTest, true);
    }

}
