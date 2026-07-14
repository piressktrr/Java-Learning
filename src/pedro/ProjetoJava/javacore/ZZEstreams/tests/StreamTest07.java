package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>(List.of(new Pessoa("pedro", 15, TipoPessoa.BRAVA),
                new Pessoa("joao", 21, TipoPessoa.MEDIANA),
                new Pessoa("gabriel", 60, TipoPessoa.MEDIANA),
                new Pessoa("leo", 23, TipoPessoa.CALMA)));

        Map<TipoPessoa, List<Pessoa>> a = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getTipoPessoa));
        System.out.println(a);

        Map<TipoPessoa, Map<FaixaEtaria, List<Pessoa>>> b =
                pessoas
                        .stream()
                        .collect(Collectors.groupingBy(Pessoa::getTipoPessoa,
                                Collectors.groupingBy(p -> (p.getIdade() < 18) ? FaixaEtaria.ADOLESCENTE : FaixaEtaria.ADULTO)));

        System.out.println(b);
    }
}
