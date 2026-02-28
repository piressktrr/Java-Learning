package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio011Internet {

    static void transposeArray(int[][] arrayTranspose) {
        int [][] newArray = new int [3][3];
        for (int i = 0; i < arrayTranspose.length; i++) {
            for (int j = 0; j < arrayTranspose[i].length; j++) {
                newArray[j][i] = arrayTranspose[i][j];
            }
        }
        System.out.println("The transpose of the array is: ");
        for (int[] ints : newArray) {
            System.out.println(Arrays.toString(ints));
        }
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter numbers for a Array of 3x3 size and see your transpose: ");
        int [][] array  = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = entrada.nextInt();
            }
        }
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("The normal array is: ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        transposeArray(array);
    }

}
