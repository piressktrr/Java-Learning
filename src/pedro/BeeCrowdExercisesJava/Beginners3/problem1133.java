package pedro.BeeCrowdExercisesJava.Beginners3;

import java.util.Scanner;

public class problem1133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X =  input.nextInt();
        int Y =  input.nextInt();

        if (Y > X) {
            for (int a0 = X + 1; a0 < Y; a0++) {
                if (a0 % 5 == 2 || a0 % 5 == 3) {
                    System.out.println(a0);
                }
            }
        } else if (Y < X) {
            for (int a0 = Y + 1; a0 < X; a0++) {
                if (a0 > 0) {
                    if (a0 % 5 == 2 || a0 % 5 == 3) {
                        System.out.println(a0);
                    }
                }
            }
        }
    }
}
