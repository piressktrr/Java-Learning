package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio05InternetBackOnThis {
    static void pyramidPattern (int n){
        int x = 0;
        for (int i = 1; i <= n; i++){
            x = i - 1;
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(" ");
                System.out.println("   ");
            }


            for (int j = 1; j <= x; j++){
                System.out.println(i);
                if (j == x){
                    break;
                } else if (j == x - 1){
                    System.out.print(j);
                }
            }

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to insert row's to print a pyramid number pattern: ");
        int pyramid = sc.nextInt();
        pyramidPattern(pyramid);
    }
}
