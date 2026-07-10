package pedro.ProjetoJava.javacore.ZZDoptional.dominios3;

import java.util.Optional;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Endereco endereco;

    public Funcionario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Funcionario(String nome, Integer idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Optional<String> returnComplemento() {
        return Optional.ofNullable(endereco.getComplemento());
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }
}
