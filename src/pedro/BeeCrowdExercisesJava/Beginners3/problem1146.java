package pedro.BeeCrowdExercisesJava.Beginners3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class problem1146 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int X = input.nextInt();
            if (X <= 0) break;

            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    builder.append(i).append("\n");

                } else {
                    builder.append(i).append(" ");
                }
            }
            out.write(builder.toString());
        }

        out.flush();
    }
}
