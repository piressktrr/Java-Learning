package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.ReuniaoInternacional;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;

public class ex009 {
    public static void main(String[] args) {
        ReuniaoInternacional  r = new ReuniaoInternacional("Reuniao Privativa Internacional");
        System.out.println("Nome da reunião: " + r.getTitulo() + ", Data: " + r.getData() + ", Hora: " + r.getHorario());
        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime data =  LocalDateTime.parse(r.getData(), dtf);


        System.out.println("Horario em NY: " );
        System.out.println("Horario em Londres: ");
        System.out.println("Horario em Tóquio: ");
    }
}
