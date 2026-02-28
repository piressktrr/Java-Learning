package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class miniProjeto02 {

    static void binarySearch (int [] array, int value){
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high)/2;

        int positionFinal = 0;

        for (int i=low; i<=high; i++){
            if (array[mid] == value){
                positionFinal = mid;
            } else if (array[mid] < value){
                low = mid + 1;
                mid = (low + high)/2;
            } else if (array[mid] > value) {
                high = mid - 1;
            }

        }
        System.out.println("A posição do: " +value+ " é igual a: " + positionFinal);
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int[8];
        System.out.println("digite números para um array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }
        System.out.println("digite o valor que você quer achar: ");
        int value = entrada.nextInt();

        binarySearch(array, value);





    }

}
