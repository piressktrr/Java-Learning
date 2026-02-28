package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio08Internet {
    static void estrela(int n){
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" " + "*");
            }
            System.out.println();

        }
        for (int i = 0; i <= n; i++) {

            for (int j = -1; j <=i; j++) {
                System.out.print(" ");
            }

            for (int k = n; k >= i; k--) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero para o tamanho e criar uma estrela de asteriscos: ");
        int numero = entrada.nextInt();
        estrela(numero);
    }
}
