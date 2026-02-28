package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio010Internet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Write five numbers and discover which of them is the largest: ");
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = entrada.nextInt();
        }

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("The largest number is " + max);
    }
}
