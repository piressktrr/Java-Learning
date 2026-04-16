package pedro.ProjetoAlgoritmos;

import java.util.Arrays;

public class testDivisaoEConquista {
    static void mergeSort(int[] arr, int esquerda, int direita) {
        if (esquerda >= direita) return;
        // direita é sempre o tamanho do array - 1;

        int meio = (esquerda + direita) / 2;
        // pega o meio do array

        mergeSort(arr, esquerda, meio);
        // passa tudo de novo, mas a direita sendo igual ao meio agora, pra ele poder retornar la em cima

        mergeSort(arr, meio + 1, direita);
        // quando ele retorna, ele coloca um número já ordenado
        // e depois coloca o segundo numero (os dois primeiros, menor para o maior respectivamente)

        // ele chama esse aqui que passa o meio + 1 sendo a esquerda, e deixa a direita como tava antes
        // fazendo assim ele retornar e voltar dnv, fazendo com q direita receba o valor passado inicialment

        merge(arr, esquerda, meio, direita); // combina as duas resoluçoes que ele fez (as duas primeiras)

        // ordena essas duas primeiras no arr e depois volta pra pegar as outras duas

    }


    static void merge(int[] arr, int esquerda, int meio, int direita) {
        int[] temporario = new int[direita - esquerda + 1];
        int i = esquerda, j = meio + 1, k = 0;
        // i recebe esquerda, j meio+1, k (variavel temporaria) = 0
        while (i <= meio && j <= direita) {
            if (arr[i] <= arr[j]) {
                temporario[k++] = arr[i++];
            } else {
                temporario[k++] = arr[j++];
            }
        }

        while (i <= meio) {
            temporario[k++] = arr[i++];
        }

        while (j <= direita) {
            temporario[k++] = arr[j++];
        }

        for (int l = 0; l < temporario.length; l++) {
            arr[esquerda + l] = temporario[l];
        }
    }

    public static void main(String[] args) {
        int[] array = {40, 20, 50, 5};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
