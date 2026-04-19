package pedro.ProjetoAlgoritmos.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTracking01 {
    static void encontrar(int[] nums, int alvo, int inicio, List<Integer> atual) {
        if (alvo == 0) {
            System.out.println(atual);
            return;
        }

        for (int i = inicio; i < nums.length; i++) {
            if (nums[i] <= alvo) {
                atual.add(nums[i]);
                encontrar(nums, alvo - nums[i], i + 1, atual);
                atual.remove(atual.size() - 1);

            }
        }

    }

    public static void main(String[] args) {
        List<Integer> listReceberArray = new ArrayList<>();
        int [] array = new int[]{3,1,2,4,5};
        encontrar(array, 6, 0, listReceberArray);

    }
}
