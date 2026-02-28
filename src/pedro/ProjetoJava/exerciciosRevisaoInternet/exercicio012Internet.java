package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio012Internet {

    static void rotateArray(int [] array, int rotate){
        int [] temporarioRotNum = new int[array.length];
        int contadorLoopPrincipal = 0;
        int contadorLoopSecundario = 0;
        for(int i=rotate; i<array.length; i++){

            temporarioRotNum[contadorLoopPrincipal] = array[i];
            contadorLoopPrincipal++;

            if (i == array.length-1){
                for(int j = contadorLoopPrincipal; j<array.length; j++){
                    temporarioRotNum[contadorLoopPrincipal] = array[contadorLoopSecundario];
                    contadorLoopSecundario++;
                    contadorLoopPrincipal++;
                }
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("The rotation of array in "+ rotate +" numbers is: " + Arrays.toString(temporarioRotNum));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numbers = new int [6];
        System.out.println("Write numbers for a array and the position you want which them rotates: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = entrada.nextInt();
        }
        System.out.println("Now, enter the number you want to rotate: ");
        int rotate = entrada.nextInt();
        System.out.println("The normal array is: "+ Arrays.toString(numbers));
        rotateArray(numbers, rotate);

    }
}
