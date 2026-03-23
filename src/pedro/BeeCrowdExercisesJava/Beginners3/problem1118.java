package pedro.BeeCrowdExercisesJava.Beginners3;

import java.util.Scanner;

public class problem1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, media;
        int novoCalculo = 0;

        while (novoCalculo != 2) {
            x = scan.nextDouble();
            if (x < 0 || x > 10) {
                System.out.println("nota invalida");

                x = scan.nextDouble();
            }

            y = scan.nextDouble();
            if (y < 0 || y > 10) {
                System.out.println("nota invalida");
                y = scan.nextDouble();
            }

            if (x >= 0 && y >= 0 && x <= 10 && y <= 10) {
                media = (x + y) / 2;
                System.out.println("media = " + String.format("%.2f", media));
                System.out.println("novo calculo (1-sim 2-nao) ");
                novoCalculo = scan.nextInt();
                if (novoCalculo == 2) {
                    break;
                }

            }
        }
    }
}
