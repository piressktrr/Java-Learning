package pedro.ProjetoAlgoritmos.MergeSort;

public class MergeSort01 {

    private static void mergeSort(double[] array) {

        int comprimento = array.length;
        if (comprimento <= 1) {
            return;
        }

        int meio = comprimento / 2;

        int esquerdaSize = meio;
        int direitaSize = comprimento - esquerdaSize;

        double[] arrayEsquerda =  new double[esquerdaSize];
        double[] arrayDireita =  new double[direitaSize];

        int direita = 0, esquerda = 0;

        for (int i = 0; esquerda < comprimento; esquerda++) {
            if (esquerda < meio) {
                arrayEsquerda[esquerda] = array[esquerda];


            } else {
                arrayDireita[direita] = array[esquerda];
                direita++;
            }

        }
        mergeSort(arrayEsquerda);
        mergeSort(arrayDireita);
        merge(array, arrayEsquerda, arrayDireita);
    }

    private static void merge(double[] arrayOriginal, double[] arrayEsquerda, double[] arrayDireita) {
        int esquerdaSize = arrayEsquerda.length;
        int direitaSize = arrayDireita.length;

        int esquerda = 0, direita = 0, original = 0;
        while (esquerda < esquerdaSize && direita < direitaSize) {
            if (arrayEsquerda[esquerda] < arrayDireita[direita]) {
                arrayOriginal[original] = arrayEsquerda[esquerda];
                original++;
                esquerda++;

            } else {
                arrayOriginal[original] = arrayDireita[direita];
                original++;
                direita++;
            }
        }

        while (esquerda < esquerdaSize) {
            arrayOriginal[original] = arrayEsquerda[esquerda];
            original++;
            esquerda++;
        }

        while (direita < direitaSize) {
            arrayOriginal[original] = arrayDireita[direita];
            original++;
            direita++;
        }
    }

    public static void main(String[] args) {
        double[] array = new double[] {31.5, 18.2, 25.0, 9.8, 42.1, 15.3, 28.7};

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // dar um tempo e explicar esse código depois
        // pesquisar se todo mergesort é assim (um merge e um mergesort de metodo e feito para organizar numeros)

    }
}
