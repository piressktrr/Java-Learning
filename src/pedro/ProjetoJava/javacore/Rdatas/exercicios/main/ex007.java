package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Reuniao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ex007 {

    public static void ajustarData(LocalDate reuniaoAjuste){

        TemporalAdjuster temporalAdjuster = DayOfWeek.from(reuniaoAjuste.getDayOfWeek());

        if (temporalAdjuster.equals(DayOfWeek.SATURDAY) || temporalAdjuster.equals(DayOfWeek.SUNDAY)){
            temporalAdjuster = TemporalAdjusters.next(DayOfWeek.MONDAY);
            System.out.println("A data foi reajustada para: "+
                    reuniaoAjuste.with(temporalAdjuster).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    + " - Um (a): " +
                    reuniaoAjuste.with(temporalAdjuster).getDayOfWeek() + " - Pois se tratava de um sábado ou domingo!");
        } else {
            System.out.println("Excelente, reunião marcada para o dia: " +
                    reuniaoAjuste.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }


    }

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Reuniao reuniao = new Reuniao("Reunião de Branding", "27/03/2026");
        LocalDate localReuniao = LocalDate.parse(reuniao.getData(), dtf);
        ajustarData(localReuniao);


    }
}
