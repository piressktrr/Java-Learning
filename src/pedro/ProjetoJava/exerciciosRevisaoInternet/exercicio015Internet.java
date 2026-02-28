package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio015Internet {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra, para checar se é palíndroma ou não: ");
        String palavra = entrada.nextLine();


            String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        System.out.println("=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-");
            if (palavra.equals(palavraInvertida)) {
                System.out.println("A palavra " + palavra + " é uma palavra palíndroma");
            } else {
                System.out.println("A palavra " + palavra + " não é uma palavra palíndroma");
        }

        int esquerda = 0;
        int direita = palavra.length() - 1;
        boolean trueOrFalse = false;
        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                trueOrFalse = false;
            } else {
                trueOrFalse = true;
            }

            esquerda++;
            direita--;
            if (trueOrFalse) {
                System.out.println("A palavra: " + palavra + " é palíndroma!");
                break;
            }
        }
        if (!trueOrFalse) {
            System.out.println("A palavra: " + palavra + " não é palíndroma!");

        }


    }

}
