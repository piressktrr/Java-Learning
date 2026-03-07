package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, workedHours;
        double receiveHours;

        number = input.nextInt();
        workedHours = input.nextInt();
        receiveHours = input.nextFloat();

        double SALARY = receiveHours * workedHours;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", SALARY));
    }
}
