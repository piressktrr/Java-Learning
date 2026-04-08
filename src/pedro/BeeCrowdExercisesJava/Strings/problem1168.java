package pedro.BeeCrowdExercisesJava.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class problem1168 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String numero;

        int N = input.nextInt();
        ArrayList<String> lista;
        if (N < 1 || N >= 2000) {
            return;
        }

        for (int i = 0; i < N; i++) {
            lista = new ArrayList<>();
            int somaLed = 0;
            numero = input.next();
            if (Integer.parseInt(numero) >= 1000000000) return;

            for (int j = 0; j < numero.length(); j++) {
                lista.add(numero.charAt(j) + "");
                if (lista.get(j).equals("2") || lista.get(j).equals("3") ||  lista.get(j).equals("5") ) {
                    somaLed += 5;
                } else if (lista.get(j).equals("6") || lista.get(j).equals("9") || lista.get(j).equals("0")) {
                    somaLed += 6;
                } else if (lista.get(j).equals("4")) {
                    somaLed += 4;
                } else if (lista.get(j).equals("1")) {
                    somaLed += 2;
                } else if (lista.get(j).equals("7")) {
                    somaLed += 3;
                } else {
                    somaLed += 7;
                }
            }
            System.out.println(somaLed + " leds");
        }
    }
}
