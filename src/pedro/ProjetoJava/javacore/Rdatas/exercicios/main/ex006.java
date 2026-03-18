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
        birthDate = birthDate.withYear(2026);

        long daysUntilBirthDate = ChronoUnit.DAYS.between(today, birthDate);
        if (daysUntilBirthDate < 0) {
            System.out.println("Your bday is already passed!");
        } else if (daysUntilBirthDate == 0) {
            System.out.println("Happy bday twin!!!");
        } else {
            System.out.println("From now to your birthday is "+daysUntilBirthDate +" days left!");
        }
    }

    public static void main(String[] args) {
       daysForBirthday("15/05/2008");

    }


}
