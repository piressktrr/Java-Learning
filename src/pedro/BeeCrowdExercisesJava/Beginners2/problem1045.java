package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.Scanner;

public class problem1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double tempMIN = Math.min(Math.min(a, b), c);
        double tempMAX = Math.max(Math.max(a, b), c);
        double tempMED = a + b + c - tempMIN - tempMAX;

        a = tempMAX;
        b = tempMED;
        c = tempMIN;

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException();
        }
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (a * a  > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c && c == a) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b && c != a && c != b || a == c && b != a && b != c || b == c && a != b && a != c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
