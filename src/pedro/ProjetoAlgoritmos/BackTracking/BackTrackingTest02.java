package pedro.ProjetoAlgoritmos.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class BackTrackingTest02 {
    public static class Solution {
        List<List<Integer>> lista = new ArrayList<>();
        int [] array;

        public List<List<Integer>> permutar(int[] array) {
            this.array = array;
            List<Integer> list = new ArrayList<Integer>();

            backtrack(0, list);

            System.out.println(list);
            return lista;
        }

        public void backtrack(int index, List<Integer> list) {
            if (list.size() == array.length) {
                lista.add(new ArrayList<>(list));
                return;
            }

            list.add(array[index]);
            backtrack(index+1, list);

            list.remove(list.size() - 1);
            backtrack(index+1, list);

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{1,2,3};
        solution.permutar(array);


    }

}
