package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Reuniao;

import java.time.LocalDate;

public class ex007 {


    public static void main(String[] args) {
        Reuniao reuniao = new Reuniao("Reunião de Branding", LocalDate.of(2026, 03, 28));
        System.out.println("A data da reunião é dia: " + reuniao.getDataAjustada());


    }
}
