package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

public class ex006 {
    public static void daysForBirthday(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate today = LocalDate.now();
        System.out.println(birthDate.getDayOfMonth() + " " + birthDate.getMonthValue());
        if (birthDate.getDayOfMonth() == today.getDayOfMonth() &&  birthDate.getMonthValue() == today.getMonthValue()) {
            System.out.println("Parabéns, hoje é seu aniversário!!");
        } else {

        }
    }

    public static void main(String[] args) {
       daysForBirthday("15/05/2008");

    }


}
