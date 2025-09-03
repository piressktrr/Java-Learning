package pedro.ProjetoJava.javacore.Npolimorfismo.servico;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Computador;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Produto;

public class CalculadoraImposto {


    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do Computador: ");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do PC" + imposto);
        System.out.println("Nome do PC: " + computador.getNome());
        System.out.println("Valor do PC: " + computador.getValor());

    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto do: " + produto.getNome());
        double imposto = produto.calcularImposto();
        System.out.println("Imposto do " + produto.getNome() + ": " + imposto);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor do " + produto.getNome() + ": " + produto.getValor());
    }

}
