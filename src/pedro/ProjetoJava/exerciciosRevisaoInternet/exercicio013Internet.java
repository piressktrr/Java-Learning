package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio013Internet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int[8];
        int [] vetorRetirarDuplicadas = new int[8];
        int [] vetorSemDuplicadas = new int[8];
        int contador = 0;
        int duplicado = 0;


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            duplicado = vetor[i];

            vetorRetirarDuplicadas[i] = vetor[i];

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] == duplicado) {
                    vetorRetirarDuplicadas[i] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetorRetirarDuplicadas[i] > 0) {
                contador++;
                vetorSemDuplicadas[i] = vetorRetirarDuplicadas[i];
            }
        }


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(Arrays.toString(vetorSemDuplicadas));


    }
}
