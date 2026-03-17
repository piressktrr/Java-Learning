package pedro.BeeCrowdExercisesJava.Beginners2;

import java.io.IOException;
import java.util.Scanner;

public class problem1047maisDificil {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int IHOUR = in.nextInt();
        int IMINUTE = in.nextInt();
        int FHOUR = in.nextInt();
        int FMINUTE = in.nextInt();

        if (IHOUR > 23 || FHOUR > 23 || IHOUR < 0 || FHOUR < 0) {
            return;
        } else if (IMINUTE < 0 || FMINUTE < 0 || IMINUTE >= 60 || FMINUTE >= 60) {
            return;
        }

        int DHOUR = 0;
        int DMINUTE = 0;

        IHOUR = (IHOUR * 60) + IMINUTE;
        FHOUR = (FHOUR * 60) + FMINUTE;

        int diff = FHOUR - IHOUR;

        if (diff <= 0) {
            diff += 1440;
            DHOUR = diff / 60;
            DMINUTE = diff % 60;
        } else {
            DHOUR = diff / 60;
            DMINUTE = diff % 60;
        }


        if (IHOUR == FHOUR && FMINUTE == IMINUTE) {
            DHOUR = 24;
        }

        if (DHOUR == 0 && DMINUTE < 1) {
            return;
        }

        System.out.println("O JOGO DUROU " + DHOUR + " HORA(S) E " + DMINUTE + " MINUTO(S)");

    }
}
