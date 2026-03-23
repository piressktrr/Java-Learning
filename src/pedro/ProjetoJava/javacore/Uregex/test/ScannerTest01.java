package pedro.ProjetoJava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Goku, Gohan, Vegeta, Bulma, 200, true";
        Scanner scan = new Scanner(texto);
        String[] nomes = texto.split(", "); // cria os nomes dentro do array delimitados pela virgula
        scan.useDelimiter(", ");
        while (scan.hasNext()) { // se tem proximo, o while continua
            if (scan.hasNextInt()) {
                int i =  scan.nextInt();
                System.out.println("Int: " + i);
            } else if (scan.hasNextBoolean()) {
                System.out.println("Boolean: " + scan.nextBoolean());
            } else {
                System.out.println(scan.next());
            }
        }
    }
}
