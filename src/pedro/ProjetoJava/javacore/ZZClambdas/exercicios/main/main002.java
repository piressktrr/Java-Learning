package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.main;

import java.util.ArrayList;
import java.util.List;

public class main002 {

    public static double somarTotal(List<? extends Number> numeros ) {
        double resultado = 0.0;
        for (Number numero : numeros) {
            resultado += numero.doubleValue();
        }

        return resultado;

        // uso de extends Number somente para a leitura da lista, pois eu nao sei o tipo que vai vir
        // entao para garantir a integridade é melhor so ler

    }

    public static void adicionarInteiros(List<? super Integer> lista, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            lista.add(i);
        }
        // uso do super Integer pois eu quero adicionar elementos, mas pode vir number, object e etc
        // entao para garantir a integridade é melhor so adicionar
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3, 4, 5);
        List<Double> lista2 = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        List<Number> lista3 = List.of(1, 2, 3, 4, 5);
        List<Number> lista4 = new ArrayList<>();
        List<Integer> lista5 = new ArrayList<>();

        System.out.println("Lista 1: " + somarTotal(lista1));
        System.out.println("Lista 2: " + somarTotal(lista2));
        System.out.println("Lista 3: " + somarTotal(lista3));

        adicionarInteiros(lista4, 3);
        adicionarInteiros(lista5, 5);

        System.out.println("_--------------------------_");
        System.out.println("Lista 4: " + somarTotal(lista4));
        System.out.println("Lista 5: " + somarTotal(lista5));
    }
}
