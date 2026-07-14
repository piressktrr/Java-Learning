package pedro.ProjetoJava.javacore.ZZEstreams.tests;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamTest08 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(List.of(new Pessoa("pedro", 15, TipoPessoa.BRAVA),
                new Pessoa("joao", 21, TipoPessoa.MEDIANA),
                new Pessoa("gabriel", 60, TipoPessoa.MEDIANA),
                new Pessoa("leo", 23, TipoPessoa.CALMA)));

        Map<TipoPessoa, Pessoa> separarPorMaiorIdadePorCategoria =
                pessoas.stream().collect(Collectors.groupingBy(Pessoa::getTipoPessoa,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Pessoa::getIdade)), Optional::get
                        )));

        Map<TipoPessoa, Pessoa> mesmoDoDeCimaPoremMaisSimples =
                pessoas.stream().collect(Collectors.toMap(Pessoa::getTipoPessoa,
                        Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Pessoa::getIdade))));

        System.out.println(separarPorMaiorIdadePorCategoria);

    }
}
