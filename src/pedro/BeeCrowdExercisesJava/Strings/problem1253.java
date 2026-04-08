package pedro.BeeCrowdExercisesJava.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class problem1253 {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int nTestes, nShiftLetters;
        String str;
        ArrayList<String> listCifra;
        ArrayList<String> listAlfabeto = new ArrayList<>();

        nTestes = input.nextInt();

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alfabeto.length(); i++) {
            listAlfabeto.add(alfabeto.charAt(i) + "");
        }

        for (int i = 0; i < nTestes; i++) {
            listCifra = new ArrayList();
            str = input.next().toUpperCase();
            for (int j = 0; j < str.length(); j++) {
                listCifra.add(str.charAt(j) + "");
            }
            nShiftLetters = input.nextInt();
            if (nShiftLetters > 25) return;

            for (int y = 0; y < listCifra.size(); y++) {

            }
        }
    }
}
