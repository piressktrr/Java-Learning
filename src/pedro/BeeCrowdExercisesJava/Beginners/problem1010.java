package pedro.BeeCrowdExercisesJava.Beginners;

import java.util.Scanner;

public class problem1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codeProduct1, unitsProduct1, codeProduct2, unitsProduct2;
        double priceUnitProduct1, priceUnitProduct2;


        codeProduct1 = input.nextInt();
        unitsProduct1 = input.nextInt();
        priceUnitProduct1 = input.nextDouble();
        double priceFinalProduct1 = unitsProduct1 * priceUnitProduct1;


        codeProduct2 = input.nextInt();
        unitsProduct2 = input.nextInt();
        priceUnitProduct2 = input.nextDouble();
        double priceFinalProduct2 = unitsProduct2 * priceUnitProduct2;

        System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f", priceFinalProduct1 + priceFinalProduct2));

    }
}
