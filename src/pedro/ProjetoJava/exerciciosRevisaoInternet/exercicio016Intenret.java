package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio016Intenret {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String palavra = entrada.nextLine();

        String palavraInvert = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavraInvert);
    }
}
