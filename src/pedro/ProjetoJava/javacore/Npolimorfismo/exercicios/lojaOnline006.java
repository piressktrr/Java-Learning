package pedro.ProjetoJava.javacore.Npolimorfismo.exercicios;

import pedro.ProjetoJava.javacore.Npolimorfismo.dominiosExercicios.ProdutoOnline;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Eletronico;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Livro;
import pedro.ProjetoJava.javacore.Npolimorfismo.serviçosExercicios.Roupa;

import java.util.ArrayList;
import java.util.Locale;

public class lojaOnline006 {
    public static void main(String[] args) {
        ProdutoOnline livro = new Livro("noites brancas", 12.50);
        ProdutoOnline eletronico = new Eletronico("mouse redragon cobra", 150.0);
        ProdutoOnline roupa = new Roupa("shirt yeezus X cactusjack", 750.0);

        ArrayList<ProdutoOnline> produtos = new ArrayList<ProdutoOnline>();
        produtos.add(livro);
        produtos.add(eletronico);
        produtos.add(roupa);


        double valorFinal = 0;
        for (ProdutoOnline produto : produtos) {
            double valorTeste = 0;
            System.out.println("O Preço do produto: " +produto.pegarNome().toUpperCase(Locale.ROOT) + " é igual a: R$" + produto.pegarPreco());
            valorFinal += produto.calcularDesconto();
            valorTeste += produto.calcularDesconto();
            System.out.println("Com o desconto, o produto tem valor igual a:  R$" + valorTeste);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        System.out.println("O preço final dos produtos é igual a: R$" + valorFinal);
    }
}
