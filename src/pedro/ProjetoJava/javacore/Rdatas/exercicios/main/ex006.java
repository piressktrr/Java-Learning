package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class ex006 {
    public static String daysForBirthday(LocalDate dateOfBirth) {

        LocalDate birthDate = dateOfBirth;
        LocalDate today = LocalDate.now();
        birthDate = birthDate.withYear(today.getYear());

        long daysUntilBirthDate = ChronoUnit.DAYS.between(today, birthDate);

        if (daysUntilBirthDate < 0) {
            birthDate = birthDate.withYear(today.getYear() + 1);
            daysUntilBirthDate = ChronoUnit.DAYS.between(today, birthDate);
            return "Your bday is already passed!, but, to your next birthday is " + daysUntilBirthDate + " days left!";
        } else if (daysUntilBirthDate == 0) {
            return "Happy bday twin!!!";
        } else {
            return "From now to your birthday is "+daysUntilBirthDate +" days left!";
        }
    }

    public static void main(String[] args) {
        System.out.println(daysForBirthday(LocalDate.of(2008, 05, 15)));

    }


}
