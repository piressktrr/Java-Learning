package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.pessoa020;

public class exercicio020Internet {
    public static void main(String[] args) {
        pessoa020 pessoa = new pessoa020();
        pessoa020 pessoa2 = new pessoa020();
        pessoa.setNome("Pedro");
        pessoa.setIdade(25);

        pessoa2.setNome("maria");
        pessoa2.setIdade(-1);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println();
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());

    }
}
