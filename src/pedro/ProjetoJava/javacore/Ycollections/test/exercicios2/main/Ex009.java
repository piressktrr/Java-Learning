package pedro.ProjetoJava.javacore.Ycollections.test.exercicios2.main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex009 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> estoque = new LinkedHashMap<>(); // chave nome produto; valor quantidade

        adicionar(estoque, "pedro", 10);
        adicionar(estoque, "pedro", 10);
        listar(estoque);
    }

    public static void adicionar(Map<String, Integer> estoque, String nome, int quantidade) {
        if (nome.isBlank() || quantidade < 0) {
            throw new IllegalArgumentException("nome em branco ou quantidade < 0");
        }
        estoque.put(nome, estoque.getOrDefault(nome, 0) + quantidade);
    }








    public static void atualizar(Map<String, Integer> estoque, String nome, int quantidade) {
        if (nome.isBlank() || quantidade < 0) {
            throw new IllegalArgumentException("nome em branco ou quantidade < 0");
        }

        if (estoque.containsKey(nome)) {
            estoque.put(nome, quantidade);
        }
    }


    public static void remover(Map<String, Integer> estoque, String nome) {
        if (nome.isBlank() || estoque.isEmpty()) {
            throw new IllegalArgumentException("nome em branco");

        }
        estoque.remove(nome);
    }

    public static void listar(Map<String, Integer> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("estoque vazio");
            return;
        }

        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static void listarPorValor(Map<String, Integer> estoque, int quantidade) {
        if (estoque.isEmpty() || quantidade <= 0) {
            System.out.println("Estoque vazio ou quantidade menor igual a zero!");
            return;
        }

        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            if (entry.getValue() < quantidade) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
