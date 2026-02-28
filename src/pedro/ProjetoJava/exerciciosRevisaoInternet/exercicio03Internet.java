package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio03Internet {

    static void jurosSimples (double capital, double taxa, int tempo){

        double juros = 0;
        taxa = taxa / 100;
        juros += capital * taxa * tempo;

        double montante = 0;
        montante += capital + juros;

        System.out.println("Seu juros é igual a: R$" + juros);
        System.out.println("----------------------------------------");
        System.out.println("Seu montante é igual a: R$" + montante);


    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu capital, taxa (em porcentagem) e o tempo (em meses) para a conta de juros simples ser feita: ");

        System.out.println("-----------------------------------------");
        double capital = entrada.nextDouble();
        double taxa = entrada.nextDouble();
        int tempo = entrada.nextInt();

        jurosSimples(capital, taxa, tempo);
    }
}
