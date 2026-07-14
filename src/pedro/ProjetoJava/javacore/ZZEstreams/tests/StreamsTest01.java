package pedro.ProjetoJava.javacore.ZZEstreams.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private int idade;
    private TipoPessoa tipoPessoa;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.idade = idade;
        this.tipoPessoa = tipoPessoa;
    }


    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class StreamsTest01 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>
                (List.of(new Pessoa("Maria", 22),
                        new Pessoa("Pedro", 23),
                        new Pessoa("Joao", 24),
                        new Pessoa("Matheus", 25),
                        new Pessoa("Pedro", 23)));


        List<String > nomes = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .distinct()
                .filter(e -> e.getIdade() < 24)
                .limit(3)
                .map(Pessoa::getNome)
                .toList();

        System.out.println(nomes);

        Long a = pessoas.stream()
                .filter(e -> e.getIdade() > 23)
                .count();

        System.out.println(a);

    }
}
