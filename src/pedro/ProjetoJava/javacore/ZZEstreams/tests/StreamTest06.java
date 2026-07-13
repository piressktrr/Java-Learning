package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>
                (List.of(new Pessoa("Maria", 22),
                        new Pessoa("Pedro", 23),
                        new Pessoa("Joao", 24),
                        new Pessoa("Matheus", 25),
                        new Pessoa("Pedro", 23)));

        System.out.println(pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getIdade)));
        DoubleSummaryStatistics statistics = pessoas.stream().collect(Collectors.summarizingDouble(Pessoa::getIdade));

        String r = pessoas.stream().map(Pessoa::getNome).collect(Collectors.joining(", "));
        System.out.println(r);
        System.out.println(statistics.getMax());
    }
}
