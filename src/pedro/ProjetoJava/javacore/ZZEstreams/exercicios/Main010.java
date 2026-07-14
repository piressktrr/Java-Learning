package pedro.ProjetoJava.javacore.ZZEstreams.exercicios;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Main010 {
    public static void main(String[] args) {
        double[] horasTrabalhadas = {8.5, 7, 9, 6.5, 8, 4, 0};

        Arrays.sort(horasTrabalhadas);
        double a = DoubleStream.of(horasTrabalhadas).summaryStatistics().getAverage();
        double t = DoubleStream.of(horasTrabalhadas).summaryStatistics().getSum();
        double m = DoubleStream.of(horasTrabalhadas).summaryStatistics().getMax();
        double mn = DoubleStream.of(horasTrabalhadas).summaryStatistics().getMin();

        System.out.println(a);
        System.out.println(t);
        System.out.println(m);
        System.out.println(mn);

        // aqui eu pensei em só usar o doublesummarystatistics direto mas o exercicio pede o arraystream/doublestream
    }
}
