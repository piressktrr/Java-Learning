package pedro.ProjetoJava.exerciciosRevisaoInternet;

public class exercicio017Internet {
    public static void main(String[] args) {
        String palavra = "Silent";
        String palavra2 = "Listen";
        int contadorCheckAnagrama = 0;
        int contadorPalavraPrincipal = 0;

        for (int i = 0; i < palavra.length(); i++) {
            contadorPalavraPrincipal++;
        }

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < palavra.length(); j++) {
                if (String.valueOf(palavra.toUpperCase().charAt(i)).equals(String.valueOf(palavra2.toUpperCase().charAt(j)))) {
                    contadorCheckAnagrama++;
                }
            }
        }

        if (contadorCheckAnagrama == contadorPalavraPrincipal) {
            System.out.println("As palavras: " + palavra + ", " + palavra2 + " - São um anagrama.");
        } else {
            System.out.println("As palavras: " + palavra + ", " + palavra2 + " - NÃO são um anagrama.");

        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
