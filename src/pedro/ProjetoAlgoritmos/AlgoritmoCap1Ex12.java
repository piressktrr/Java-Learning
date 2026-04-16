package pedro.ProjetoAlgoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmoCap1Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // n x n A <- n é definido pelo usuario
        // 1 <= i, j <= n

        System.out.println("Insira o número do tamanho da matriz que você deseja: ");
        int matriz = input.nextInt();
        int temp = 1;
        int[][] array = new int[matriz][matriz];
        for (int i = 0; i < matriz; i++) {
            for (int j = 0; j < matriz; j++) {
                array[j][i] += temp;
                temp += 1;
            }
        }

        System.out.println("digite o número que você quer buscar! ");
        int busca = input.nextInt();
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == busca) {
                    System.out.println(array[i][j] + "na posiçao: " + pos);
                }
                pos++;
            }
        }
    }
}
