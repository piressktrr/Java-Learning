package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.ReuniaoInternacional;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ex009 {
    public static void main(String[] args) {
        ReuniaoInternacional  r = new ReuniaoInternacional("Reuniao Privativa Internacional");
        System.out.println("Nome da reunião: " + r.getTitulo() + ", Data: " + r.getData() + ", Hora: " + r.getHorario());
        System.out.println();

        LocalDate localDate = LocalDate.parse(r.getData(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalTime localTime = LocalTime.parse(r.getHorario(), DateTimeFormatter.ofPattern("HH:mm:ss"));

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        String dataFormatada = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        ZonedDateTime BrasilDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());

        System.out.println(dataFormatada);

        ZoneId zoneIdNY = ZoneId.of("America/New_York");
        ZonedDateTime NY = BrasilDateTime.withZoneSameInstant(zoneIdNY);

        ZoneId zoneIdLONDON = ZoneId.of("Europe/London");
        ZonedDateTime LONDON = BrasilDateTime.withZoneSameInstant(zoneIdLONDON);

        ZoneId zoneIdTOKYO = ZoneId.of("Asia/Tokyo");
        ZonedDateTime TOKYO = BrasilDateTime.withZoneSameInstant(zoneIdTOKYO);

        System.out.println("Horario em NY: "  + NY.getHour() + ":" + NY.getMinute() + ":" + NY.getSecond());
        System.out.println("Horario em Londres: " + LONDON.getHour() + ":" + LONDON.getMinute() +
                ":" +LONDON.getSecond());
        System.out.println("Horario em Tóquio: " +  TOKYO.getHour() + ":" + TOKYO.getMinute() +
                ":" + TOKYO.getSecond());
    }
}
