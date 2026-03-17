package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ex006 {
    public static void daysForBirthday(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        LocalDate today = LocalDate.ofEpochDay(LocalDate.now().getMonthValue());
        System.out.println(today);
    }

    public static void main(String[] args) {
       daysForBirthday("15/05/2008");
    }
}
