package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio014Internet {

    static void occurences(int [] array, int remove){
        int [] arrayTemp = new int[array.length];
        int pass = 0;
        int pass2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == remove) {
                pass++;
            } else {
                arrayTemp[i] = array[i];
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Array without the number you type to remove: ");
        for (int i = 0; i < array.length; i++) {
            if (arrayTemp[i] == 0) {
                pass++;
            } else {
                System.out.print(arrayTemp[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [5];
        System.out.println("Type five numbers into an array: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Type a number you want to remove from this array: ");
        int remove = entrada.nextInt();
        System.out.println("Array if the number you want remove: "+Arrays.toString(numeros));
        occurences(numeros, remove);
    }
}
