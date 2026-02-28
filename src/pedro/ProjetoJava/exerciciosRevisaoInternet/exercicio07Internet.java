package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio07Internet {


    public int fatorial(int n) {
        if (n == 0){
            return 1;
        }

        return n * fatorial(n-1);
    }

    static void piramideSomando(int numero){

        for (int i = 0; i <= numero; i++){
            exercicio07Internet fatorial = new exercicio07Internet();
            for (int j = 0; j <= numero - i; j++){

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){

                System.out.print(" " +
                        fatorial.fatorial(i) /
                        (fatorial.fatorial(i - j) * fatorial.fatorial(j)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para criar uma piramide que cresce em seu meio: ");
        int numero = entrada.nextInt();

        piramideSomando(numero);
    }
}
