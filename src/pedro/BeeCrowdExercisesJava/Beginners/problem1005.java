package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1005 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        float A = input.nextFloat();
        float B = input.nextFloat();

        if (A < 0 || B < 0 || A > 10 || B > 10){
            throw new IOException("Invalid number");
        }

        double media = (A + B) / 2;
        System.out.println("MEDIA = " + String.format("%.5f", media));

    }
}
