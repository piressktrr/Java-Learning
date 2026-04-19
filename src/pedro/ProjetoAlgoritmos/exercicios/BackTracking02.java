package pedro.ProjetoAlgoritmos.exercicios;

import java.util.ArrayList;
import java.util.List;

public class BackTracking02 {
    static int[][] mapa = {
            {0, 1, 0, 0},
            {0, 1, 0, 1},
            {0, 0, 0, 1},
            {1, 0, 0, 0},
    };

    static boolean resolver(int x, int y, List<String> caminho) {

        if (x < 0 || y < 0 || x >= 4 || y >= 4) {
            return false;
        }

        if (mapa[x][y] == 1) {
            return false;
        }

        if (x == 3 && y == 3) {
            caminho.add(x + " - " + y);
            return true;
        }

        mapa[x][y] = 1;
        // adicionar o caminho add aqui antes de avançar

        if (resolver(x+1, y, caminho) || resolver(x-1, y, caminho) ||
                resolver(x, y+1,    caminho) || resolver(x, y-1, caminho)) {
            caminho.add(x + " - " + y);
            return true;
        }

        mapa[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {
        List<String> caminho = new ArrayList<String>();
        System.out.println("Labirinto achou saida?: ");
        System.out.println(resolver(0,0, caminho));
        System.out.println("Coordenadas percorridas!!: ");
        for (int i = caminho.size() - 1; i >= 0 ; i--) {
            System.out.print(caminho.get(i) + ", ");
        }
    }
}
