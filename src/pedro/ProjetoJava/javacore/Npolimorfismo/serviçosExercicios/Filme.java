package pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.Midia;

public class Filme extends Midia {
    private String nome;
    private double duracao;

    public Filme(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public double play() {
        return 0;
    }

    @Override
    public double getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
