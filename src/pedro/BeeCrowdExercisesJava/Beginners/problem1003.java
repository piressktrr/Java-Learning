package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1003 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        int SOMA = A+B;

        System.out.println("SOMA = " + SOMA);
    }
}
