package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio018Internet {
    static void indexArray (int [] array, int index){
        int position = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] == index){
                position = i;
                break;
            }
        }
        if (position == 0) {
            System.out.println("O array não contem este número.");
        } else {
            System.out.println("O número " + index + " foi encontrado na posição " + position + " do array.");
        }
    }







    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int[6];
        System.out.println("Type an array of six numbers: ");
        for (int i = 0; i < vetor.length; i++) {
            int numero = entrada.nextInt();
            vetor[i] = numero;
        }

        System.out.println("Now, type an number and the program will return the index of it: ");
        int index  = entrada.nextInt();
        indexArray(vetor, index);
    }
}
