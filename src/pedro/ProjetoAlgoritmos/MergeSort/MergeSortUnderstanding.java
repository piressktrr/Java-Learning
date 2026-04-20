package pedro.ProjetoAlgoritmos.MergeSort;

public class MergeSortUnderstanding {

    public static void main(String[] args) {
        int[] array = new int[] { 8, 7, 4, 5, 2, 1, 3, 6};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void mergeSort(int[] array) {
        int comprimento = array.length;
        if (comprimento <= 1) return;

        int meio = comprimento / 2;
        int[] arrayEsquerda = new int[meio];
        int[] arrayDireito = new int[comprimento - meio];

        int esquerdaa = 0;
        int direitaa = 0;

        for (; esquerdaa < comprimento; esquerdaa++) {
            if (esquerdaa < meio ) {
                arrayEsquerda[esquerdaa] = array[esquerdaa];
            } else {
                arrayDireito[direitaa] = array[esquerdaa];
                direitaa++;
            }
        }

        mergeSort(arrayEsquerda);
        mergeSort(arrayDireito);
        merge(arrayEsquerda, arrayDireito, array);

    }

    private static void merge(int[] arrayEsquerda, int[] arrayDireita, int[] array) {
        int esquerdaTamanho = array.length / 2;
        int direitaTamanho = array.length - esquerdaTamanho;
        int esquerda = 0;
        int direita = 0;
        int original = 0;

        while (esquerda < esquerdaTamanho && direita < direitaTamanho) {
            if (arrayEsquerda[esquerda] < arrayDireita[direita]) {
                array[original] = arrayEsquerda[esquerda];
                original++;
                esquerda++;


            } else {
                array[original] = arrayDireita[direita];
                original++;
                direita++;

            }
        }
        while (esquerda < esquerdaTamanho) {
            array[original] = arrayEsquerda[esquerda];
            original++;
            esquerda++;
        }

        while (direita < direitaTamanho) {
            array[original] = arrayDireita[direita];
            original++;
            direita++;
        }
    }
}
