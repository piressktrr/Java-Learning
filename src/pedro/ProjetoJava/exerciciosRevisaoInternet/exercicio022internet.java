package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.pessoa022;

public class exercicio022internet {
    public static void main(String[] args) {
        pessoa022 pessoa = new pessoa022();
        pessoa022 pessoa1 = new pessoa022("pedro");
        pessoa022 pessoa2 = new pessoa022("pedro", 10);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println();

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println();

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println();
    }
}
