package pedro.BeeCrowdExercisesJava.Beginners;

import java.io.IOException;
import java.util.Scanner;

public class problem1009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double valueSold = sc.nextDouble();

        double salaryFinal = salary + (valueSold * 0.15);
        System.out.println("TOTAL = R$ " + String.format("%.2f", salaryFinal));
    }
}
