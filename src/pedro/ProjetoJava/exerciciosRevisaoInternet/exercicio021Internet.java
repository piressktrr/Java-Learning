package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.pessoa021;

public class exercicio021Internet {
    public static void main(String[] args) {
        pessoa021 pessoa = new pessoa021();

        pessoa.setNome("Pedro");
        pessoa.setIdade(25);

        pessoa.aniversario();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        pessoa.aniversario(2);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.aniversario(3, "é o aniversario dele");


    }
}
