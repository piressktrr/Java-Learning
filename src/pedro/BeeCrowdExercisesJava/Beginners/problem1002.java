package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double A, n, R;
        n = 3.14159;
        R = Double.parseDouble(br.readLine());

        A = n * (Math.pow(R, 2));
        System.out.println("A=" + String.format("%.4f", A));

    }
}
