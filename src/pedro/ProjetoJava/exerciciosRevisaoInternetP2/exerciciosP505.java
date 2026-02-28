package pedro.ProjetoJava.exerciciosRevisaoInternetP2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.produtoAlimenticio05;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.produtoEletronico05;

public class exerciciosP505 {

    public static void main(String[] args) {
        produtoAlimenticio05 comida = new produtoAlimenticio05("1231", "maça", 10);
        produtoEletronico05 eletronico = new produtoEletronico05("123141", "pc", 2000);


        System.out.println(comida.getNome());
        System.out.println(comida.calcularPrecoFinal());
        System.out.println(comida.aplicarDesconto(2));

        System.out.println();

        System.out.println(eletronico.getNome());
        System.out.println(eletronico.calcularPrecoFinal());
        System.out.println(eletronico.aplicarDesconto(100));
    }
}
