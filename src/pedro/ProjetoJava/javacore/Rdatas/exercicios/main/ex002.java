package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.RegistroDePonto;

public class ex002 {
    public static void main(String[] args) {
        RegistroDePonto p1 = new RegistroDePonto("Pedro", 14, 16);

        System.out.println("Duração do horário de trabalho do funcionário: " +p1.returnHoursWorked());
        p1.journey8HoursWorked();
    }
}
