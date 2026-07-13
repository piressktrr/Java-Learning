package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios5.Pacote;

import java.util.function.BiFunction;


public class main005 {
    public static void main(String[] args) {
        Pacote pacote = new Pacote("blusa", 0.200, 100.0);
        Pacote pacote2 = new Pacote("tenis", 1.200, 45.0);
        Pacote pacote3 = new Pacote("monitor", 1.400, 20.0);


        BiFunction<Double, Double, Double> freteNormal = (peso, km) ->  (peso * km) / 10;

        BiFunction<Double, Double, Double> freteTotalComDesconto = freteNormal.andThen(m -> m * 0.2 );

        System.out.println(freteTotalComDesconto.apply(pacote.getPesoPacoteKg(), pacote.getDistanciaPacoteKm()));
        System.out.println(freteTotalComDesconto.apply(pacote2.getPesoPacoteKg(), pacote2.getDistanciaPacoteKm()));
        System.out.println(freteTotalComDesconto.apply(pacote3.getPesoPacoteKg(), pacote3.getDistanciaPacoteKm()));

    }
}
