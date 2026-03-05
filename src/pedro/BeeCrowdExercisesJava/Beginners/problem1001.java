package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem1001 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a, b, x;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        x = a + b;
        System.out.println("X"+" = "+x);
    }
}
