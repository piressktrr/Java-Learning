package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class Main010 {
    public static void main(String[] args) {
        double[] horasTrabalhadas = {8.5, 7, 9, 6.5, 8, 4, 0};
        DoubleSummaryStatistics l = hoursToStatistics(horasTrabalhadas);

        System.out.println("Max: "+l.getMax());
        System.out.println("Min: "+l.getMin());
        System.out.println("Média: " +l.getAverage());
        System.out.println("Soma: "+l.getSum());
        System.out.println("Total n: "+l.getCount());
    }

    private static DoubleSummaryStatistics hoursToStatistics(double[] horasTrabalhadas) {
        return DoubleStream.of(horasTrabalhadas).summaryStatistics();
    }
}
