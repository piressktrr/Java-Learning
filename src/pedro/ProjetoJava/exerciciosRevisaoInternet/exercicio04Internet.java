package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio04Internet {

    static void fibonnaciFormula (int n) {
        int valorA = 0;
        int valorB = 0;
        int fibonnaci = 1;
        int valorResultado = 0;
        for (int i = 0; i < n; i++) {

            valorA = valorB;
            valorB = fibonnaci;
            System.out.print(fibonnaci + " + ");
            valorResultado += fibonnaci;
            fibonnaci = fibonnaci + valorA;

        }
        System.out.println("\n-----------------------------");
        System.out.println(valorResultado);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite até que numero você quer a sequencia de fibonnaci: ");
        int n = sc.nextInt();
        fibonnaciFormula(n);
    }
}
