package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio02Internet {
    static void numToFactorial(int num) {
        int valor = 1;
        for (int i = num; i > 0; i--) {
            System.out.print( i + " x ");
            valor = i * valor;
        }
        System.out.println( " = " + valor);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numeroInformado = sc.nextInt();
        numToFactorial(numeroInformado);

    }
}
