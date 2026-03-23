package pedro.BeeCrowdExercisesJava.Beginners3;

import java.util.Scanner;

public class problem1180 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N < 1 || N > 1000)
            return;

        double [] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextDouble();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = input.nextDouble();
                }
            }
        }

        System.out.println("Menor valor: " + Math.min(arr[0], arr[1]));
    }
}
