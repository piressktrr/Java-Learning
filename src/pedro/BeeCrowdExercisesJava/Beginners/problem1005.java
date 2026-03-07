package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1005 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble() * 3.5;
        double B = input.nextDouble() * 7.5;

        if (A < 0 || B < 0 ){
            throw new IOException("Invalid number");
        }

        double media = (A + B) / 11;
        System.out.println("MEDIA = " + String.format("%.5f", media));

    }
}
