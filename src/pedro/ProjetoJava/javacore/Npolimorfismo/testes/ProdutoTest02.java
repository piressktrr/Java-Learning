package pedro.ProjetoJava.javacore.Npolimorfismo.testes;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Computador;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Produto;
import pedro.ProjetoJava.javacore.Npolimorfismo.dominios.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("pc do pedro", 20);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        //produto é a variavel de referencia
        // com nome, valor e calcular imposto

        // o objeto é o computador, com os mesmos atributos do produto

        Produto produto2 = new Tomate("tomate cereja", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        // produto é um tipo generico e computador um tipo especifico
        // tudo oq produto tem, computador tem tambem, pois ele é seu filho
    }
}
