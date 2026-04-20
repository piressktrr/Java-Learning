package pedro.ProjetoAlgoritmos.exercicios;

public class MergeSortTest01 {
    static void mergeSort(int vetor[], int inicio, int j) {
        if (inicio < j) {
            int m = (inicio + j) / 2;
            mergeSort(vetor, inicio, m);
            mergeSort(vetor, m + 1, j);
        }
    }


    static void merge(int vetor[], int inicio, int j, int meio) {

    }
    public static void main(String[] args) {
        int vetor[] = new int[]{2,10,6,67};
        mergeSort(vetor, 0, vetor.length - 1);
    }
}
