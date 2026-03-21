package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.ReuniaoInternacional;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ex009 {
    public static void main(String[] args) {
        ReuniaoInternacional  r = new ReuniaoInternacional("Reuniao Privativa Internacional");
        r.setDataHorario(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.systemDefault()));
        final DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        System.out.println("Nome da reunião: " + r.getTitulo() + ", Data: " + r.retornarData());
        System.out.println();

        ZonedDateTime BrasilDateTime = ZonedDateTime.of(r.getDataHorario().toLocalDateTime(),
                ZoneId.of("America/Sao_Paulo"));

        ZoneId zoneIdNY = ZoneId.of("America/New_York");
        ZonedDateTime dateTimeNY = BrasilDateTime.withZoneSameInstant(zoneIdNY);

        ZoneId zoneIdLONDON = ZoneId.of("Europe/London");
        ZonedDateTime dateTimeLONDON = BrasilDateTime.withZoneSameInstant(zoneIdLONDON);

        ZoneId zoneIdTOKYO = ZoneId.of("Asia/Tokyo");
        ZonedDateTime dateTimeTOKYO = BrasilDateTime.withZoneSameInstant(zoneIdTOKYO);

        System.out.println("Horario da reunião em NY: " +dateTimeNY.format(fmt));
        System.out.println("Horario da reunião em Londres: " + dateTimeLONDON.format(fmt));
        System.out.println("Horario da reunião em Tóquio: " +  dateTimeTOKYO.format(fmt));
    }
}
