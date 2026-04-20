package pedro.ProjetoAlgoritmos.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class BackTrackingTest02 {
    public static class Solution {
        public List<List<Integer>> permutar(int[] nums) {
            List<List<Integer>> resultado = new ArrayList<>();
            backtrack(resultado, new ArrayList<>(), nums);
            return resultado;
        }


        private void backtrack(List<List<Integer>> resultado, List<Integer> temporal, int[] nums) {
            if (temporal.size() == nums.length) {
                // caso base: se a lista temporária tem o tamanho do array, achamos uma permutação
                resultado.add(new ArrayList<>(temporal));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                // Se o número já está na nossa lista atual, pulamos (para números únicos)
                if (temporal.contains(nums[i])) continue;

                // Escolha
                temporal.add(nums[i]);

                // Explorar (recursão)
                backtrack(resultado, temporal, nums);

                // Desfazer a escolha (Backtrack)
                temporal.remove(temporal.size() - 1);
            }


        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> permutaçoes = solution.permutar(array);

        System.out.println(permutaçoes);

    }

}
