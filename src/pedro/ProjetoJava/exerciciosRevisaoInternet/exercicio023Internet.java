package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.pessoaDef;

public class exercicio023Internet {
    public static void main(String[] args) {
        pessoaDef pessoa = new pessoaDef("pedro", 17);
        pessoaDef pessoa1 = new pessoaDef("maria", 20);
        pessoaDef pessoa2 = new pessoaDef("enzo", 21);
        pessoaDef pessoa3 = new pessoaDef("HECK", 22);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println();
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println();
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println();

        System.out.println("A quantidade de pessoas no projeto é: " +pessoaDef.getQuantidadeDePessoas());

    }

}
