package pedro.ProjetoJava.javacore.ZZHdesignpatterns.tests;

import pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios.Pessoa;

public class BuilderTest01 {
    public static void main(String[] args) {
         Pessoa build = new Pessoa.Builder()
                .setCidade("a")
                .setIdade(1)
                .setNome("b")
                .build();

    }
}
