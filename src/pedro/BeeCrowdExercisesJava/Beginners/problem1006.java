package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1006 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double A,B,C;


        A = input.nextDouble() * 2;
        B = input.nextDouble() * 3;
        C = input.nextDouble() * 5;

        if (A < 0 || B < 0 || C < 0) {
            throw new IllegalArgumentException("A or B or C are negative");
        }
        double MEDIA = (A+B+C)/10;
        System.out.println("MEDIA = " + String.format("%.2f", MEDIA));

    }
}
