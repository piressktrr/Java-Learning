package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int PROD = a * b;

        System.out.println("PROD = " + PROD);

    }
}
