package pedro.ProjetoAlgoritmos.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class BackTrackingTest01 {
    public static class Solution {
        List<List<Integer>> lista = new ArrayList<>();
        int[] nums;


        public List<List<Integer>> subconjuntos(int[] nums) {
            this.nums = nums;
            List<Integer> current = new ArrayList<>();
            // current é uma lista mútavel que vai sendo modificada ao longo de toda a execução. (ela ficara vazia)
            // por isso que tem que criar uma copia dela, pra congelar ela e salvar

            backtrack(0, current);
            System.out.println(lista);
            return lista;
        }

        public  void backtrack(int index, List<Integer> current) {
            // aqui é o caso BASE, chega ao fim do array
            if (index == nums.length) {
                lista.add(new ArrayList<>(current));
                return;
            }

            // primeiro ramo: incluir nums[index]
            // mergulha nesse elemento até ser totalmente explorado antes de continuar
            current.add(nums[index]);
            backtrack(index + 1, current);

            // backtrack: desfazer a escolha
            // desfaz a inclusão de cima para explorar o outro ramo que nao está incluido o numero (antes da adiçao)
            current.remove(current.size() - 1);

            // segundo ramo: nao incluir nums[index]
            // explora toda a árvore de decisoes com o current limpo, sem o elemento adicionado em current.add
            // avança pro proximo elemento mas com um current diferente do primeiro ramo
            backtrack(index + 1, current);

        }

        // ideia -> incluir o elemento atual // ou nao incluir o elemento atual
        // faz isso até esgotar o array, e ir fazendo um subconjunto de cada caminho
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{1,2,3};
        solution.subconjuntos(array);
    }

    // void backtrack(estado_atual, parâmetros) {
    //    // 1. CASO BASE: estado completo → registra solução
    //    if (condicao_de_parada) {
    //        registrar(estado_atual);
    //        return;
    //    }
    //
    //    // 2. Para cada escolha possível nesse ponto:
    //    for (cada opcao valida) {
    //        // 3. FAZ a escolha
    //        estado_atual.adiciona(opcao);
    //
    //        // 4. EXPLORA recursivamente
    //        backtrack(proximo_estado, ...);
    //
    //        // 5. DESFAZ a escolha (backtrack)
    //        estado_atual.remove(opcao);
    //    }
    //}
}
