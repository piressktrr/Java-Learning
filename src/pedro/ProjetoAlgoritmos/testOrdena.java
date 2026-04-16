package pedro.ProjetoAlgoritmos;

import java.util.Arrays;

public class testOrdena {
    public static void main(String[] args) {
        int [] array = new int[]{4,5,6,1,3,2};
        System.out.println(Arrays.toString(array));
        ordena(array, 6);

    }

    public static void ordena (int [] v, int n) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            int x = v[min];
            v[min] = v[i];
            v[i] = x;
        }
        System.out.println(Arrays.toString(v));
    }
}
