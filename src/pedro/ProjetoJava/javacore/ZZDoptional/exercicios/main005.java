package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios5.Pacote;

import java.util.function.BiFunction;
import java.util.function.Function;

public class main005 {
    public static void main(String[] args) {
        Pacote pacote = new Pacote("blusa", 2.0, 100.0);

        BiFunction<Double, Double, Double> frete = (peso, km) -> (peso / 0.5) * km;

        BiFunction<Double, Double, Double> freteTotalComDesconto = frete.andThen(r -> 100 - r);

        System.out.println(freteTotalComDesconto.apply(pacote.getPesoPacote(), pacote.getPesoPacote()));


    }
}
