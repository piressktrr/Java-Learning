package pedro.BeeCrowdExercisesJava.Beginners3;

import java.util.Scanner;

public class problem1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char type = ' ';
        int totalAnimals = 0;
        double rabbits = 0;
        double rats = 0;
        double frogs = 0;
        int cases =  input.nextInt();
        for (int i = 0; i < cases; i++) {
            int amount = input.nextInt();
            if (1 > amount || amount > 15) {
                return;
            }
            String temp = input.next();
            type = temp.charAt(0);
            if (type == 'R') {
                rats += amount;
            } else if (type == 'S') {
                frogs += amount;
            } else  if (type == 'C') {
                rabbits += amount;
            } else {
                return;
            }
            totalAnimals += amount;
        }
        System.out.println("Total: " + totalAnimals + " cobaias");
        System.out.println("Total de coelhos: " + String.format("%.0f", rabbits));
        System.out.println("Total de ratos: " + String.format("%.0f", rats));
        System.out.println("Total de sapos: " + String.format("%.0f", frogs));
        System.out.println("Percentual de coelhos: " + String.format("%.2f", (rabbits  * 100) / totalAnimals) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", (rats  * 100) / totalAnimals) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", (frogs * 100) / totalAnimals) + " %");

    }
}
