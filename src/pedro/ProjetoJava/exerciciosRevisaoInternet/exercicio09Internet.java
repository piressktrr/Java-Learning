package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio09Internet {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("write five numbers to see the sum of them: ");
        int [] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = entrada.nextInt();
        }
        int sum = 0;
        for (int numero : numeros) {
            sum += numero;
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}
