package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.RegistroDePonto;

import java.time.LocalTime;

public class ex002 {
    public static void main(String[] args) {
        RegistroDePonto p1 = new RegistroDePonto("Pedro", LocalTime.of(8, 0, 0),
                LocalTime.of(16, 0, 0));
        RegistroDePonto p2 = new RegistroDePonto("Maria", LocalTime.of(14, 0, 0),
                LocalTime.of(16, 0,  0));

        System.out.println("Duração do horário de trabalho do funcionário: " +p1.returnHoursWorked());
        p1.journey8HoursWorked();

        System.out.println("Duração do horário de trabalho do funcionário: " + p2.returnHoursWorked());
        p2.journey8HoursWorked();
    }
}
