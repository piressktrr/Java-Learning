package pedro.ProjetoAlgoritmos;

public class TestTentativaErro {
    static int[][] mapa = {
            {0, 1, 0, 0},
            {0, 1, 0, 1},
            {0, 0, 0, 1},
            {1, 0, 0, 0}, // [3][3]
            // 0 -> livre
            // 1 -> parede
    };

    static boolean resolver(int x, int y) {
        // x -> linha
        // y -> coluna
        if (x < 0 || y < 0 || x >= 4 || y >= 4) {
            return false;
        } // validaçao q n permite ser menor ou maior q o labirinto

        if (mapa[x][y] == 1) {
            return false;
        } // validaçao q n permite q o labiritinho comece em linha 1 coluna 1

        if (x == 3 && y == 3) {
            return true;
        } // validacao pra ver se a pos no labirinto ta certa

        mapa[x][y] = 1; // marca a tentativa de visita (1 para verdadeiro) (faz uma parede, q nem descrito la em cima)

        if (resolver(x+1, y) || resolver(x-1, y) ||
                resolver(x, y+1) || resolver(x, y-1))
            return true;

        mapa[x][y] = 0; // desfaz a marcação (erro → backtrack) (se nenhuma direçao der certo ele faz isso pro
        // algoritmo poder retornar
        return false;
    }

    public static void main(String[] args) {
        System.out.println(resolver(0,0));
    }
}
