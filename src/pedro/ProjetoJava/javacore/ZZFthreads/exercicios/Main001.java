package pedro.ProjetoJava.javacore.ZZFthreads.exercicios;

import pedro.ProjetoJava.javacore.ZZFthreads.dominios.Produto;
import pedro.ProjetoJava.javacore.ZZFthreads.dominios.Servico;

public class Main001 {
    public static void main(String[] args) {
        Servico servico = new Servico();
        Produto produto1 = new Produto(1);
        Produto produto2 = new Produto(3);
        Produto produto3 = new Produto(2);

        for (int i = 0; i < 100; i++) {
            servico.comprar(produto1);
            servico.comprar(produto2);
            servico.comprar(produto3);
        }
    }
}
